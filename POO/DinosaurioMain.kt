package POO

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    val objetos = mutableListOf<Dinosaurio>()
    var opcion: Int

    do {
        println("MENU DE OPCIONES")
        println("1. Crear objeto")
        println("2. Mostrar propiedades de los objetos")
        println("3. Salir")
        println("Elige una opción:")
        opcion = readln().toInt()

        when (opcion) {
            1 -> {
                println("Introduce el nombre del dinosaurio:")
                val nombre = readln()

                println("Introduce la especie:")
                val especie = readln()

                println("Introduce la fecha de descubrimiento (formato: dd-MM-yyyy):")
                val fechaDescubrimientoStr = readln()
                val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
                val fechaDescubrimiento = LocalDate.parse(fechaDescubrimientoStr, formatter)

                println("Introduce el peso en toneladas:")
                val pesoToneladas = readln().toDouble()

                val nuevoObjeto = Dinosaurio(nombre, especie, fechaDescubrimiento, pesoToneladas)
                objetos.add(nuevoObjeto)

                println("Objeto Dinosaurio creado correctamente.\n")
            }

            2 -> {
                if (objetos.isEmpty()) {
                    println("No hay objetos para mostrar.\n")
                } else {
                    objetos.forEachIndexed { index, objeto ->
                        println("Objeto Dinosaurio ${index + 1}:")
                        objeto.mostrarDinosaurio()
                        println()
                    }
                }
            }

            3 -> println("Saliendo del programa...")

            else -> println("Opción no válida, intenta de nuevo.\n")
        }

    } while (opcion != 3)
}