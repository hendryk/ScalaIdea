package podszewka

object Main extends App {
    println("Posadzili Bacę na skraju Dunajca")

    def funkcja(x: Int, y: Int): Int = {
        x * y
    }

    def createErrorMessage(errorCode: Int): String = errorCode match {
        case 1 => "Błąd sieci"
        case 2 => "Błąd wejścia / wyjścia"
        case 3 => "Nieznany błąd"
    }

    println(createErrorMessage(1))

    val x = new Vector2D(1.0, 1.0)
    val y = new Vector2D(-1.0, 1.0)
    val z = x.magnify(2.0)

    println(z)

    val g = x.magnify(3.0) - (x - y).magnify(3.0)
    println(g)

    val punkt1 = new Point2(1, 1)
    val punkt2 = new Point2(1, 2)
    val punkt3 = new Point2(1, 1)

    print(punkt1 == punkt3)
}


