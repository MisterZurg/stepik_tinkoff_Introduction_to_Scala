val kind = pet match {
    // Напишите нужные case
    case Pet(_, "meow" | "nya") => "cat"
    case Pet("Rex", _) => "dog"
    case Pet(_, says)  if says.contains("0") || says.contains("1") => "robot"
    case _ => "unknown"
}
println(kind)