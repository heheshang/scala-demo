package com.ssk.chapter27.part4

import com.ssk.chapter27.{Apple, Food}

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-04-01-上午 11:16
  * @version v1.0
  */
trait SimpleFoods {

	object Pear extends Food("Pear")

	def allFoods = List(Apple, Pear)

	def allCategories = Nil
}
