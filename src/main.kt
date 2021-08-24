

fun main(args: Array<String>) {

    val (product, quo) = multiplyAndDivide(4,2)
    println(product)



    //ReadLine

//    println("Enter your Name: ")
//    var name = readLine()!!.toString()
//    print("My Name is : $name")


    //Maps

    var mapYear = mapOf("Tamer" to 1996, "Mohamed" to 1997)
    println(mapYear)

    //Accessing Values
    println(mapYear["Mohamed"])

    println(mapYear.size)
    println(mapYear.isEmpty())



    //HashMap

    var hashmapp = HashMap<String, Int>(20)


    val names = arrayOf("zzzzz", " BB", "JJJJ")
    println(names.sorted())


    val namesByLength = names.sortWith(compareBy {
        -it.length
    })
    println(namesByLength)

}

fun multiplyAndDivide(number: Int, factor: Int):Pair<Int, Int> {
    return Pair(number * factor, number / factor)
}


fun multiInferred(number1 : Int, multiplier : Int) = number1 * multiplier


//parameters as Values

fun incermentAndPrint(value : Int) :Int {
    val newValue = value + 1
    println(newValue)
    return newValue
}


//Overloading
fun getValue(valueOver :Int) :Int {
    return  valueOver + 1
}


fun getValue(valueOver :String) :String {
    return  "The Value is $valueOver"
}










