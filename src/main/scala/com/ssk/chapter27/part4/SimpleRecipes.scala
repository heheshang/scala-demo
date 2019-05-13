package com.ssk.chapter27.part4

import com.ssk.chapter27.{Apple, Recipe}

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-04-01-上午 11:15
  * @version v1.0
  */
trait SimpleRecipes {
	this: SimpleFoods ⇒

	object FruitSalad extends Recipe(
		"fruit salad",
		List(Apple, Pear),
		"Mix it all together")

	def allRecipes = List(FruitSalad)


}
