




fun main(args: Array<String>) {

    try {
        println("Enter Value X: ")
        var x : Int = readLine()!!.toInt()
        println("Enter Value Y:")
        var y : Int = readLine()!!.toInt()
        println("X Add Y is : ${x+y}" )
    }catch (e : Exception) {
        println("Wrong")
    }


}