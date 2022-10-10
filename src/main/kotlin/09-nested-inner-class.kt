fun main(args: Array<String>) {
    // Instanciamos nuestra clase interna que esta dentro de MyNested...

    // Llamamos a la clase anidada:
    val miSuma = MyNestedAndInnerClass.MyNestedClass()
    println(miSuma.sum(4,7))

    // Llamamos a la calse interna: a esta se le ponen los parentesis.
    val sumaInterna = MyNestedAndInnerClass().MyInnerClass()
    println(sumaInterna.getNumber())
}