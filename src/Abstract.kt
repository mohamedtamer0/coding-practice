import java.time.DayOfWeek

abstract class Mammal (val birthDay: String) {
    abstract fun consumeFood()
}

class Human(birthDay: String):Mammal(birthDay) {
    override fun consumeFood() {
        TODO("Not yet implemented")
    }

    fun creatBirthCer(){}
}

fun main(args: Array<String>) {
    val human = Human("33333")
    //val mammal = Mammal() // Error
}


