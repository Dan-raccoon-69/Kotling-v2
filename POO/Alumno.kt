package POO;

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

class Alumno(var boleta: Int,
             var nombre: String,
             var fechaTexto: String) {
    //constructor secundario
    constructor() : this(0, "", "")

    //constructor secundario
    constructor(nombre: String, fechaTexto: String) : this(0, "", "") {
        this.nombre = nombre.uppercase()
        this.fechaTexto = fechaTexto
    }

    fun estudiar() {
        println("Estudiando Kotlin")
    }

    fun obtenerEdad(): Int {
        val fechaDate = LocalDate.parse(fechaTexto, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        return Period.between(fechaDate, LocalDate.now()).years
    }

    fun muestra() {
        println(
            """
            Boleta: $boleta
            Nombre: $nombre
            Fecha De Nacimiento: $fechaTexto
            Edad: ${obtenerEdad()} años
            ...trimIndent()"""
        )
    }
}