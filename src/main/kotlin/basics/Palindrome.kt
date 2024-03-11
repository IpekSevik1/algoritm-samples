package basics

class Palindrome {
    //girilen degerin polindrom olup olmadigini yazdirma
    fun getPalindromeSample() {
        println("Bir kelime giriniz?")
        val word: String = readLine().toString()
        // var word = {"i", "p", "e", "k"}
        var isPalindrom: Boolean = true
        for (i in 0 until word.length / 2) {
            if (word[word.length - 1 - i] != word[i]) {
                isPalindrom = false
                break
            }
        }
        // if (isPalindrom == true)
        if (isPalindrom) {
            println("Palindromdur.")
        } else {
            println("Palindrom degildir")
        }
    }
}