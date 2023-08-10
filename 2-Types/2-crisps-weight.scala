import scala.math.BigDecimal.RoundingMode.HALF_UP

def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
    // your code here
    // Высушить картофель
    val dryPotatoe = weight * (1 - potatoWaterRatio) // сколько картошки без воды
    // Увлажняем чипсы
    val wetCrisps = dryPotatoe / (1 - crispsWaterRatio) // сколько воды в чипсах
    wetCrisps.setScale(5, HALF_UP)
}