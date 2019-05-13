package com.ssk.chapter21

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-29-上午 11:21
  * @version v1.0
  *          在scala2.10后提供了隐式类，可以使用implicit声明类，但是需要注意以下几点：
  * 1.其所带的构造参数有且只能有一个
  * 2.隐式类必须被定义在类，伴生对象和包对象里
  * 3.隐式类不能是case class（case class在定义会自动生成伴生对象与2矛盾）
  * 4.作用域内不能有与之相同名称的标示符
  */
object Stringutils {

	implicit class StirngImprovement(val s: String) {
		def increment = s.map(x ⇒ (x + 1).toChar)
	}

}

object Main extends App {

	import com.ssk.chapter21.Stringutils._

	println("mobin".increment)
}

/**
  * 隐式转换的时机：
  * *
  *1.当方法中的参数的类型与目标类型不一致时
  * *
  *
  *2.当对象调用类中不存在的方法或成员时，编译器会自动将对象进行隐式转换
  * *
  * 隐式解析机制
  * 即编译器是如何查找到缺失信息的，解析具有以下两种规则：
  *1.首先会在当前代码作用域下查找隐式实体（隐式方法  隐式类 隐式对象）
  * *
  *2.如果第一条规则查找隐式实体失败，会继续在隐式参数的类型的作用域里查找
  * 类型的作用域是指与该类型相关联的全部伴生模块，一个隐式实体的类型T它的查找范围如下：
  * （1）如果T被定义为T with A with B with C,那么A,B,C都是T的部分，在T的隐式解析过程中，它们的伴生对象都会被搜索
  * （2）如果T是参数化类型，那么类型参数和与类型参数相关联的部分都算作T的部分，比如List[String]的隐式搜索会搜索List的
  * 伴生对象和String的伴生对象
  * （3） 如果T是一个单例类型p.T，即T是属于某个p对象内，那么这个p对象也会被搜索
  * （4） 如果T是个类型注入S#T，那么S和T都会被搜索
  * *
  * 隐式转换的前提：
  *1.不存在二义性（如例1）
  * *
  *2.隐式操作不能嵌套使用（如 convert1(covert2(x))）+y
  * *
  *3.代码能够在不使用隐式转换的前提下能编译通过，就不会进行隐式黑铁
  */