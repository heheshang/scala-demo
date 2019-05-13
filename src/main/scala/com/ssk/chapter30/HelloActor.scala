package com.ssk.chapter30

import akka.actor.{Actor, ActorSystem, Props}

import scala.io.StdIn


/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-04-01-下午 1:45
  * @version v1.0
  */
class HelloActor extends Actor {
	override def receive: Receive = {
		case "张三" ⇒ println("你好张三")
		case "志勇" ⇒ println("你好SB")
		case "stop" ⇒ {
			//停止自己的actorRef
			context.stop(self)
			//关闭ActorSystem，即关闭其内部的线程池（ExcutorService）
			context.system.terminate()
		}
	}
}


object HelloActor {
	// 创建线程池对象MyFactory ,用来创建actor的对象
	private val MyFactory = ActorSystem("myFactory")
	/**
	  * 通过MyFactory.actorOf 方法来创建一个actor ,
	  * 注意，props方法的第一个参数需要传递我们自定义的HelloActor类，第二个参数给actor起个名字
	  */
	private val helloActorRef = MyFactory.actorOf(Props[HelloActor], "helloActor")

	def main(args: Array[String]): Unit = {
		var flag = true

		while (flag) {
			//接收用户输入的字符串
			print("请输入你想要发送的消息：")

			val consoleLine: String = StdIn.readLine()
			// 使用helloActorRef来给自己发送消息，helloActorRef有一个叫做感叹号("!")的方法来发送消息
			helloActorRef ! consoleLine

			if (consoleLine.equals("stop")) {
				flag = false
				println("程序即将结束")
			}

			/**
			  * 为了不让while的运行速度在receive方法之上，我们可以让他休眠0.1秒
			  */
			Thread.sleep(100)
		}
	}
}