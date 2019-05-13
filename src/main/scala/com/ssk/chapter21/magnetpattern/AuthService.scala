package com.ssk.chapter21.magnetpattern

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-29-下午 3:09
  * @version v1.0
  */
trait AuthService {
	def auth(am: AuthMagnet): am.Result = am()
}
