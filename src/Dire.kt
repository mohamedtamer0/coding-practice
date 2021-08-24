enum class Dire {


    NORTH(10,"NO"), SOUTH(15,"SO"), EAST(25,"WE");

    var num : Int? = null
    var n : String? =null

    private constructor(p_num : Int, p_name: String){
        this.num = p_num
        this.n = p_name
    }

}


fun main(args: Array<String>) {
    println(Dire.NORTH.n)
}