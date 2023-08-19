def foo(options: List[Option[Int]]): List[Int] = {
    options.collect{case e if e.nonEmpty => e.get}
}