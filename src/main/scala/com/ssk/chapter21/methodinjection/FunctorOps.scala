package com.ssk.chapter21.methodinjection


/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-29-下午 3:31
  * @version v1.0
  */
//final class FunctorOps[F[_], A](l: F[A])(implicit functor: Functor[F]) {
//
//	def map[A, B](f: A ⇒ B): F[B] = functor.map(l)(f)
//}
//
//
//object FunctorOps {
//	implicit val jListFunctor: Functor[List] = new Functor[List] {
//		override def map[A, B](fa: List[A])(f: A ⇒ B): List[B] = {
//			for (a <- fa) yield f(a)
//		}
//	}
//
//	// 将List[E]转换为FunctorOps的隐式转换方法
//	implicit def jlistToFunctorOps[E](jl: List[E]): FunctorOps[List, E] = new FunctorOps[List, E](jl)
//}