import kotlin.properties.Delegates

class Pro(val id:Int, var boss:String) {

    companion object {
        var highestlevel = 1
    }
    var unlock:Boolean by Delegates.observable(false) {
        _,old , new ->
        if (new && id > highestlevel) {
            highestlevel = id
        }

        println("$old -> $new")
    }


}


fun main(args: Array<String>) {
    val obj1 = Pro(id =1, boss = "Chameleon")
    println(Pro.highestlevel)

}