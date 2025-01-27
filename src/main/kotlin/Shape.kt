abstract class Shape (_name : String) : Dimensionable() {
    var name = _name


    //IDE is telling me to include the "open" keyword in order to override it in a child class. Don't remember doing this in class
    open fun getArea(): Double {
        return 0.0;
    }
}