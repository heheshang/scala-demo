package com.ssk.chapter27

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-04-01-上午 9:28
  * @version v1.0
  */
class Recipe(val name: String,
             val ingredients: List[Food],
             val instructions: String) {
	override def toString: String = name
}
