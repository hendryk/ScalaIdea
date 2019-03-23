package coursera

object Rationals extends App {
    println("Welcome!")

    val x = new Rational(1, 3)
    val y = new Rational(5, 7)
    val z = new Rational(3, 2)

    println(x.unary_-)
    println(x - y)

    println(x + y + z)
    println(x < y)
    println(x max y)
    println(new Rational(2))

    //    val strange = new Rational(2,0)
}


class Rational(x: Int, y: Int) {
    require(y != 0, "mianownik musi być rózny od zera!")

    def this(x: Int) = this(x, 1)

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    val numer: Int = x
    val denom: Int = y

    override def toString: String = {
        val g = gcd(numer, denom)
        numer / g + "/" + denom / g
    }
    def +(tamten: Rational) =
        new Rational(
            numer * tamten.denom + tamten.numer * denom,
            denom * tamten.denom)

    def unary_- : Rational = new Rational(-numer, denom)
    def -(tamten: Rational): Rational = this + -tamten
    def <(tamten: Rational): Boolean = numer * tamten.denom < tamten.numer * denom
    def max(tamten: Rational): Rational = if (this < tamten) tamten else this
}