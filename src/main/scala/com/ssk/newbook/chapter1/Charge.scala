package com.ssk.newbook.chapter1

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-04-01-下午 2:34
  * @version v1.0
  */
case class Charge(cc: CreditCard, amount: Double) {
	def combine(other: Charge): Charge =
		if (cc == other.cc)
			Charge(cc, amount = +other.amount)
		else
			throw new Exception("Cant't combine charges to different cards")
}
