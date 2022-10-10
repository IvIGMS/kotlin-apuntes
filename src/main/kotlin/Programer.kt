// El constructor va en la declaracion de la clase y la declaracion de las variables tambien.

class Programer(val name:String, val age:Int, val languajes:Array<Languajes>, val friends: Array<Programer>? = null) {

    enum class Languajes{
        KOTLIN,SWIFT,JAVA,PYTHON,JAVASCRIPT;
    }

    fun lenguajesLearned(): String {
        var l = ""
        for(languaje in languajes) {
            l += "${languaje}, "
        }
        return l
    }
}