class Cat : Animal {

    var name : String? = null

    constructor(){}


    constructor(p_name : String) {
        this.name = p_name
        println("Name Is :  ${this.name}")
    }


    override fun paly() {
        println("Cat Play ${this.name}")
    }


    override fun sleep() {
        println("${this.name} Sleepin")
    }
}