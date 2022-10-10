fun main(args: Array<String>) {

    val country = "Spain"

    when (country) {
        "Spain", "Mexico", "Colombia", "Argentina" -> {
            println("El idioma es espanol")
        }

        "USA" -> {
            println("El idioma es ingles")
        }

        "Italia" -> {
            println("El idioma es frances")
        }

        else -> {
            println("No hemos encontrado ninguna coindidencia.")
        }
    }

// When con int

    val age = 20

    when (age) {
        0, 1, 2 -> {
            println("Eres un bebe")
        }

        in 3..10 -> {
            println("Eres un nino")
        }

        in 11..17 -> {
            println("Eres un adolescente")
        }

        in 18..69 -> {
            println("Eres un adulto")
        }

        in 70..99 -> {
            println("Eres un anciano")
        }

        else -> {
            println("Increible!")
        }
    }
}

