fun dairy(worlds: Int):String {
    var dairyWords = """
    今天天气晴朗，看到了${len(worlds)}只鸟
    """
    return dairyWords
}

fun len(num: Int):String {
    var result = when(num) {
        1 -> "一"
        2 -> "二"
        3 -> "三"
        else -> "三只以上"
    }
    return result
}

fun main(args: Array<String>) {
    println(dairy(3))
}