fun main(args: Array<String>) {
    var num1 = 1 until 100 // [1, 100)
    for (num in num1) {
        println("num = ${num},")
    }
}