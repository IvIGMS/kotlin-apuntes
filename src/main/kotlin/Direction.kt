// Podemos asignarle una variable o mas a cada elemento del enum.

enum class Direction(val dir: Int, val value: String) {
    NORTH(0, "norte"),SOUTH(1, "sur"),EAST(2, "este"),WEST(3, "oeste");

    // Dentro del enum vamos a crear una funcion que nos va a devolver un string dependiendo del valor del enum
    // que le hayamos asignado.

    fun description(): String {
        return when (this){
            NORTH -> "La direcion es norte"
            SOUTH -> "La direccion es sur"
            EAST -> "La direccion es este"
            WEST -> "La direccion es oeste"
            // Tenemos que examinar todos los posibles valores del enum, pero le podemos poner un else que funcion
            // como si guese un default.
        }
    }
}