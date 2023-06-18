fun main() {
    var userName: String = "Silvia"
    userName = "Andrea"
    /* Uses static type, cannot assign other var type to userName
     Ex: userName = 5 */

    println("Hello $userName!")

    val userName2: String = "Silvia"
    /* Cannot change assigned value to val
     Ex: userName2 = "Andrea" */

    println("Hello $userName2!")

    var age: Int = 24
    age = 25
    
    println("Your age is $age")
}