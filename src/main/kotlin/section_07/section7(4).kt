package section_07

fun main() {
    var a = Sounds()

    a.cat()
    a.sound()
}

// 추상 클래스
abstract class Animals {
    // 추상 메서드
    abstract fun cat()
    fun sound() {
        println("meow~")
    }
}

class Sounds : Animals() {
    // 추상 메서드를 오버라디딩하여 기능 구현
    override fun cat() {
        println("고양이가 나타났다!")
    }
}