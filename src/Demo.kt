open class Demo {


  private  var name : String? = null
  protected var y : String? = null

    fun setName(p_name : String) {
        this.name = p_name
    }

    fun getName():String?{
        return this.name
    }




//    var a : Int = 0 //Public
//    var b : Int = 0 //Public
//
//    fun printVal () {
//        this.a = 10
//        var x : Int // Local
//    }
//
//
//    fun printName ()
//    {
//        var s : Int // Local
//    }


}


fun main(args: Array<String>) {
    var obj = Demo()
    obj.setName("Tamer")
    println(obj.getName())
}