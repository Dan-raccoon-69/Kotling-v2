package Logica

fun main() {
    println("Hola mundo")
    numeros(5,2,7)
    numeros(12,0,3)
    numeros(5,6,4)
    numeros(10,12,11)
    numeros(-25,100,20)
    numeros(-25,20,20)
    numeros(20,20,20)
    numeros(4,6,7)
    numeros(7, 4, 6)

}

fun numeros(a : Int, b : Int, c : Int) {
    var mayor = a
    var chico = a

    if (b > mayor) mayor = b
    if (c > mayor) mayor = c
    if (b < chico) chico = b
    if (c < chico) chico = c

    val mediano = when {
        (mayor == b && chico == c) || (mayor == c && chico == b) -> a
        (mayor == a && chico == c) || (mayor == c) -> b
        else -> c
    }
    println("\n\nNumeros: $a,$b,$c\nGrande: $mayor\nMediano: $mediano\nChico: $chico")
}