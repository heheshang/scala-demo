package com.ssk.chapter27.part4

import com.ssk.chapter27.{Food, Recipe}

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-04-01-上午 11:12
  * @version v1.0
  */
abstract class Database extends FoodCategories {

	def allFoods: List[Food]

	def allRecipes: List[Recipe]

	def foodNamed(name: String) =
		allFoods.find(f ⇒ f.name == name)

}
