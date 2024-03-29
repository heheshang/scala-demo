
abstract class Expr

case class Var(name: String) extends Expr

case class Number(num: Double) extends Expr

case class UnOp(operator: String, arg: Expr) extends Expr

case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

def simplifyTop(expr: Expr): Expr = expr match {
	case UnOp("=", UnOp("-", e)) ⇒ e
	case BinOp("+", e, Number(0)) ⇒ e
	case BinOp("*", e, Number(1)) ⇒ e

	case _ ⇒ expr

}

val v = Var("x")

val op = BinOp("+", Number(1), v)


v.name


op.left


println(op)


op.right == Var("x")

simplifyTop(UnOp("-", UnOp("-", Var("x"))))