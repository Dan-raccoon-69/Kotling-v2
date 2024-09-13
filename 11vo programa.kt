fun main() {
    println("Estructuras De Control Repetitivas")
    println("while")
    var i = 1
    while (i < 10) {
        print("$i ")
        i++
    }

    println("\ndo while")
    i = 1
    do {
        print("$i ")
        i++
    } while (i <= 10)

    println("\nfor")
    for (i in 1..10) {
        print("$i ")
    }

    println("\nfor con step")
    for (i in 1..10 step 2) {
        print("$i ")
    }

    println("\nfor con downto")
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println("\nfor con downto")
    for (i in 10 downTo 1 step 3) {
        print("$i ")
    }
    println("\nforEach con rango it")
    (1..5).forEach {
        print("$it")
    }
    println("\nforEach con range renombrado")
    (1..5).forEach { numero ->
        print("$numero")
    }

    println("\nforEach con rango renombrado cadena")
    val cadena = "Hola amigos como la ven"
    (cadena).forEach { letra ->
        print("$letra")
    }

    println("\nArreglos")
    val nombres = arrayOf("Karina", "Ricardo", "Pamela", "Ana")
    for(nombre in nombres){
        println(nombre)
    }

    i = 0
    println("---- otro for ----")
    for (i in 0..nombres.size-1){
        println("$i - ${nombres.get(i)}")
    }

    println("---- otro ejemplo de recorrido con el for ----")
    for (i in 0..nombres.size-1){
        println("$i - ${nombres[i]}")
    }
    println("---- otro ejemplo de recorrido con el for ----")
    for (i in nombres.indices){
        println("$i - ${nombres.get(i)}")
    }
    println("---- otro con forEachIndexed ----")
    nombres.forEachIndexed { posicion, valor ->
        println("$posicion - $valor")
    }

    println("return")
    (1..5).forEach {
        if (it == 3) {
            return@forEach
            // es el continue en java
            //return
        }
        println(it)
    }

    println("break")
    for (i in 1..5) {
        if (i == 3) {
            break
        }
        println(i)
    }

}