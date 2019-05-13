package com.ssk.chapter27.part4

import com.ssk.chapter27.{Food, Recipe}

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-04-01-上午 11:30
  * @version v1.0
  */
object StudentDatabase extends Database {
	override def allFoods: List[Food] = ???

	override def allRecipes: List[Recipe] = ???

	override def allCategories: List[StudentDatabase.FoodCateGory] = ???
}
