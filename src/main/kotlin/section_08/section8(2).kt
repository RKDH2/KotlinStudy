package section_08

fun main() {
    var price = 7000

    var a = Fruit("Apple", 3000).apply {
        name = "[할인!] $name"
        discount()
    }

    val result = run {
        val name = "Banana"
        val price = 2000
        "과일 이름 : ${name}, 가격 : ${price}원"
    }

    println(result)

    // run 사용
    a.run {
        println("과일 이름 : ${name}, 가격 : ${price}원")
    }

    // with 사용
    with(a) {
        println("과일 이름 : ${name}, 가격 : ${price}원")
    }

    // let 사용
    a.let {
        println("과일 이름 : ${it.name}, 가격 : ${it.price}원")
    }
}

class Fruit(var name:String, var price:Int) {
    fun discount() {
        price -= 2000
    }
}
