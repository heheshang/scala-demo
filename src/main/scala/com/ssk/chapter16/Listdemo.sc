val fruit = List("apples", "oranges", "pears")

//val List(a,b,c) = fruit

val a :: b :: rest = fruit

def isSort(xs: List[Int]): List[Int] = xs match {
	case List() ⇒ List()
	case x :: xs1 ⇒ insert(x, isSort(xs1))

}

def insert(x: Int, xs: List[Int]): List[Int] = xs match {
	case List() ⇒ List(x)
	case y :: ys ⇒ if (x < y) x :: xs else y :: insert(x, ys)
}

def msort[T](less: (T, T) ⇒ Boolean)(xs: List[T]): List[T] = {

	def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
		case (Nil, _) ⇒ ys
		case (_, Nil) ⇒ xs
		case (x :: xs1, y :: ys1) ⇒
			if (less(x, y)) x :: merge(xs1, ys)
			else y :: merge(xs, ys1)
	}

	val n = xs.length / 2
	if (n == 0) xs
	else {
		val (ys, zs) = xs splitAt (n)
		merge(msort(less)(ys), msort(less)(zs))
	}

}

msort((x: Int, y: Int) ⇒ x < y)(List(5, 7, 1, 3))


List.range(1, 5)

List.range(1, 10) flatMap (i ⇒ {
	println(i)
	List.range(1, i)
} map {

	(j ⇒ {
		println("map", i, j)
		(i, j)
	})

})


val tuple = List(1, 2, 3, 4, 5) partition (_ % 2 == 0)
tuple.productIterator.foreach(i ⇒ println(i))