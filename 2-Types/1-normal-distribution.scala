def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
    // put your code here
    val p = 1 / (sigma * Math.sqrt(2*Math.PI)) * Math.exp(- Math.pow((x-mu), 2) / 2* Math.pow(sigma, 2))
    p
}