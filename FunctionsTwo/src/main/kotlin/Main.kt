fun main() {
    val max = getMax(5,9)

    //Using this max will call the getMax() with Double parameters
    //val max = getMax(5.6,9.7)

    //Using this will call getMax with three Int parameters
    //val max = getMax(5,9,7)

    println(max)
}

//Can also be written as follows, only for single line functions
//fun getMax(a: Int, b: Int) = if (a > b) a else b
fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max
}

fun getMax(a: Int, b: Int, c: Int): Int {
    return if (a > b && a > c) {
        a
    }else if (b > a && b > c){
        b
    }else {
        c
    }
}

fun getMax(a: Double, b: Double): Double {
    val max = if (a > b) a else b
    return max
}