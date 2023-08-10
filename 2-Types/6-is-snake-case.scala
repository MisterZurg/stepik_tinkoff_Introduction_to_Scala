import scala.io.StdIn

object Main {
    def main(args: Array[String]) {
        // your code here
        val str = readLine()
        println(isInSnakeCase(str))
    }
    
    def isInSnakeCase(str: String):Boolean = {
        if (str.length == 1 && str.charAt(0) != '_' && str.charAt(0).isLower) {
            return true
        } else if (str.charAt(0).isUpper || str.charAt(0).isDigit) {
            return false
        }
        
        
        // Символ подчёркивания не должен стоять в начале и в конце строки
        if (str.charAt(0) == '_' || str.charAt(str.length - 1) == '_') {
            return false
        }
        
        for (i <- 1 to str.length - 1) {
            if (str.charAt(i).isUpper || str.charAt(i).isDigit) {
                return false
            }
            // Два символа подчёркивания не могут стоять рядом
            if (str.charAt(i - 1) == '_' && str.charAt(i) == '_') { 
                return false
            }
            // Должна содержать только строчные латинские буквы и символ подчёркивания
            if (str.charAt(i) != '_' && 'a' <= str.charAt(i) && 'z' <= str.charAt(i)) {
                return false
            }
        }
        true
    }
}