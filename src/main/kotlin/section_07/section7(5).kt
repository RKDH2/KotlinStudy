package section_07

fun main() {
    var a = Player()

    a.move()
    a.info()
}

interface Action {
    fun move()
}

interface Info {
    fun info() {
        println("플레이어가 오프라인입니다.")
    }
}

class Player : Action, Info {
    override fun move() {
        println("플레이어가 이동합니다.")
    }

    override fun info() {
        println("플레이어가 온라인입니다.")
    }
}