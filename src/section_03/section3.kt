package section_03

fun main() {
    println(add(1, 5))
}

fun add(a: Int, b:Int): Int {
    return a + b
}

fun add2(a: Int, b: Int) = a + b // 단일 표현식 함수 // 반환형 타입 추론이 가능 -> 반환형 생략 가능
