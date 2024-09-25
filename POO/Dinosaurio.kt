package POO
import java.time.LocalDate

class Dinosaurio(val nombre: String,
                 val especie: String,
                 val fechaDescubrimiento: LocalDate,
                 val pesoToneladas: Double) {

    fun mostrarDinosaurio() {
        println("Nombre: $nombre")
        println("Especie: $especie")
        println("Fecha de Descubrimiento: $fechaDescubrimiento")
        println("Peso en Toneladas: $pesoToneladas")
    }
}