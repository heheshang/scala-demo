package com.ssk.chapter20

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-28-下午 5:03
  * @version v1.0
  */
trait Abstract {
	type T

	def transform(x: T): T

	val initial: T
	var current: T
}
