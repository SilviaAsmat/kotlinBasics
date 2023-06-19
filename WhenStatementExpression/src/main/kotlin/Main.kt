fun main() {
    val alarm = 7

    val text = when {
        alarm <= 10 -> {
            "The number is in the range 1..10"
        }
        //If the below expression was first, it would run first.
        alarm == 8 || alarm == 7 -> {
            println("Some text")
            "The time is $alarm"
        }
        else -> {
            "The time is $alarm"
        }
    }
    println(text)
}