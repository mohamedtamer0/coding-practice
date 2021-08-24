open class Animal {

    constructor(){}


    open fun paly() {
        println("Demo")
    }

    open fun sleep() {
        println("Demo")
    }

}


fun main(args: Array<String>) {
    var obj = Cat("Lasy")
    obj.paly()
    obj.sleep()

}