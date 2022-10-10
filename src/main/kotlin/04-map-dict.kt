fun main(args: Array<String>) {
    // Crear un map. Las claves son unicas.
    var myMap: Map<String,Int> = mapOf()

    // Inicializar valores
    myMap = mutableMapOf("Fede Valverde" to 0, "Vinicius Jr" to 11, "David Alaba" to 4)

    // Insertar elementos
    myMap["Luka Modric"] = 10
    myMap.put("Karim Benzema", 9)

    //Actualizar un elemento.
    myMap["Fede Valverde"] = 15

    // Acceder a un valor.
    println(myMap["Karim Benzema"])
}