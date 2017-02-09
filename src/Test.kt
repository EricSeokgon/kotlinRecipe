/**
 * Project: kotlinRecipe
 * FileName: Test
 * Date: 2017-02-09
 * Time: 오후 5:53
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
fun main(args: Array<String>) {
    val test = Test()
    test.test()
}

class Test {
    init {
        println("init")
    }

    val subject by lazy {
        println("lazy initalized")
        "제목 초기화"
    }

    fun test() {
        println("not initalized")
        println("subject one: $subject")
        println("subject two: $subject")
        println("subject three: $subject")
    }
}