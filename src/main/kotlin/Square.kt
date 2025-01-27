//seems like there should probably be a rectangle between shape and square like we have with triangle and equilateral triangle
class Square : Shape("Square"){

    var length: Double = 0.0
    var height: Double = 0.0

    fun setDimensions(length: Double, height: Double) {
        this.length = length
        this.height = height
    }

    override fun printDimensions() {
        println("Length: $length, Height: $height")
    }

    override fun getArea(): Double {
        return length * height
    }
}
