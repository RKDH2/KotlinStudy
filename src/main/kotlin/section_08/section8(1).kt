package section_08

fun main() {
    f(::s) // 일반 함수를 고차 함수로 변환해 주는 연산자

    // 람다 함수
    val a = { str: String -> println("$str 람다 함수")}
    f(a)
}

fun s(str:String) {
    println("$str 함수")
}

fun f(func: (String)-> Unit) {
    func("name이 호출한")
}
