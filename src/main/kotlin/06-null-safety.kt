fun main(args: Array<String>) {
    // Variable null safety
    var name: String?
    name = "Ivan"

    // Safe calls: es lo mismo que el optional binding de swift
    name?.let {
        println("Hola, mi nombre es ${it}")
    } ?: run {
        println("Aun no me has dicho como te llamas.")
    }

    // Prueba

    val nombres = listOf<String>("Rarmiro","Guadalupe","Ana Maria","Lucas")

    nombres.forEach {
        print("${it}, ")
    }
}