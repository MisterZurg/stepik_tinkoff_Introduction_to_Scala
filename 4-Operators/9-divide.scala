def divide(p: (Int, Int))( q: (Int, Int)): Either[String, (Int, Int)] = {
    if (q._1 == 0 || q._2 == 0 || p._2 == 0) {
      return Left("Zero divisor")
    }
    
    if (Math.abs(p._1) >= Math.abs(p._2) || Math.abs(q._1) >= Math.abs(q._2)) {
      return Left("Invalid input")
    }
    
    val s = (p._1 * q._2, p._2 * q._1)
    if (Math.abs(s._1) >= Math.abs(s._2)) {
      return Left("Improper result")
    }
    
    val d = BigInt(s._1).gcd(BigInt(s._2)).toInt
    Right((s._1 / d, s._2 / d))
}