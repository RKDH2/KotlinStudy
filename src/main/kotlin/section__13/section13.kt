package section__13

fun main() {
    val a = listOf("apple", "banana", "orange")
    // 특정 인덱스에 있는 값을 호출
    println(a[1])

    // 리스트에 모든 요소를 출력
    for (fruit in a) {
        print("${fruit}, ")
    }

    println()

    val b = mutableListOf(3, 6, 9)
    println(b)

    // 리스트 뒤에 요소 추가
    b.add(12)
    println(b)

    // (인덱스 위치, 요소 값) 추가
    b.add(2, 15)
    println(b)

    // (인덱스 위치)에 있는 요소 삭제
    b.removeAt(1)
    println(b)

    // 무작위로 섞기
    b.shuffle()
    println(b)

    // 정렬
    b.sort()
    println(b)
}