def foo(list: List[Int]): Int = {
    list.find(e => e % 3 == 0).map(e => e * 2).getOrElse(0)
}