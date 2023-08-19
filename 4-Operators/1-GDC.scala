import scala.io.StdIn
import scala.annotation.tailrec

object Main {
    @tailrec
    def GDC(a: Int, b: Int): Int = {
        if (b == 0) {
            return a
        }
        return GDC(b, a % b)
    }
    
    def main(args: Array[String]) {
        // your code here
        val n = StdIn.readInt()
        for (i <- Range(1, n)) {
            for (j <- Range(1, n)) {
                if (GDC(i, j) == 1) {
                    println(f"${i} ${j}")
                }
            } 
        }
    }
}

/* Using GDC from BigInt

import scala.io.StdIn

object Main {
    def main(args: Array[String]) {
        // your code here
        val n = StdIn.readInt()
        for (i <- Range(1, n)) {
            for (j <- Range(1, n)) {
                if (BigInt(i).gcd(BigInt(j)) == 1) {
                    println(f"${i} ${j}")
                }
            } 
        }
    }
}
*/