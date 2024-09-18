fun main() {
    println("Manejo De Excepciones")
    try {
        print("Ingresa un número: ")
        val numero = readln().toDouble()
        println(numero)
    } catch (e: Exception) {
        println("Entrada inválida debe ser un número")
    }
}