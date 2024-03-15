package basics

class PrimeNumber {
    // istenilen sayinin asal olup olmadigini ekrana yazdirma
    fun getPrimeNumberSample() {
        var i = 8
        var asalSayi = true
        for (j in 2 until i) {
            if (i % j == 0) {
                asalSayi = false
                println("sayiniz asal degildir")
                break
            }
        }
        if (asalSayi) {
            println("sayiniz asaldir")
        }
    }

    // Birden yuze kadar olan asal sayilari ekrana yazdirma
    fun getPrimeNumberSample2() {
        for (i in 1..100) {
            var asalSayi = true
            for (j in 2 until i) {
                if (i % j == 0) {
                    asalSayi = false
                }
            }
            if (asalSayi) {
                println(i)
            }
        }
    }

    // Birden yuze kadar olan asal sayilarin toplamini ekrana yazdirma
    fun getPrimeNumberSample3() {
        var toplam = 0
        for (i in 1..100) {
            var asalSayi = true
            for (j in 2 until i) {
                if (i % j == 0) {
                    asalSayi = false
                }
            }
            if (asalSayi) {
                toplam += i
            }
        }
        println(toplam)
    }
}