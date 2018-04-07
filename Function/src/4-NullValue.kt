fun hello(name: String?):String {
    return "Hello " + name
}

fun main(args: Array<String>) {
    println(hello("Tony"))
    println(hello(null))
}