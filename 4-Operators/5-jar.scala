val percent = (x:Double, y:Int) => x * y / 100
val string = (a:String, c:Double) => s"$a $c"

def discount: PartialFunction[Jar, String] = {
    case x:Jar if x.value >= 5 && x.value <= 10 => string(x.name, percent(x.price, 5))
    case x:Jar if x.value > 10 => string(x.name, percent(x.price, 10))
}

jars.collect(discount)