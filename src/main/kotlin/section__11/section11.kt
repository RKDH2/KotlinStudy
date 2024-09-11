package section__11

fun main() {
    // Chicken 클래스의 인스턴스 생성
    var a = Chicken()
    a.eat()  // "치킨을 먹었습니다." 출력

    // FriedChicken 클래스의 인스턴스를 Chicken 타입 변수에 저장 (Up-Casting)
    var b: Chicken = FriedChicken()
    b.eat()  // "치킨중에 후라이드 치킨을 먹었습니다." 출력

    // b가 FriedChicken 타입인지 확인하고, 맞으면 cleaning() 메서드 호출
    if(b is FriedChicken) {
        b.cleaning()  // "치킨을 먹고 깨끗하게 청소 완료." 출력
    }

    // b를 FriedChicken 타입으로 변환 (Down-Casting)
    var c = b as FriedChicken
    c.cleaning()  // "치킨을 먹고 깨끗하게 청소 완료." 출력
    b.cleaning()  // "치킨을 먹고 깨끗하게 청소 완료." 출력
}

// 상위 클래스 Chicken 정의
open class Chicken {
    var name = "치킨"

    // eat() 메서드 정의, 하위 클래스에서 오버라이드 가능
    open fun eat() {
        println("${name}을 먹었습니다.")
    }
}

// 하위 클래스 FriedChicken 정의, Chicken 클래스를 상속받음
class FriedChicken: Chicken() {
    var type = "후라이드 치킨"

    // eat() 메서드를 오버라이드하여 재정의
    override fun eat() {
        println("${name}중에 ${type}을 먹었습니다.")
    }

    // cleaning() 메서드 정의
    fun cleaning() {
        println("${name}을 먹고 깨끗하게 청소 완료.")
    }
}
