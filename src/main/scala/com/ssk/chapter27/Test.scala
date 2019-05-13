package com.ssk.chapter27

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-04-01-上午 9:44
  * @version v1.0
  */
object Test extends App {
	val apple = SimpleDatabase.foodNamed("Apple").get
	println(apple)
	SimpleBrowser.recipeUsing(apple)

	def displayCategory(category: SimpleDatabase.FoodCategory) {
		println(category)
	}
}
