package com.ssk.chapter27.part5

import com.ssk.chapter27.part4.{Database, SimpleDatabase, StudentDatabase}

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-04-01-上午 11:28
  * @version v1.0
  */
object GotApples {
	def main(args: Array[String]): Unit = {
		val db: Database = if (args(0) == "student")
			StudentDatabase
		else
			SimpleDatabase


	}
}
