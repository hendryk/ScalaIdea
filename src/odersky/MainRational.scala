package odersky

object MainRational extends App {
    println("Start programu")

    val x = new Rational(3, 4)

    val y = new Rational(2, 3)

    print(x.add(y))
}
