package com.ssk.chapter21

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-29-上午 11:09
  * @version v1.0
  */
//通过隐式转换，使对象能调用类中本不存在的方法
//编译器在rabbit对象调用时发现对象上并没有wantLearning方法，此时编译器就会在作用域范围内查找能使其编译通过的隐式视图，
// 找到learningType方法后，编译器通过隐式转换将对象转换成具有这个方法的对象，之后调用wantLearning方法
//
//可以将隐式转换函数定义在伴生对象中，在使用时导入隐式视图到作用域中即可（如例4的learningType函数）
//
//还可以将隐式转换函数定义在凶对象中，同样在使用时导入作用域即可，如例4
class SwingType {
	def wantLearned(sw: String) = println("兔子已经学会了" + sw)
}
package swimmingPage {

	object swimming {
		implicit def learningType(s: AminalType) = new SwingType
	}

}

class AminalType {

}

object AminalType extends App {
	val rabbit = new AminalType

	import com.ssk.chapter21.swimmingPage.swimming._

	rabbit.wantLearned("breaststroke") //蛙泳
}
