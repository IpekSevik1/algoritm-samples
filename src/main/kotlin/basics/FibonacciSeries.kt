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

    // Recursıve fonksıyon kullanarak 4. fıbonaccı sayisini ekrana yazdırma
    fun getFibonacciSeriesSample3(n: Int): Int {
            if (n <= 1)
                return n;
        return getFibonacciSeriesSample3(n - 1) + getFibonacciSeriesSample3(n - 2)
    }

    // Recursıve fonksıyon kullanarak n. terime kadar fıbonaccı sayisini ekrana yazdırma
    fun getFibonacciSeriesWithRecursive(){
        for (i in 0..4){
            println( FibonacciSeries().getFibonacciSeriesSample3( n = i ))
        }
    }
}

