fun main(args: Array<String>) {
    var direccion: Direction? = Direction.NORTH

    println("Vamos a ir en la direccion ${direccion?.name}")
    println("Vamos a ir en la direccion ${direccion?.ordinal}")

    // Llamamos a la funcion description que retorna un String dependiendo del valor que toma el objeto Direction
    print(direccion?.description())

    print(direccion?.dir)
    print(direccion?.value)
}