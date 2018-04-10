val pi = 3.1415926f
fun area(PI: Float, r: Float):Float {
    return PI * r * r
}

fun area1(PI: Float = pi, r: Float):Float {
    return PI * r * r
}

fun main(args: Array<String>) {
    println(area(3.14f, 5.4f))
    println(area1(r = 5.4f))
}