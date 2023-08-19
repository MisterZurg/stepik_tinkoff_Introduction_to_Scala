import scala.util.matching.Regex

// Здесь можно объявить регулярные выражения
val pattern: Regex = "([a-zA-Z]+ \\w+@\\w+.\\w+)".r
val isName: Regex = "([a-zA-Z]+)".r
val isEmail: Regex = "(\\w+@\\w+.\\w+)".r

val result = input match {
    // Напишите нужные case
    case List(isName(match1), isEmail(match2), _*) => s"$match1" +" "+ s"$match2".split("@")(1)
    case List(pattern(match1), _*)  => s"$match1".split(" ")(0)+" "+s"$match1".split(" ")(1).split("@")(1)
    case _ => "invalid"
}
println(result)