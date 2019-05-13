package com.ssk.chapter19

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-28-下午 2:01
  * @version v1.0
  */
class Queue[T] private(private val leading: List[T],
                       private val trailing: List[T]) {

	//	def this() = this(Nil, Nil)

	//	def this(elems: T*) = this(elems.toList, Nil)

	private def mirror =
		if (leading.isEmpty)
			new Queue(trailing.reverse, Nil)
		else
			this

	def head = mirror.leading.head

	def trail = {
		val q = mirror
		new Queue(q.leading.tail, q.trailing)
	}

	def append(x: T) = {
		new Queue(leading, x :: trailing)
	}
}


object Queue {
	def apply[T](xs: T*) = new Queue[T](xs.toList, Nil)
}