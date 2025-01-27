class Circle : Shape("Circle"){
    var radius: Int = 0

    fun setDimensions(radius: Int) {
        this.radius = radius
    }

    override fun printDimensions() {
        println("Radius: $radius")
    }

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}