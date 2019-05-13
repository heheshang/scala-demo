package com.ssk.chapter19

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-28-下午 4:40
  * @version v1.0
  */
class Publication(val title: String)

class Books(title: String) extends Publication(title)

object Library {
	val books: Set[Books] = Set(
		new Books("scala"),
		new Books("java")
	)


	def printBooksList(info: Books ⇒ AnyRef): Unit = {
		for (book <- books) {
			println(info(book))
		}
	}
}

object Customer extends App {
	def getTitle(p: Publication): String = p.title

	Library.printBooksList(getTitle)
}

