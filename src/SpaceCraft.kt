
class SpaceCraft {

    var isConnectionAvil:Boolean = false
    var isinEngOrder:Boolean = false
    var isInSpace:Boolean = false
    var fuel:Int = 0

    fun launch() {
        if (fuel < 5) {
            throw Exception("Out of Fuel")
            return
        }

        if (!isinEngOrder) {
            throw Exception("The Eng is Broken")
            return
        }

        if (!isConnectionAvil) {
            throw Exception("No Connection with Earth")
            return
        }

        sendMessageToEarth("Try to Launch")
        fuel -=5
        sendMessageToEarth("I'm in Space!")
        sendMessageToEarth("I've found some Ex")
        isInSpace = true

    }


    fun sendMessageToEarth(message: String) {
        println("SpaceCraft to Earth : $message")
    }


    object SpacePort {
        fun inestSpace(spaceCraft: SpaceCraft){
            try {
                spaceCraft.launch()
            }catch (ex:Exception){
                spaceCraft.sendMessageToEarth(ex.localizedMessage)
            }
        }
    }

}

fun main(args: Array<String>) {
    val spaceCraft = SpaceCraft()
    SpaceCraft.SpacePort.inestSpace(spaceCraft)
}