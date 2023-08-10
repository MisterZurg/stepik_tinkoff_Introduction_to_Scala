import scala.io.StdIn

object Main {
    def main(args: Array[String]) {
        val startAndEnd = readLine()
        val str = readLine()
        
        val Array(startIndex, endIndex) = startAndEnd.split(" ").map(_.toInt)
        val reversedPart = str.substring(startIndex, endIndex + 1).reverse
        
        println(s"${str.take(startIndex)}${reversedPart}${str.drop(endIndex + 1)}")
    }
}