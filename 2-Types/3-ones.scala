import scala.io.StdIn

object Main {
    def main(args: Array[String]) {
        val input:Int = readInt()
        val cnt = countOnes(input)
        println(cnt)
    }
    
    def countOnes(num:Int):Int = {
        val binary = num.toBinaryString
        var res:Int = 0
        for (letter <- binary) {
            if (letter == '1') {
                res += 1
            }
        }
        res
    }
}