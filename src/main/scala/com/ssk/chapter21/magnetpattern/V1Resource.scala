package com.ssk.chapter21.magnetpattern

import com.ssk.chapter21.magnetpattern.V1AuthService.V1AuthRequest

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-29-下午 3:17
  * @version v1.0
  */
trait V1Resource extends V1AuthService {
	def serv() = {
		val p = V1AuthRequest()
		val response = auth(p)
		println(s"v1 resource response: $response")
	}
}
