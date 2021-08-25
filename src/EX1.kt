

fun getGreeting() = "Hello Kotlin"

fun sayHello(){
    println(getGreeting())
}

fun sayHello2(greeting: String, item:String) = println("$greeting $item")

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


}