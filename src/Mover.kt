class Mover <T> (
    thingsToMove:List<T>,
    val truckHeightInInches: Int = (12 * 12) )
{

    private var thingsLeftInOldPlace = mutableListOf<T>()
    private var thingsInTruck = mutableListOf<T>()
    private var thingsInNewPlace = mutableListOf<T>()

    init {
        thingsLeftInOldPlace.addAll(thingsToMove)
    }

    fun moveEverythingToTruck(){
        while (thingsLeftInOldPlace.count() > 0) {
            val item = thingsInTruck.removeAt(0)
            thingsInTruck.add(item)
            println("Moved your $item into your new truck!")
        }
    }



    fun moveEverythingIntoNewPlace(){
        while (thingsInTruck.count() > 0) {
            val item = thingsInTruck.removeAt(0)
            thingsInNewPlace.add(item)
            println("Moved your $item into your new truck!")
        }
    }


}