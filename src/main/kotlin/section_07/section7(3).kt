package section_07

fun main() {
    var a = Sound()

    a.cat()
}

open class Animal {
    // 메서드에 open 키워드 사용
    open fun cat() {
        println("고양이입니다!")
    }
}

class Sound : Animal() {
    override fun cat() {
        println("고양이가 돌아다닙니다!")
    }
}