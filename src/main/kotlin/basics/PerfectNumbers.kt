class PerfectNumbers {
    //Girilen sayinnin mukemmel sayi olup olmadigini ekrana yazdirma
    fun getPerfectNumbersSample() {
        println("Bir sayi giriniz?")
        val a: Int = readln().toInt()
        var toplam: Int = 0
        for (bolen in 1..a / 2) {
            if (a % bolen == 0) {
                toplam += bolen
            }
        }
        if ((toplam == a)) {
            println("$a sayisi mukemmel sayidir ")
        } else {
            println("$a sayisi mukemmel sayi degildir ")
        }
    }

    // 1-10000 arasindaki mukemmel sayilari ekrana yazdirma
    fun getPerfectNumbersSample2() {

        for (a in 1..10000) {
            var toplam: Int = 0
            for (bolen in 1..a / 2) {
                if (a % bolen == 0) {
                    toplam += bolen
                }
            }
            if ((toplam == a)) {
                println("$a Sayisi mukemmel sayidir ")
            }
        }
    }
}