val log: PartialFunction[Double, Double] = {
    case x if x > 0 => Math.log(x)
}