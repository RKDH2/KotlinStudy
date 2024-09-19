package section__15

fun main() {
    var a: String? = null

    // a 가 null 이기 때문에 스코프 함수 전체가 수행되지 않는다.
    a?.run {
        println(length)
    }

    var b: String? = "kotlin language"

    b?.run {
        println(length)
    }
}