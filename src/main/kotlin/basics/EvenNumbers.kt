package basics

class EvenNumbers {

    // 10 ile 20 arasindaki cift sayilari for kullanarak yazdirma
    fun getEvenNumbersWithFor() {
        for (a in 10..20) {
            if (a % 2 != 1) {
                println(a)
            }
        }
    }

    // 10 ile 20 arasindaki cift sayilari while kullanarak yazdirma
    fun getEvenNumberWithWhile() {
        var i = 10
        while (i <= 20) {
            println(i)
            i += 2
        }
    }

    // 10 ile 20 arasindaki cift sayilari do-while kullanarak yazdirma
    fun getEvenNumberWithDoWhile() {
        var i = 10
        do {
            println(i)
            i += 2
        } while (i <= 20)
    }

    // 10 ile 20 arasindaki cift sayilari forEach kullanarak yazdirma
    fun getEvenNumberWithforEach() {
        (10..20 step 2).forEach { i -> println(i) }
    }


    // 1-30 arasindaki cift sayilari continue kullanarak yazdirma
    fun getEvenNumberWithContinue() {
        var i = 0;
        while (i <= 30) {
            if (i % 2 == 1) {
                i++
                continue
            }
            println(i)
            i++
        }
    }
}