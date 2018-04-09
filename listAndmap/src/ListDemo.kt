fun main(args: Array<String>) {
    var lists = listOf("一个", "两个", "三个")
    for (list in lists) {
        println(list)
    }
    for ((i, e) in lists.withIndex()) {
        println("$i $e")
    }
}