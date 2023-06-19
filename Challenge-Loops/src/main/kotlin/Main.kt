fun main() {
    var evenNumCounter = 0

    for(i in 1..20) {
        if ((i % 2) != 0) {
            continue
        }
        evenNumCounter++
        println(i)
    }
    println("Count of Even Numbers: $evenNumCounter")
}


