package com.ssk.chapter27

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-04-01-上午 9:30
  * @version v1.0
  */
object Apple extends Food("Apple")

object Orange extends Food("Orange")

object Cream extends Food("Cream")

object Sugar extends Food("Sugar")

object FruitSalad extends Recipe(
	"fruit salad",
	List(Apple, Orange, Cream, Sugar),
	"Stir it all together")


