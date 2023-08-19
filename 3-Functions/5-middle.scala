def middle[T](data: Iterable[T]): T = {
    //put your code here
    data.toSeq(data.size / 2)
}

require(middle("Scala") == 'a')
require(middle(Seq(1, 7, 5, 9)) == 5)