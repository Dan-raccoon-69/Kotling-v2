fun main() {
    println("if else anidado")
    print("Escribe un nombre: ")
    val name = readln()
    if (name == "Karina") {
        println("Hola Kary")
    } else if (name == "Pablo") {
        println("Hola Pablin")
    } else if (name == "Ricardo" || name == "Programas Kotlin") {
        println("Hola Rick")
    } else if (name == "Pamela") {
        println("Hola Pam")
    } else {
        println("Hola desconocido :)")
    }
    println("when -----------------")
    when (name) {
        "Karina" -> println("Hola Kary")
        "Pablo" -> println("Hola Pablin")
        "Ricardo", "Programa Kotlin" -> println("Hola Rick")
        "Pamela" -> println("Hola Pam")
        else -> println("Hola desconocido :)")
    }
}

