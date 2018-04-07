fun main(args: Array<String>) {
    var name = "World"
    var age = 15
    var logLevel = 16

    println(sayHello(name))
    println(checkAge(age))
    saveLog(logLevel)
}

fun sayHello(name: String):String {
    var hello = "hello "
    return hello + name
}

fun checkAge(age: Int):Boolean {
    if(age > 18) {
        return true
    }
    return false
}

fun saveLog(logLevel: Int) {
    println(logLevel)
}