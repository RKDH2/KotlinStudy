package section__15

fun main() {
    // nullable 변수 생성
    var a: String? = null

    // ?. (Safe Call Operator) 연산자 사용
    println(a?.length)

    // ?: (Elvis Operator) 연산자 사용
    println(a?:"kotlin!".length)

    // !!. (Not-Null Assertion Operator) 연산자 사용
    println(a!!.length)
}