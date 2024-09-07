package section_09

fun main() {
    println(Points.point)

    Points.pointUp()
    Points.pointUp()

    println(Points.point)

    Points.clear()

    println(Points.point)

    Points.pointDown()

    println(Points.point)
}

object Points {
    var point = 0

    fun pointUp() {
        point++
    }

    fun pointDown() {
        point--
    }

    fun clear() {
        point = 0
    }
}