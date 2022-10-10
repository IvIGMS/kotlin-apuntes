fun main(args: Array<String>) {
    // Bucles
    val myArray = arrayOf("Ivan","Raul","Victor","Javier","Pablo")
    val myMap: Map<Int, String> = mapOf(9 to "Benzema", 10 to "Modric", 11 to "Vini Jr", 8 to "Kroos")

    // Vamos a recorrerlos con un bucle for

    for (nombre in myArray){
        println(nombre)
    }

    for (player in myMap){
        println("${player.key}, ${player.value}")
    }

    for (i in 0..3){
        print("Hola mundo, ")
    }

    // Bucle while

    var counter = 0

    println("")

    while (counter <= 2){
        print("${counter}. Hola. ")
        counter++
    }
}