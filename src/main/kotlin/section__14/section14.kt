package section__14

fun main() {
    val message = "Text.String"

    // 문자열 길이 반환
    println(message.length)

    // 문자열을 소문자로 변환하여 반환
    println(message.toLowerCase())
    // 문자열을 대문자로 변환하여 반환
    println(message.toUpperCase())

    // 특정 문자열을 기준으로 문자열을 나눌 수 있다.
    val message2 = message.split(".")
    println(message2)

    // 하나의 문자열로 합치기
    println(message2.joinToString()) // 기본 구분자인 , 쉽표 사용
    println(message2.joinToString("-"))

    // 문자열 일부만 출력
    println(message.substring(5..10))

    val nullString: String? = null
    val emptyString = ""
    val blankString = " "
    val normalString = "K"

    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())

    println()

    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())

    var message3 = "kotlin.kt"
    var message4 = "java.java"

    // 지정한 문자열로 시작하면 true 반환
    println(message3.startsWith("java"))
    println(message4.startsWith("java"))
    // 지정한 문자열로 끝나면 true 반환
    println(message3.endsWith(".kt"))
    println(message4.endsWith(".kt"))
    // 지정한 문자열이 포함되면 true 반환
    println(message3.contains("tl"))
    println(message4.contains("tl"))
}