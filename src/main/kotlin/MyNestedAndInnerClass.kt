
// La principal diferencia diferencia entre las clases anidadas y las internar es que desde las internas se puede acceder
// a las variables de la clase que las envuelve, y desde las anidadas no se puede.

class MyNestedAndInnerClass {

    val num1 = 10
    class MyNestedClass { /* Clase anidada */

        val num2 = 3 // Esta variable si que es accesible desde la clase.

        fun sum(first:Int, second:Int) : Int {
            return first + second + num2
        }
    }

    inner class MyInnerClass { /* Clase interna */
        fun getNumber() : Int {
            return num1
        }
    }
}