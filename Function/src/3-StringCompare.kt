fun main(args: Array<String>) {
    var name1 = "string"
    var name2 = "String"
    println(name1 == name2)
    println(name1.equals(name2, true))
    println(name1.equals(name2, false))
}