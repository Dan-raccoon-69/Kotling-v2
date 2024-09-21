fun main() {
    val ListaAlumnos = listOf("Jose", "Alberto", "Laura", "Noel", "Erika","Daniel")
    val Calificaciones = listOf(31.0, 94.0, 98.5, 75.0, 46.5, 75.0)
    println("\nPromedio de la calificación: " + promedioCalificaciones(Calificaciones))
    println("\nCalificacion más alta: " + calificacionAlta(Calificaciones))
    println("Calificacion más baja: " + calificacionBaja(Calificaciones))
    reprobados(Calificaciones,ListaAlumnos)
}

fun promedioCalificaciones(calificaciones : List<Double>): Double {
    var suma = 0.0
    calificaciones.forEachIndexed { indice, valor ->
            suma+=valor
    }
    return suma/calificaciones.size
}

fun calificacionAlta(calificaciones : List<Double>): Double {
    val mayor = calificaciones.max()
    return mayor
}

fun calificacionBaja(calificaciones : List<Double>): Double {
    val menor = calificaciones.min()
    return menor
}

fun reprobados(calificaciones : List<Double>, listaAlumnos : List<String>) {
    println("\nReprobados: ")
    var auxID = 0
    calificaciones.forEachIndexed { indice, valor ->
        if (valor < 60.0){
            auxID = indice
            println(listaAlumnos.get(auxID) + ", " + valor)
        }
    }

}


