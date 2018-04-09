fun main(args: Array<String>) {
    var num1 = 1 .. 10
    var num2 = num1.reversed()
    for (num in num2) {
        println(num)
    }
    var count = num2.count()
    println(count)
}