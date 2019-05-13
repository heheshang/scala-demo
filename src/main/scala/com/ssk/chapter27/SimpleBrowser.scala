package com.ssk.chapter27

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-04-01-上午 9:42
  * @version v1.0
  */
object SimpleBrowser {
	def recipeUsing(food: Food) =
		SimpleDatabase.allRecipes.filter(recipe ⇒ recipe.ingredients.contains(food))
}
