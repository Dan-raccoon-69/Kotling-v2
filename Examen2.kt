val cantidadIngrediente = arrayOf(
    20.0,
    1.0,
    7.5,
    3.75,
    1.5,
    0.15,
    0.05,
    12.0
)

var nombrePrograma: String = "\n## Ingredientes y costo de pedidos de donas ##"
fun main() {
    println(nombrePrograma)

    while (true) {
        try {
            print("\nTotal de donas a elaborar: ")
            val totInput = readLine()!!

            val total = totInput.toIntOrNull() ?: throw NumberFormatException("Se debe ingresar un número entero.")

            if (total < 20) {
                println("El pedido debe ser de mínimo 20 donas.")
                continue
            }

            val costo = if (total < 100) {
                total * 6.0
            } else {
                total * 5.55
            }

            println(
                """
                ****************************************************************
                Ingredientes para $total donas
                Harina       | ${Math.round(cantidadIngrediente[0] * total)} gramos
                Levadura     | ${Math.round(cantidadIngrediente[1] * total)} gramos
                Azúcar       | ${Math.round(cantidadIngrediente[2] * total)} gramos
                Leche        | ${Math.round(cantidadIngrediente[3] * total)} mililitros
                Mantequilla  | ${Math.round(cantidadIngrediente[4] * total)} gramos
                Huevo        | ${Math.round(cantidadIngrediente[5] * total)} huevos
                Sal          | ${Math.round(cantidadIngrediente[6] * total)} gramos
                Aceite       | ${Math.round(cantidadIngrediente[7] * total)} mililitros
                ****************************************************************
                Total a cobrar: $${Math.round(costo)}
                ****************************************************************
                """.trimIndent()
            )

            print("\n¿Deseas calcular otro pedido? (si (1)/no): ")
            val respuesta = readLine()!!

            if (respuesta.equals("no", ignoreCase = true) || respuesta.toInt() != 1) {
                println("\nGracias por usar el programa.")
                break
            }

        } catch (e: NumberFormatException) {
            println("Se debe ingresar un número entero, intenta nuevamente.")
        }
    }
}
