class Dell : Runnable {
    constructor()

    override fun run() {
        for (i :Int in 0 until 5) {
            println("Dell")
            Thread.sleep(1000)
        }
    }

}


class Hp : Runnable {
    constructor()

    override fun run() {
        for (i :Int in 0 until 5) {
            println("Hp")
            Thread.sleep(1000)
        }
    }

}


fun main(args: Array<String>) {

    var obj1 : Runnable = Dell()
    var obj2 : Runnable = Hp()

    var t1 = Thread(obj1)
    var t2 = Thread(obj2)

    t1.start()
    t2.start()

}