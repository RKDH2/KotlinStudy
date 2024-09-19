package section__15

fun main() {
    var a = Fruit("사과", 2000)
    var b = Fruit("사과", 2000)
    var c = a
    var d = Fruit("바나나", 2000)

    // 내용은 같고, 객체는 불일치
    println(a == b)
    println(a === b)

    // 내용과 객체가 일치
    println(a == c)
    println(a === c)

    // 내용과 객체가 모두 불일치
    println(a == d)
    println(a === d)
}

class Fruit(val name: String, val price: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is Fruit) {
            return other.name == name && other.price == price
        } else {
            return false
        }
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + price
        return result
    }
}