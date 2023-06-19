fun main() {
    val max = findMinAndMax(arrayOf(4,5,7,6,9,10,4), true)
    val min = findMinAndMax(arrayOf(4,5,7,6,9,10,4), false)

    println("The max value is $max")
    println("The min value is $min")

}

fun findMinAndMax(numbers: Array<Int>, findMax: Boolean): Int{
    var answer: Int = numbers[0]

    if(findMax) {
        for (number in numbers) {
            if (number > answer) {
                answer = number
            }
        }
    } else {
        for (number in numbers) {
            if (number < answer) {
                answer = number
            }
        }
    }
    return answer
}