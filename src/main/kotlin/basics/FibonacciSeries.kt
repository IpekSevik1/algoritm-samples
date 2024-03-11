package basics

class FibonacciSeries {

    // Fibonacci dizisinin ilk on degerini ekrana yazma
    fun getFibonacciSeriesSample() {
        // dizinin ilk degerini degistirerek donguyu farkli sayilarla baslatabiliriz
        var ilk = 0
        var ikinci = 1
        for (i in 1..10) {
            var son = ilk + ikinci
            println(ilk)
            ilk = ikinci
            ikinci = son
        }
    }


    // Fibonacci dizisinin 24.terimini ekrana yazdirma
    fun getFibonacciSeriesSample2() {
        var ilk = 0
        var ikinci = 1
        for (i in 1..24) {
            var son = ilk + ikinci
            if (i == 24) {
                println(ilk)
            }
            ilk = ikinci
            ikinci = son


        }
    }


    // Dizi kullanarak Fibonacci dizisinin ilk bes terimini ekrana yazdirma
    fun getFibonacciSeriesSample3() {
        //println(dizi[4])        1.yol
        //println(dizi.get(6))    2.yol
        val dizi = arrayOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144)
        for (i in 0..4) {
            println(dizi[i])
        }

    }


    // Dizideki sayilari yeni sayilarla degistirip ekrana yazdirma
    fun getFibonacciSeriesSample4() {
        val dizi = arrayOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144)
        for (i in 0..12) {
            //iki sekilde de terimleri degistebiliyoruz
            dizi[0] = 36
            dizi.set(3, 17)
            //dizi.add("1")           ----->>> kullanamiyoruz! cunku arrayOf
            // dizi.add(4,"kirmizi")   ----->>> kullanamiyoruz! cunku arrayOf

            println(dizi.get(i))
            //println(dizi[i])
        }
    }


    // Diziye sonradan terim ekleyerek olusturma
    fun getFibonacciSeriesSample5() {
        var liste = ArrayList<String>()
        liste.add("0")
        liste.add("1")
        liste.add("ipek")
        liste.add("1")
        liste.add("2")
        liste.add("3")
        liste.add("5")
        liste.add("8")

        //iki sekilde de terimleri degistirebiliriz
        liste.add(4, "kirmizi")
        liste.set(3, "sevik")

         println(liste)
        // println(liste[4])
        //println(liste.get(7))
    }
}

