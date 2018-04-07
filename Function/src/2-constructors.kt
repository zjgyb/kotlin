fun dairyTools(words: String):String {
    var dairy = """
    你好，你的名字是${words},
    你名字长度是${words.length}
    """
    return dairy
}

fun main(args: Array<String>) {
    println(dairyTools("XiaoMing"))
}