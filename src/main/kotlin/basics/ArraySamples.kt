package basics

class ArraySamples {
    // Listedeki istenilen sayilarin aritmetik ve geometrik ortalamalarinin bulunmasi
    fun getArraySample() {
        println("Kac tane sayinin ortalamasini istiyorsunuz?")
        var sayi: Int = readln().toInt()
        println("Sayi giriniz?")
        var listem: ArrayList<Int> = ArrayList()
        for (i in 0 until sayi) {
            var girilenDeger: Int = readln().toInt()
            listem.add(girilenDeger)
        }
        var toplam = 0
        for (j in 0 until sayi) {
            toplam += listem[j]
        }
        var aritOrt: Double = toplam / sayi.toDouble()

        println("Sayinizin aritmetik ortalamasi: $aritOrt ")
        var carpim: Int = 1
        for (j in 0 until sayi) {
            carpim *= listem[j]
        }
        var geoOrt: Double = Math.sqrt(carpim.toDouble())
        println("Sayinizin geometrik ortalamasi: $geoOrt")
    }

    // Listedeki dorde veya bese bolunen sayilari yazdirma
    fun getArraySample2() {
        println("On tane sayi giriniz?")
        var listem: ArrayList<Int> = ArrayList()
        for (i in 0 until 10) {
            var sayi: Int = readln().toInt()
            listem.add(sayi)
        }
        for (i in 0 until 10) {
            if (listem[i] % 4 == 0 || listem[i] % 5 == 0) {
                println(listem[i])
            }
        }
    }

    // Fibonacci serisinin ilk on terimini ekrana yazdirma
    fun getArraySample3() {
        var listem: ArrayList<Int> = ArrayList()
        for (i in 0..10) {
            if (listem.size < 2) {
                listem.add(i)
            } else {
                var ilk = listem[i - 2]
                var ikinci = listem[i - 1]
                var son = ilk + ikinci
                listem.add(son)
            }
        }
        println(listem)
    }

    // Random sayilarla olusturulan listedeki tek sayilar yerine 10 yazdirma
    fun getArraySample4() {
        var listem: ArrayList<Int> = ArrayList()
        for (i in 0..9) {
            var sayi = (1..100).random()
            listem.add(sayi)
        }
        for (i in 0 until 10) {
            if (listem[i] % 2 == 1) {
                listem[i] = 10
            }
        }
        println(listem)
    }

    // Random sayilarla olusturulan listedeki tek sayi olan indisler yerine 10 yazdirma
    fun getArraySample5() {
        var listem: ArrayList<Int> = ArrayList()
        for (i in 0..9) {
            var sayi = (1..100).random()
            listem.add(sayi)
        }
        for (i in 0 until 10) {
            if (i % 2 == 1) {
                listem[i] = 10
            }
        }
        println(listem)
    }
}