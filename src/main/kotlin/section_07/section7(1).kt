package section_07

fun main() {
    var a = Person("RKDHS", 2007)
    var b = Person("Kotlin", 2011)

    println("안녕! 내 이름은 ${a.name}이고 ${a.year}에 태어났어!")
    println("안녕! 내 이름은 ${b.name}이고 ${b.year}에 태어났어!")

    // 메서드 호출
    a.introduce()
    b.introduce()

    // 보조 생성자 사용
    var c = Person("Java")
    var d = Person("Python")
}


class Person (var name:String, val year:Int) { // 자동으로 Getter, Setter 생성
    // 메서드 정의
    fun introduce() {
        println("안녕! 내 이름은 ${name}이고 ${year}에 태어났어!")
    }

    // init 함수
    init {
        println("안녕! 내 이름은 ${this.name}이고 ${this.year}에 태어났어!")
    }

    // constructor
    constructor(name:String) : this(name, 1991) {
        println("보조 생성자 사용")
    }
}