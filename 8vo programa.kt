
fun main() {
    println("Forma original de una funcion")
    println(multi(2,3))

    println("Forma Original de una funcion lambda o anonima")
    multiLambda(2,3, { result -> println(result) })

    println("Forma simplificada de una funcion lambda o anonima")
    multiLambda(2,3) { result -> println(result) }

}

fun multi(i: Int, i1: Int): Int {
    return i * i1
}

fun multiLambda(i: Int, j: Int, callback: (result: Int) -> Unit) {
    callback(i * j)
}

