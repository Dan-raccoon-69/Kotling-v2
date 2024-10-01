var saldoAn = 0.0
var tipoMovimiento = ""
class Cuenta(val clave: String, val titular: String, var saldo: Double) {

    fun depositar(monto: Double) {
        saldoAn = saldo
        saldo += monto
        tipoMovimiento = "Deposito de dinero"
        println("Se ha depositado: $monto")
    }

    fun retirar(monto: Double): Boolean {
        return if (monto > saldo) {
            println("El monto a retirar ($monto) no puede ser mayor que el saldo ($saldo). No se pudo realizar la acción solicitada.")
            false
        } else {
            saldoAn = saldo
            saldo -= monto
            tipoMovimiento = "Retiro de dinero"
            println("Se ha retirado: $monto")
            true
        }
    }

    fun imprimirRecibo(monto: Double) {
        println("Recibo:")
        println("Clave: $clave")
        println("Titular: $titular")
        println("Acción: $tipoMovimiento")
        println("Saldo anterior: $${saldoAn}")
        println("Monto: $$monto")
        println("Nuevo saldo: $$saldo")
    }
}