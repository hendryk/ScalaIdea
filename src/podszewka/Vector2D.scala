package podszewka

class Vector2D(val x: Double, val y: Double) {

    def magnify(mnoznik: Double): Vector2D = {
        new Vector2D(x * mnoznik, y * mnoznik)
    }

    def -(b: Vector2D): Vector2D = {
        new Vector2D(this.x - b.x, this.y - b.y)
    }

    def +(b: Vector2D): Vector2D = {
        new Vector2D(this.x + b.x, this.y + b.y)
    }

    override def toString: String = s"Vector2d($x, $y)"
}