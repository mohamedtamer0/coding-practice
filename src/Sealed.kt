

sealed class Shape {

    class Circle(val radius: Int) : Shape()
    class Squar(val sideLength: Int):Shape()

    fun size(shap :Shape): Int {
        return when (shap) {
            is Shape.Circle -> shap.radius
            is Shape.Squar -> shap.sideLength
        }
    }


}


class Car2(val carName: String ){
    inner class Eng(val engName:String){
        override fun toString(): String {
            return  "$engName engine in a $carName"
        }
    }
}





fun main(args: Array<String>) {
    val one = Shape.Circle(4)

    val obj = Car2("KIA")
    val objEng = obj.Eng("rotary")
    println(objEng)


    val currncey = AccCur.Crypto()
    println("You have got some ${currncey.name}")



}


sealed class AccCur {
    class Doller:AccCur()
    class Euro:AccCur()
    class Crypto:AccCur()
    val name :String
    get() = when(this){
        is Euro -> "Euro"
        is Doller -> "Doller"
        is Crypto -> "Cry"
    }
}


























