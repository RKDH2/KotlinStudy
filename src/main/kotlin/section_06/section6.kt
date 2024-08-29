package section_06

fun main() {
    for (i in 1..9) {
        for (j in 1..9) {
            if (i == 3 && j == 8) break
            println("i 값 : $i, j 값 : $j")
        }
    }

    // 레이블(lable) 사용
    loop@ for (i in 1..9) {
        for (j in 1..9) {
            if (i == 3 && j == 8) break@loop
            println("i 값 : $i, j 값 : $j")
        }
    }

    foo()
    foo_1()
    foo_2()
    foo_3()
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // foo()에서 반환
        print(it)
    }
    println("실행되지 않는 코드")
}

fun foo_1 () {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return - forEach 루프
        print(it)
    }
    println("명시적 레이블 사용")
}

fun foo_2 () {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return - forEach 루프
        print(it)
    }
    println("암묵적 레이블 사용")
}

fun foo_3() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return  // 익명 함수를 사용해 local return - forEach 루프
        print(value)
    })
    print("익명 함수를 사용")
}
