package basics

class Palindrome {
    //girilen degerin polindrom olup olmadigini yazdirma
    fun getPalindromeSample() {
        println("Bir kelime giriniz?")
        val word: String = readLine().toString()
        // var word = {"i", "p", "e", "k"}
        var isPolindrom: Boolean = true
        for (i in 0 until word.length / 2) {
            if (word[word.length - 1 - i] != word[i]) {
                isPolindrom = false
                break
            }
        }

        if (isPolindrom) {
            println("Palindromdur.")
        } else {
            println("Polindrom degildir")
        }
    }
}