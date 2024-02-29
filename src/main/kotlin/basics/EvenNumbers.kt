package basics

class EvenNumbers {
    fun getEvenNumbersWithFor() {
        for (a in 10..20) {
            if (a % 2 != 1) {
                println(a)
            }
        }
    }

    fun getEvenNumberWithWhile() {
        var i = 10
        while (i <= 20) {
            println(i)
            i += 2
        }
    }


    fun getEvenNumberWithDoWhile() {
        var i = 10
        do {
            println(i)
            i += 2
        } while (i <= 20)
    }


    fun getEvenNumberWithforEach() {
        (10..20 step 2).forEach { i -> println(i) }
    }
}