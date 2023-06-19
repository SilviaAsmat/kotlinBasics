fun main() {
    println(sum(5,6,7,10,5,34,64,2,4))
}

fun sum(vararg numbers: Int): Int {
     var result = 0
    for (number in numbers) {
        result += number
    }

    return result
}