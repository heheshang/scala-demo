package com.ssk.chapter15

/**
  * @author ssk www.8win.com Inc.All rights reserved
  * @date 2019-03-26-下午 3:13
  * @version v1.0
  */
abstract class Expr

case class Var(name: String) extends Expr

case class Number(num: Double) extends Expr

case class UnOp(operator: String, arg: Expr) extends Expr

case class BinOp(operator: String, left: Expr, right: Expr) extends Expr



