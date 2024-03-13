# My Algorithm Notes
## Arrays

```kotlin
// arrayOf da Indexi girilen dizinin elemanini getirme
println(dizi[4])        // 1.yol
println(dizi.get(6))    // 2.yol


Examp

fun getFibonacciSeriesSample3() {

    val dizi = arrayOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144)
    for (i in 0..4) {
        println(dizi[i])
    }
}

// Dizideki sayilari yeni sayilarla degistirip ekrana yazdirma
//iki sekilde de terimleri degistebiliyoruz
dizi[0] = 36
dizi.set(3, 17)
// dizi.add("1")           ----->>> kullanamiyoruz! cunku arrayOf
// dizi.add(4,"kirmizi")   ----->>> kullanamiyoruz! cunku arrayOf

Examp
fun getFibonacciSeriesSample4() { 
    val dizi = arrayOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144)
    for (i in 0..12) {
        dizi[0] = 36
        dizi.set(3, 17)
        println(dizi.get(i))
        //println(dizi[i])
    }
}


// Diziye sonradan terim ekleyerek olusturma (arraylist kullandik)
//iki sekilde de terimleri degistirebiliriz
//liste.add(4, "kirmizi") 
// liste.set(3, "sevik")

//println(liste)
// println(liste[4])
//println(liste.get(7))

Examp
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
    liste.add(4, "kirmizi")
    liste.set(3, "sevik")
    println(liste)
}

```

