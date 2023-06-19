fun main() {
    val text: String? = null
    println(text)

    val text2: String? = "Name"
    //text2 = null;
    if (text2 != null){
        println(text2.length)
    } else {
        println("The variable is null.")
    }

    //This is simpler to null check
    println(text2?.length)

    val text3: String = text2 ?: "The variable is null."
    println(text3.length)
}