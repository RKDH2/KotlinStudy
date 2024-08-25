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

    var obj3 = 20
    var obj4 = 50
    var obj5 = 70
    var obj6 = "문자"

    // 조건 검사
    when (obj3) {
        10 -> println("obj3는 10입니다.")
        20 -> println("obj3는 20입니다.")
        else -> println("obj3는 10도 아니고 20도 아닙니다.")
    }

    // 여러 가지 조건 한 번에 분기
    when (obj4) {
        50, 60, 70 -> println("obj4는 50, 60, 70 중 하나입니다.")
        else -> println("obj4는 50, 60, 70도 아닙니다.")
    }

    // 범위 검사
    when (obj5) {
        in 60..80 -> println("obj5는 60 ~ 80 사이에 있습니다.")
        else -> println("obj5는 60 ~ 80 사이가 아닙니다.")
    }

    // 타입 검사 및 캐스팅(변환)
    when (obj6) {
        is String -> println("obj6는 문자열입니다.")
        else -> println("obj6는 문자열이 아닙니다.")
    }
}