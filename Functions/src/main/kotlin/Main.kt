fun main() {
    sayHello("Silvia",24)

    val hasInternet = true

    if (hasInternet) {
        getData("Some data")
    } else {
        showMessage()
    }
}

//Parameters passed are considered immutable
fun sayHello(name: String, age: Int) {
    //Cannot reassign age or name
    //Ex.: age = 22 is not allowed
    var number = age
    println("Hello, $name! Your age is $age")
}

fun getData(data: String) {
    println("Your data is: $data")
}

fun showMessage(){
    println("There is no Internet")
}