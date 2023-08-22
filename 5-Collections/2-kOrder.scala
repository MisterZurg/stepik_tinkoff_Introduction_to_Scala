object Main {
    def kOrder(list: List[Int], k: Int): Int = {
        val array = list.toArray
        partition(array, 0, list.size - 1) match {
            case x if x == k => array(x)
            case x if x > k => kOrder(array.slice(0, x).toList, k)
            case x if x < k => kOrder(array.slice(x + 1, array.length).toList, k - x - 1)
        }
    }
        
    // ITMO wiki
    // partition принимает массив и границы отрезка, 
    // который будет рассечён (причём правая граница отрезка не включается), 
    // и возвращает индекс опорного элемента.
    def partition(arr: Array[Int], left: Int, right: Int): Int = {
        val pivot = arr(right)
        var i = left

        for (j <- left to right) {
            if (arr(j) < pivot) {
                swap(arr, i, j)
                i += 1
            }
        }

        swap(arr, i, right)
        return i
    }
     
    def swap(arr: Array[Int], i: Int, j: Int): Unit = {
        val stash = arr(i); arr(i) = arr(j); arr(j) = stash
    }
    
    def main(args: Array[String]) {
        val k: Int = StdIn.readInt()
        val list: List[Int] = StdIn.readLine().split(" ").map(_.toInt).toList
        println(kOrder(list, k - 1))
    }
}