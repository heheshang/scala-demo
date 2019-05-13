package com.ssk.chapter20

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-28-下午 5:05
  * @version v1.0
  */
class Concrete extends Abstract {
	override type T = String

	override def transform(x: String): String = x + x

	override val initial: String = "hi"
	override var current: String = initial
}
