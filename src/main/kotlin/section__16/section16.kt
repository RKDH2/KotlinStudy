package section__16

fun main() {
    speed(7)
    speed("스피드가 7입니다.")

    // default arguments
    delivery("RKDHS")
    delivery("RKDHS", 3000)
    delivery("RKDHS", 3500, "회사")

    // named arguments
    delivery("RKDHS", location = "친구 집")

    plus(1, 2, 3, 4, 5)

    println(6 multiplay 4)
    println(6.multiplay(4))

    val multi = Multiplay()
    multi.value = 100
    var result = multi add 100
    println(result)
}

// Int 자료형
fun speed(x: Int) {
    println("스피드가 {$x}입니다.")
}

// String 자료형
fun speed(x: String) {
    println(x)
}

fun delivery(name: String, price: Int = 2500, location: String = "우리 집") {
    println("${name}님이, $location 위치로 배달을 시켰습니다. (배달비 : ${price})")
}

// 가변인자
fun plus(vararg numbers: Int) {
    var sum = 0

    for (n in numbers) {
        sum += n
    }

    println(sum)
}

// infix function
infix fun Int.multiplay(x: Int): Int = this * x

// infix function
class Multiplay {
    infix fun add(x: Int):Int {
        return this.value + x
    }

    var value: Int = 0
}
