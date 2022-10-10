fun main(args: Array<String>) {
    // Creamos un array
    val myArray = arrayListOf<String>("Ivan","Frias","Apple","25","Spain")
    // insertar datos
    myArray.add("Extremadura")
    myArray.add("Kotlin")
    myArray.add(0, "Juan") // No sobreescribe.
    // insertar un conjunto de datos
    myArray.addAll(listOf("Uno","Dos","Tres","Cuatro"))

    // Acceso a elementos
    println(myArray[3])
    myArray.first()
    myArray.last()

    // Modificar datos
    myArray[3] = "Microsoft"

    // Borrar datos
    myArray.removeAt(5)

    // Recorrer datos del array. It es cada dato iterado.
    myArray.forEach {
        println(it)
    }

    // Ordenar array
    myArray.sort()

    // Longitud del array
    println(myArray.size)
    println(myArray.count())

    // Eliminar el array al completo
    myArray.clear()

    // Crear un array a partir de un rango
    var array2:IntRange = (1..10)

    for (num in array2){
        print("${num}, ")
    }
}