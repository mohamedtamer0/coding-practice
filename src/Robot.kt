import java.util.*

class Robot(val name : String) {
    var strength : Int = 0

    private var health : Int = 100

    init {
        strength = Random().nextInt(100) + 10
        report("Created (strength $strength)")
    }

    fun report(message: String){
        println("$name: \t$message")
    }


    var isAlive: Boolean = true

    fun attack(robot:Robot) {
        val damage = (strength * 0.1 + Random().nextInt(10)).toInt()
        robot.damage(damage)
    }

    fun damage(damage:Int){
        val blocked = Random().nextBoolean()

        if (blocked) {
            report("Blocked attack")
            return
        }

        health -+ damage
        report("Damage -$damage, health $health")
        if (health <= 0) {
            isAlive = false
        }

    }

    object Battlefield {
        fun beginBattle(firstRobot: Robot, secondRobot:Robot) {
            var winner : Robot? =null
            battle(firstRobot,secondRobot)
            winner = if(firstRobot.isAlive) firstRobot else secondRobot
        }

        fun battle(firstRobot: Robot, secondRobot: Robot){
            firstRobot.attack(secondRobot)
            if (secondRobot.isAlive.not()){
                return
            }

            secondRobot.attack(firstRobot)
            if (firstRobot.isAlive.not()){
                return
            }

            battle(firstRobot,secondRobot)
        }
    }



}


fun main(args: Array<String>) {
    val first = Robot("Tom")
    val second = Robot("Jery")
    Robot.Battlefield.beginBattle(first,second)
}