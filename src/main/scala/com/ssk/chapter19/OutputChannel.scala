package com.ssk.chapter19

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-28-下午 3:58
  * @version v1.0
  */
trait OutputChannel[-T] {

	def write(x: T)
}
