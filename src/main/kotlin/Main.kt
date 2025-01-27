fun main(args: Array<String>) {
    val square : Shape = Square()
    println("Enter length and height for the Square:")
    val squareLength = readln().toDouble()
    val squareHeight = readln().toDouble()
    (square as Square).setDimensions(squareLength, squareHeight)

    val circle : Shape = Circle()
    println("Enter radius for the Circle:")
    val circleRadius = readln().toInt()
    (circle as Circle).setDimensions(circleRadius)

    val triangle : Shape = Triangle("Triangle")
    println("Enter the three sides of the Triangle:")
    val triangleA = readln().toInt()
    val triangleB = readln().toInt()
    val triangleC = readln().toInt()
    (triangle as Triangle).setDimensions(triangleA, triangleB, triangleC)

    val equilateralTriangle : Shape = EquilateralTriangle()
    println("Enter the side of the Equilateral Triangle:")
    val equilateralSide = readln().toInt()
    (equilateralTriangle as EquilateralTriangle).setDimensions(equilateralSide)

    println("\nShape Details:")
    println("---------------------")
    println("Square:")
    square.printDimensions()
    println("Area: ${square.getArea()}")
    println("--------------------")

    println("Circle:")
    circle.printDimensions()
    println("Area: ${circle.getArea()}")
    println("---------------------")

    println("Triangle:")
    triangle.printDimensions()
    println("Area: ${triangle.getArea()}")
    println("----------------------")

    println("Equilateral Triangle:")
    equilateralTriangle.printDimensions()
    println("Area: ${equilateralTriangle.getArea()}")
    println("--------------------")
}