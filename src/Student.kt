import javax.imageio.ImageTranscoder

fun main(args: Array<String>) {


    var obj = Student("Mohamed", "Tamer", 25)
    //obj.setInfo()

//    var obj = Student()
//    println("Enter Your Name: ")
//    obj.name = readLine()!!.toString()
//
//    println("Enter Your Age: ")
//    obj.age = readLine()!!.toInt()
//
//    obj.intro()


}


class Student(p_firstName : String, p_lastName : String, p_age : Int) {


    var firstName : String? = null
    var lastName : String? = null
    var age : Int?  = null


    init {
        this.firstName = p_firstName
        this.lastName= p_lastName
        this.age = p_age

        println("First Name Is :  ${this.firstName}")
        println("last Name Is :  ${this.lastName}")
        println("My Age :  ${this.age}")

    }


    fun setInfo() {
        this.firstName = ""
        this.lastName= ""
        this.age = 0

        println("First Name Is :  ${this.firstName}")
        println("last Name Is :  ${this.lastName}")
        println("My Age :  ${this.age}")
    }



//    var name : String = ""
//    var age : Int? = null
//    fun intro() {
//        println("Hello My name is : ${this.name}")
//        println("My Age is : ${this.age}")
//    }


}