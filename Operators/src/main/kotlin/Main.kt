fun main() {
    var x = 5
    val y = 3

    //Intro to operations
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result = x + y
    result += 2
    println("result = $result")

    result -= 2
    println("result = $result")

    result *= 2
    println("result = $result")

    result /= 2
    println("result = $result")

    result %= 2
    println("result = $result")

    //Control operator precedence with parentheses
    println("3 + 3 * 4 = ${(3 + 3) * 4}")

    x = 0
    println("x = ${x++}")
    println("x = ${++x}")

    println("x = ${x--}")
    println("x = ${--x}")

    //Intro to if-else statements
    val myNumber = 100
    if (myNumber > 150) {
        println("Greater than 150")
    }else if(myNumber > 90){
        println("Greater than 90")
    }else {
        println("All the conditions failed.")
    }

    //Logical AND operator
    val isPlaying = true
    val score = 80
    if (isPlaying && score == 100){
        println("Next level opened")
    }else {
        println("Still at the same level")
    }

    //Logical OR operator
    val num1 = 5
    val num2 = 4
    val text = if(num1 > 0 || num2 > 0){
        println("The condition is true")
        "This is text 1"
    }else {
        println("The condition is false")
        "This is text 2"
    }
    println("$text")

}//End of main