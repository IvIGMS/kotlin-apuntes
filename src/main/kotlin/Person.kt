
// Todas las clases heredan de la superclase 'any'
// Con el modificador 'open' le decimos que esta clase es heredable, por defecto todas son final, al igual pasa con
// las funciones.
open class Person(val name: String, val age: Int) {
    open fun work() : String {
        return "Estoy trabajando en algo general"
    }
}

class Developer(name: String, age: Int,val lenguaje: String): Person(name, age) {
    override fun work(): String {
        return "Estoy trabajando en desarrollo de software"
    }

    fun sayLanguaje(): String {
        return lenguaje
    }
}

class Designer(name: String, age: Int): Person(name, age) {
    override fun work(): String {
        return "Estoy trabajando en el diseño de esta app"
    }
}