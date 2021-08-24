fun main(args: Array<String>) {


    var multiplyLambda : (Int, Int) -> Int

    multiplyLambda = { a:Int, b : Int -> Int

        a*b
    }


    val lambdaRes = multiplyLambda(4,2)
    println(lambdaRes)



println("08:00 You have one billion dollars\n" +
        "08:30   You have two thousand dollars\n" +
        "09:10 You have no dollars!")




    val addLambda  = {a :Int, b:Int ->
        a+b
    }
    operateOnNumbers(4,2,operation =  addLambda)

    operateOnNumbers(4,2,operation = ::addFun)

    var unitLambda: () ->Unit = {
        println("Hello Kotlin")
    }
    unitLambda()

//    var counter = 0
//    val  incerCounter = {
//        counter +=1
//    }


}


fun operateOnNumbers(a:Int , b:Int, operation : (Int,Int) -> Int ) :Int {
    val result  = operation(a,b)
    println(result)
    return result
}

fun addFun(a:Int, b:Int) =a+b

fun countLambda(): () -> Int {
    var counter = 0
    val incerCounter : () -> Int = {
        counter +=1
        counter
    }
    return incerCounter
}
