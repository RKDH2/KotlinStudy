package section_05

fun main() {
    for (i in 0..9) {
        print(i)
    }

    for (i in 0..9 step 3) {
        print(i)
    }

    for (i in 9 downTo 0) {
        print(i)
    }

    // List
    var list = listOf(1, 2, 3, 4, 5)

    for (i in list) {
        print(i)
    }

    // Array
    var array = arrayOf(1, 2, 3, 4, 5)

    for (i in array) {
        print(i)
    }

    // a ~ z
    for (i in 'a'..'z') {
        print(i)
    }
}