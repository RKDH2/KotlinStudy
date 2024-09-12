package section__12

fun main() {
    // Generic 클래스의 인스턴스를 생성하고 toLevelUp() 메서드를 호출
    Generic(A()).toLevelUp()  // "A 사용자 : 레벨업!" 출력
    Generic(B()).toLevelUp()  // "B 사용자 : 레벨업!" 출력
    Generic(C()).toLevelUp()  // "C 사용자 : 레벨업!" 출력

    // B 클래스의 인스턴스를 생성하고 toLevelUp 함수 호출
    toLevelUp(B())
}

// 제네릭 함수 toLevelUp 정의, T는 A 클래스를 상속받는 타입이어야 함
fun <T: A> toLevelUp(t: T) {
    // T 타입의 LevelUp 메서드를 호출
    t.LevelUp()
}

// 상위 클래스 A 정의
open class A {
    // LevelUp 메서드 정의, 하위 클래스에서 오버라이드 가능
    open fun LevelUp() {
        println("A 사용자 : 레벨업!")
    }
}

// 하위 클래스 B 정의, A 클래스를 상속받음
class B : A() {
    // LevelUp 메서드를 오버라이드하여 재정의
    override fun LevelUp() {
        println("B 사용자 : 레벨업!")
    }
}

// 하위 클래스 C 정의, A 클래스를 상속받음
class C : A() {
    // LevelUp 메서드를 오버라이드하여 재정의
    override fun LevelUp() {
        println("C 사용자 : 레벨업!")
    }
}

// 제네릭 클래스 Generic 정의, T는 A 클래스를 상속받는 타입이어야 함
class Generic<T: A> (val t: T) {
    // toLevelUp 메서드 정의, T 타입의 LevelUp 메서드를 호출
    fun toLevelUp() {
        t.LevelUp()
    }
}
