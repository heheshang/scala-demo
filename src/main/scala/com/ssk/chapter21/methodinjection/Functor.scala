package com.ssk.chapter21.methodinjection

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-29-下午 3:29
  * @version v1.0
  */
trait Functor[F[_]] {

	def map[A, B](fa: F[A])(f: A ⇒ B): F[B]
}
