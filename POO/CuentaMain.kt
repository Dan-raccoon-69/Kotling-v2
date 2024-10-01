package POO
import Cuenta
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val cuenta = Cuenta("01-8547-9", "Alberto Palma", 5000.0)

    while (true) {
        println("Seleccione una opción:")
        println("1. Depositar")
        println("2. Retirar")
        println("3. Salir")
        val opcion = scanner.nextInt()

        when (opcion) {
            1 -> {
                try {
                    println("Ingrese el monto a depositar:")
                    val monto = scanner.nextDouble()
                    cuenta.depositar(monto)
                    cuenta.imprimirRecibo(monto)
                } catch (e: Exception) {
                    println("Monto incorrecto")
                    scanner.nextLine()
                }
            }
            2 -> {
                try {
                    println("Ingrese el monto a retirar:")
                    val monto = scanner.nextDouble()
                    if (cuenta.retirar(monto)) {
                        cuenta.imprimirRecibo(monto)
                    }
                } catch (e: Exception) {
                    println("Monto incorrecto")
                    scanner.nextLine()
                }
            }
            3 -> {
                println("Saliendo del programa.")
                return
            }
            else -> {
                println("Opción incorrecta. Intente de nuevo.")
            }
        }
    }
}