package section_01

fun main() {
    var a: Int = 100 // 콜론 ':' 을 쓴 뒤 자료형을 적어준다.
    a = 200 // 값 변경 가능
    println(a)

    val b: Int = 300
    // b = 500 <- 값 변경이 불가능
    println(b)

    var c: Int? = null // null 허용

    // 변수만 우선 선언 할 경우 자료형 타입을 선언하기
    var d :Int // var e <- 에러 발생
}
