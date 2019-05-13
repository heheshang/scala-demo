package com.ssk.newbook.chapter1

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-04-01-下午 2:33
  * @version v1.0
  */
class Cafe {

	def buyCoffee(cc: CreditCard): (Coffee, Charge) = {
		val cup = new Coffee()
		(cup, Charge(cc, cup.price))
	}

	def bufCoffess(cc: CreditCard, n: Int): (List[Coffee], Charge) = {
		val purchases: List[(Coffee, Charge)] = List.fill(n)(buyCoffee(cc))
		val (coffees, charges) = purchases.unzip
		(coffees, charges.reduce((c1, c2) ⇒ c1.combine(c2)))
	}

	def coalesce(charges: List[Charge]): List[Charge] =
		charges.groupBy(_.cc).values.map(_.reduce(_ combine _)).toList
}
