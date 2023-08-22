object Main {
    def main(args: Array[String]) {
        val ints: List[Int] = Lesson.ints  
        // put your code here
        val zeros = ints.filter(_ == 0)
        val ones = ints.filter(_ == 1)
        
        val zerosString = zeros.mkString(",")
        val onesString = ones.mkString(",")
        println(zerosString)
        println(onesString)
    }
}