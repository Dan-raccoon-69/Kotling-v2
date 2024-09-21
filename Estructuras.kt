import kotlin.math.round

fun main(){
    var kilometrosTrayecto : Int = 0
    try {
        println("Kilometros del trayecto: ")
        kilometrosTrayecto = readln().toInt()

        println("Aplicar descuento: ")
        var aplicarDescu = readln()
        if (aplicarDescu.isEmpty()){
            aplicarDescu = "false"
        }

        when (aplicarDescu) {
            "1", "si", "SI" -> {
                println("Total a cobrar: $" + calcularConDescuento(kilometrosTrayecto))
            }
            "no", "false", "NO" -> {
                println("Total a cobrar: $" + calcularSinDescuento(kilometrosTrayecto))
            }
            else -> println("Opcion desconocida")
        }

    } catch (e: Exception) {
        println("Se debe ingresar los kilometros del trayecto")
    }
}


fun calcularConDescuento(kilometros: Int ) : Int{
    return round(kilometros * 2.25 * 0.55).toInt()
}


fun calcularSinDescuento(kilometros: Int ) : Int{
    return round(kilometros * 2.25).toInt()
}