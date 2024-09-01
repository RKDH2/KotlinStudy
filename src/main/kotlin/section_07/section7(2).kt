package section_07

fun main() {
    var a = Fruits("apple", 2000)
    var b = FruitsBox("banana")

    a.intro()
    b.intro()

    b.fruitPrice()
}

// open 키워드 사용
open class Fruits (var name:String, var price:Int) {
    fun intro() {
        println("과일의 이름은 ${name}이고 가격은 ${price}입니다.")
    }
}

class FruitsBox (name:String) : Fruits (name, 2000) {
    fun fruitPrice() {
        println("과일의 가격은 2000원입니다.")
    }
}