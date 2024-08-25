package section_04

fun main() {
    var obj = 123
    var obj2 = "String"

    if (obj is Int) {
        println("이 obj는 Int 타입 입니다.")
    }

    if (obj2 !is Int) {
        println("이 obj2는 Int 타입이 아닙니다.")
    }

    When(20)
    When(50)
    When(70)
    When("문자")
    When("코틀린(Kotlin)")
}

fun When() {
    // 조건 검사
    when (obj: Any) {
        10 -> println("obj는 10입니다.")
        20 -> println("obj는 20입니다.")
        else -> println("obj는 10도 아니고 20도 아닙니다.")
    }

    // 여러 가지 조건 한 번에 분기
    when (obj: Any) {
        50, 60, 70 -> println("obj는 50, 60, 70 중 하나입니다.")
        else -> println("obj는 50, 60, 70도 아닙니다.")
    }

    // 범위 검사
    when (obj: Any) {
        in 60..80 -> println("obj는 60 ~ 80 사이에 있습니다.")
        else -> println("obj는 60 ~ 80 사이가 아닙니다.")
    }

    // 타입 검사 및 캐스팅(변환)
    when (obj: Any) {
        is String -> println("obj는 문자열입니다.")
        else -> println("obj는 문자열이 아닙니다.")
    }

    // 변수에 할당하거나 값으로 사용 가능
    var Kotlin = when (obj: Any) {
        "코틀린(Kotlin)" -> "이 언어는 코틀린(Kotlin)입니다."
    }

    println(Kotlin)
}
