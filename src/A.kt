open class A: Demo{


    inner class Z {
        var t : Int? = null
        fun print(){

        }

    }

    var x :Int = 10

    constructor() {
        println(this.x)
    }

   open fun add(a : Int, b : Int): Int {
        return a + b
    }

   open fun sub(a : Int, b : Int): Int {
        return a - b
    }



}


fun main(args: Array<String>) {
    var obj = A()
    var obj2 = A().Z()

}