open class B : A{

    var s : String = "Hello"

    constructor() : super(){

        println(this.s)

    }

    override fun add(a: Int, b: Int): Int {
        return super.add(a, b)
    }

    override fun sub(a: Int, b: Int): Int {
        return super.sub(a, b)
    }



}