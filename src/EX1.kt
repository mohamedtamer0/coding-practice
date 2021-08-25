

fun getGreeting() = "Hello Kotlin"

fun sayHello(){
    println(getGreeting())
}

fun sayHello2(greeting: String, item:String) = println("$greeting $item")




fun sayHello2(greeting: String , vararg itemToGreet:String) {
    itemToGreet.forEach {
            itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main(args: Array<String>) {
    sayHello()
    sayHello2("Hello","Tamer")


    val interestingThings = arrayOf("Kotlin", "Java","JS")
    println(interestingThings.size)
    println(interestingThings[0])
    print(interestingThings.get(1))

    for (interestingThing in interestingThings) {
        println(interestingThing)
    }


    println("===========================")

    interestingThings.forEach {interestingThings ->
        println(interestingThings)
    }

    interestingThings.forEachIndexed{
        index, interestingThing ->
        println("$interestingThing is at index $index")
    }



    println("===========================")

    val map = mapOf(1 to "a", 2 to "b")
    map.forEach { key, value -> println("$key -> $value") }


    println("===========================")


    sayHello2("Hi","Kotlin", "Java","HTML")


    val entity = Entity.Factory.create()
    Entity.id
}

class Entity private constructor(val id :String)
{
    companion object Factory : idProv {
        const val id = "id"
        fun create() = Entity("id")
        override fun getId(): String {
            return "123"
        }
    }

}

interface idProv {
    fun getId() :String
}