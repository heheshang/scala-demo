package com.ssk.chapter27.part4

import com.ssk.chapter27.Food

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-04-01-上午 11:10
  * @version v1.0
  */
trait FoodCategories {

	case class FoodCateGory(name: String, foods: List[Food])

	def allCategories: List[FoodCateGory]
}
