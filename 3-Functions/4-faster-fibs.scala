import scala.annotation.tailrec

@tailrec
def fibs(n: Int, currentNumber: Int = 1, f1: BigInt = 0, f2: BigInt = 1): BigInt = {
    if (n == currentNumber)
        return f2
    return fibs(n-1, currentNumber, f2, f1 + f2)
}
println(fibs(n))