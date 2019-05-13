def person(implicit name: String) = name

implicit val p = "mobin"
person(p)
person(p)
//因为将p变量标记为implicit，所以编译器会在方法省略隐式参数的情况下去搜索作用域内的隐式值作为缺少参数。
//但是如果此时你又在REPL中定义一个隐式变量，再次调用方法时就会报错
implicit val p1 = "mobin1"

person(p1)

//person
// 将整数转换成字符串类型
def foo(msg: String) = println(msg)
//foo(100)

implicit def intToString(x: Int) = x.toString

foo(100)


