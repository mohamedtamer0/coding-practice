fun main(args: Array<String>) {

    var x : Int
    x = 6
    var ar1 = IntArray(3)
    ar1[0] = 3
    ar1[1] = 6
    ar1[2] =7
    println(ar1[1])

    var ar2 = Array(3){0}
    ar2[0] = 5
    ar2[1] = 6
    ar2[2] = 7

    for (i : Int in 0 until ar2.size) {
        println(ar2[i])
    }


    var ar3 = Array<Int>(3){0}
    ar3[0] = 6
    ar3[1] = 5
    ar3[2] = 9

    var total : Int = 0
    for (i : Int in 0 until ar3.size){
        total = total + ar3[i]

    }

    println("Total = " + total)



    //ForEach

    var myList = Array<String>(3){"a"}
    myList[0] = "Ahmed"
    myList[1] = "omar"
    myList[2] = "tamer"

    for ( i in myList) {
        println(i)
    }



    var arrOf = arrayOf(4,"Ahmed",'a', 4.46)


    var a = arrayOf(4,7,8,3)
    var b = arrayOf(4,9,8,3)
    var c = arrayOf(3,6,8,5)

    var list = arrayOf(a,b,c)
   println(list[1][1])


    for (i in list) {
        for (j in i) {
            print(j)
        }
        println(i)
    }


    var names = ArrayList<String>()
    names.add("Ahmed")
    names.add("tamer")
    names.add("omar")

    println(names)
    println(names.get(2))
    names.remove("Ahmed")
    println(names)



}


