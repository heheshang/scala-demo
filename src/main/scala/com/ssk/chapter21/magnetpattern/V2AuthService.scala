package com.ssk.chapter21.magnetpattern

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-29-下午 3:10
  * @version v1.0
  */
trait V2AuthService extends AuthService {

}

object V2AuthService {

	case class V2AuthRequest()

	case class V2AuthResponse()

	implicit def toAuthMagent(p: V2AuthRequest): AuthMagnet {type Result = V2AuthResponse} =
		new AuthMagnet {
			override type Result = V2AuthResponse

			override def apply(): Result = {
				println("这是 V2 Auth Service")
				V2AuthResponse()
			}
		}


}