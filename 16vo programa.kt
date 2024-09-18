fun main() {
    println("Manejo De Excepciones")
    println("Exception Personalizada")
    println("Ejemplo Del Cálculo Del Interes Bancario")
    try {
        print("Ingresa la cantidad de dinero del préstamo: ")
        var interes = calcularInteresPrestamo(readln().toDouble())
        println("El interes a pagar es: $$interes")
    } catch (e: Exception) {
        println(e.message)
    }
}

fun calcularInteresPrestamo(valor: Double): Double {
    if (valor >= 100_000.00) {
        throw Exception("El préstamo no puede ser mayor o igual a $100,000.00 pesos")
    }
    return valor * 0.10
}
