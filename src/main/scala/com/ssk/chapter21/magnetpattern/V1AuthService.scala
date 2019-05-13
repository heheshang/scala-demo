package com.ssk.chapter21.magnetpattern

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-29-下午 3:10
  * @version v1.0
  */
trait V1AuthService extends AuthService {

}

object V1AuthService {

	case class V1AuthRequest()

	case class V1AuthResponse()

	implicit def toAuthMagent(p: V1AuthRequest): AuthMagnet {type Result = V1AuthResponse} =
		new AuthMagnet {
			override type Result = V1AuthResponse

			override def apply(): Result = {
				println("这是 V1 Auth Service")
				V1AuthResponse()
			}
		}


}