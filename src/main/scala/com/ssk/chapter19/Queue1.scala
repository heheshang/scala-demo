package com.ssk.chapter19

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-28-下午 2:20
  * @version v1.0
  */
trait Queue1[+T] {

	def head: T

	def tail: Queue1[T]

	def append[R >: T](x: R): Queue1[R]
}

object Queue1 {

	def apply[T](xs: T*): Queue1[T] = new Queue1Impl[T](xs.toList, Nil)

	private class Queue1Impl[T](
		                           private val leading: List[T],
		                           private val trailing: List[T]
	                           ) extends Queue1[T] {

		private def mirror =
			if (leading.isEmpty)
				new Queue1Impl(trailing.reverse, Nil)
			else
				this

		override def head: T = mirror.leading.head

		override def tail: Queue1[T] = {
			val q = mirror
			new Queue1Impl(q.leading.tail, q.trailing)
		}

		override def append[R >: T](x: R): Queue1[R] = new Queue1Impl[R](leading, x :: trailing)
	}


	private val value = new Queue1Impl(List(new Apple, new Fruit), List(new Orange))

	println(value.head)
}

class Fruit {}

class Apple extends Fruit {}

class Orange extends Fruit {}
