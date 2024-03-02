package basics

class OddNumbers {
    //15 ve 17 sayilari haricinde 0-20 arasindaki tek sayilari yazdirma
    fun getOddNumbersWithFor() {
        for (a in 0..20)
            if ((a % 2 == 1) && (a != 15 && a != 17))
                println(a)

    }

    // 20-30 arasindaki sayilar haric 1-50 arasindaki tek sayilari yazdirma
    fun getOddNumbersSample2() {
        for (a in 1..50)
            if (a % 2 == 1 && !(a in 20..30)) {
                println(a)
            }
    }

    //1-50 arasindaki tek sayilarin kucukten buyuge 20 ile 30 arasindaki sayilari for kullanarak buyukten kucuge yazdirma
    fun getOddNumbersSample3() {
        for (a in 1..50) {
            if (a % 2 == 1) {
                if (a in 20..30) {
                    println(50 - a)
                } else {
                    println(a)
                }
            }
        }
    }

    //1-50 arasindaki tek sayilarin kucukten buyuge 20 ile 30 arasindaki sayilari while kullanarak buyukten kucuge yazdirma
    fun getOddNumbersSample4() {
        var a: Int = 1
        while (a in 1..50) {
            if (a % 2 == 1) {
                if (a in 20..30) {
                    println(50 - a)
                } else {
                    println(a)
                }
            }
            a++
        }
    }

    //1-50 arasindaki tek sayilarin kucukten buyuge 20 ile 30 arasindaki sayilari forEach kullanarak buyukten kucuge yazdirma
    fun getOddNumbersSample5() {
        (((1..50) step 2)).forEach { i ->
            when (i) {
                in 20..30 -> println(50 - i)
                else -> println(i)
            }
        }
    }

}

