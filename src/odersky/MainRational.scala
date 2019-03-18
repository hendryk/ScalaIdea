package odersky

object MainRational extends App {
    println("Start programu")

    val x = new Rational(3, 4)

    val y = new Rational(2, 3)

    println(x + y)
    println(x * x)
    println(x * 2)

    implicit def intToRational(x: Int): Rational = new Rational(x)

    println(2 * x)
}
