fun main() {
    println("when --------")
    print("Escribe tu edad: ")
    var edad = readln().toInt()
    when {
        edad < 18 -> println("Es menor de edad")
        edad < 60 -> println("Es mayor de edad")
        edad < 119 -> println("Es de la tercera edad")
        else -> println("No es humano")
    }
    when(edad) {
        in 1 .. 17 -> println("Es menor de edad")
        in 18..59 -> println("Es mayor de edad")
        in 60..118 -> println("Es de la tercera edad")
        else -> println("No es humano")
    }


    println("\n -------------- \nOtro ejemplo when")
    print(
        """Selecciona un genero musical
        1- Pop
        2- Regueton
        3- Balada
        4- Mariachi
        5- Cumbia
        6- Tango
        Opcion: """)
        val genero = readLine()
    when (genero) {
        "1" -> {
            println("Ariana Grande")
            println("Y es una excelente bailarina")
        }
        "3", "4" -> println("Juan Gabriel")
        "5" -> println("Selena")
        "2" -> println("Bad Bunny")
        else -> println("Gardel")
    }
    println("Adios")

}
