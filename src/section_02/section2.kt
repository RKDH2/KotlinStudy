package section_02

fun main() {
    var a: Int = 12345
    var b: Long = a.toLong() // 명시적 형 변환
    println(b)

    var nullArray = arrayOfNulls<Int>(5) // 비어있는 배열
    var intArray = arrayOf(1, 2, 3, 4, 5) // 순서대로 값을 추가

    intArray[1] = 3 // 해당 인덱스에 값을 할당
    println(intArray[1])
}
