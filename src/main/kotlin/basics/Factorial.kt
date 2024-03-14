package basics

class Factorial {

    // Istenilen sayinin faktoriyelini bulma
    fun getFactorialNumbersample() {
        var i = 5
        var sayi = 1
        for (n in 1..i) {
            sayi *= n
        }
        println(sayi)
    }

    // Birden bese kadar olan sayilarin faktoriyelini ekrana yazdirma
    fun getFactorialNumberSample1() {
        for (i in 1..5) {
            var sayi = 1
            for (n in 1..i) {
                sayi *= n
            }
            println(sayi)
        }
    }

    // Recursıve fonksıyon kullanarak sayinin faktoriyelini ekrana yazdırma
    fun getFactorialNumberSample2(faktoriyelsayisi: Int): Int {
        if (faktoriyelsayisi == 0) {
            return 1
        } else return faktoriyelsayisi * getFactorialNumberSample2(faktoriyelsayisi - 1)
    }

    fun getFactorialWithRecursive() {
        println(getFactorialNumberSample2(faktoriyelsayisi = 6))
    }
}
