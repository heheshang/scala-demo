package com.atguigu.chapter06.oop

object PropertyDemo {
	def main(args: Array[String]): Unit = {
		val p1 = new Person3
		println(p1.Name) //Null
		println(p1.address) //String类型
		println("=====================")
		val a = new A
		println(a.var1) // null 还是 ""
		println(a.var2) // 0
		println(a.var3) // 0.0
		println(a.var4) //false

		println("============= =")
		//创建两个对象 跟java 一样 创建两个不同的对象
		var worker1 = new Worker
		worker1.name = "jack"
		var worker2 = new Worker
		worker2.name = "tom"
		println(worker1.name)
		println(worker2.name)
	}
}

class Person3 {
	var age: Int = 10 //给属性赋初值，省略类型，会自动推导
	var sal = 8090.9
	var Name = null // Name 是什么类型
	var address: String = null //ok
}

class A {
	var var1: String = _ // null
	var var2: Byte = _ // 0
	var var3: Double = _ //0.0
	var var4: Boolean = _ //false
}

class Worker {
	var name = ""
}


