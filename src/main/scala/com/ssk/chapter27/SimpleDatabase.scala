package com.ssk.chapter27

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-04-01-上午 9:35
  * @version v1.0
  */
object SimpleDatabase {
	def allFoods = List(Apple, Orange, Cream, Sugar)

	def foodNamed(name: String): Option[Food] = allFoods.find(_.name == name)

	def allRecipes: List[Recipe] = List(FruitSalad)

	case class FoodCategory(name: String, foods: List[Food])

	private var categories = List(
		FoodCategory("fruits", List(Apple, Orange)),
		FoodCategory("misc", List(Cream, Sugar)))

	def allCategories = categories
}
