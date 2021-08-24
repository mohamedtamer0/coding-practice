fun main(args: Array<String>) {

    var s :String? = null
    println(s)
    //println(s!!)

    var obj = Car()
    obj.model = 2015
    obj.name = "BMW"
    println(obj.model!!)
    println(obj.name!!)

}

class Car {
    var model : Int? = null
    var name : String? = null
}