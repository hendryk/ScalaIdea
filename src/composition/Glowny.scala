package composition

abstract class Element {
    def contents: Array[String]
    def height: Int = contents.length
    def width: Int = if (height == 0) 0 else contents(0).length
}


class ArrayElement(conts: Array[String]) extends Element {
    val contents: Array[String] = conts
}

object Glowny extends App {
    val ae: ArrayElement = new ArrayElement(Array("hello"))
}
