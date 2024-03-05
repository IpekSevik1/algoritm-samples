package basics

class DivisorsOfNumber {
    fun getDivisorsOfNumber() {
        println("Bir sayi giriniz?")
        var a : Int = readln().toInt()
        for (bolen in 1..a) {
            if (a % bolen == 0) {
                println(bolen)
            }
        }
    }
}