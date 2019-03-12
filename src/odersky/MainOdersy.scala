package odersky

object MainOdersy extends App {
    var capital = Map("Polska" -> "Warszawa", "Francja" -> "Paryż")
    capital += ("Japonia" -> "Tokyo")
    capital += ("USA" -> "Waszyngton")

    println(capital("Polska"))
    println(capital("Japonia"))
    println(capital("Francja"))
}
