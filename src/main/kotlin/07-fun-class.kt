fun main(args: Array<String>) {
    // Teoria sobre funciones
    fun sayHello(name: String) {
        println("Nice to meet you ${name}.")
    }

    fun sum(num1:Double, num2:Double) : Double {
        return num1 + num2
    }

    val numero = sum(4.5,6.7)
    sayHello("Ivan")
    println("El resultado de la suma es ${numero}.")

    // Clases

    val p1 = Programer("Ivan", 25, arrayOf(Programer.Languajes.JAVA,
        Programer.Languajes.JAVASCRIPT, Programer.Languajes.PYTHON), null)

    println("Mi nombre es ${p1.name}, tengo ${p1.age} years y el " +
            "lenguaje que utilizo ahora mismo es ${p1.languajes[0]}. Mis amigos son ${p1.friends}")

    val p2 = Programer("Marta", 21, arrayOf(Programer.Languajes.KOTLIN,
        Programer.Languajes.SWIFT), arrayOf(p1)
    )

    println("Mi nombre es ${p2.name}, tengo ${p2.age} years y el " +
            "lenguaje que utilizo ahora mismo es ${p2.languajes[0]}. Mis amigos son ${p2.friends?.first()?.name}")

    println("Lenguajes de programacion: ${p1.lenguajesLearned()}")
    println("Lenguajes de programacion: ${p2.lenguajesLearned()}")
}