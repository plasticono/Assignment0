import kotlin.math.sqrt

open class Triangle(name: String = "Triangle") : Shape(name) {
    var a: Int = 0
    var b: Int = 0
    var c: Int = 0

    fun setDimensions(a: Int, b: Int, c: Int) {
        this.a = a
        this.b = b
        this.c = c
    }

    override fun printDimensions() {
        println("Sides: a=$a, b=$b, c=$c")
    }

    override fun getArea(): Double {
        val s = (a + b + c).toDouble() / 2 //half of perimeter
        return sqrt(s * (s - a) * (s - b) * (s - c)) //heron's
    }
}
