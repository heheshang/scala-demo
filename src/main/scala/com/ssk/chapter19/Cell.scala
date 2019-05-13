package com.ssk.chapter19

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-28-下午 2:46
  * @version v1.0
  */
class Cell[T](init: T) {
	private[this] var current = init

	def get = current

	def set(x: T) {
		current = x
	}
}
