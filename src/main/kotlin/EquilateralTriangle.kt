import kotlin.math.sqrt

class EquilateralTriangle : Triangle("Equilateral Triangle") {
    fun setDimensions(side: Int) {
        super.setDimensions(side, side, side)
    }
}