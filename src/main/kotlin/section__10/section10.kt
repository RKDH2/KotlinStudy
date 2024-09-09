package section__10

fun main() {
    // EventPrinter_1과 EventPrinter_2의 start 메서드를 호출하여 이벤트를 시작
    EventPrinter_1().start()
    EventPrinter_2().start()
}

// 이벤트 리스너 인터페이스 정의 (옵저버 역할)
interface EventListener {
    fun onEvent(point: Int)
}

// Points 클래스: 이벤트를 발생시키고 리스너에게 알림을 보냄 (주제 역할)
class Points(var listener: EventListener) {
    fun point() {
        // 1부터 10까지의 숫자를 순차적으로 리스너에게 전달
        for (i in 1..10) {
            listener.onEvent(i)
        }
    }
}

// EventPrinter_1 클래스: EventListener 인터페이스를 구현하여 이벤트를 처리
class EventPrinter_1: EventListener {
    override fun onEvent(point: Int) {
        // 전달받은 포인트를 실행
        println("${point}")
    }

    fun start() {
        // Points 객체를 생성하고, 현재 객체(this)를 리스너로 설정
        val points_1 = Points(this)
        // 포인트 이벤트를 실행
        points_1.point()
    }
}

// EventPrinter_2 클래스: 익명 객체를 사용하여 이벤트를 처리
class EventPrinter_2 {
    fun start() {
        // 익명 객체를 사용하여 EventListener 인터페이스를 구현
        val points_2 = Points(object: EventListener {
            override fun onEvent(point: Int) {
                // 전달받은 포인트를 출력
                println("${point}")
            }
        })
        // 포인트 이벤트를 실행
        points_2.point()
    }
}
