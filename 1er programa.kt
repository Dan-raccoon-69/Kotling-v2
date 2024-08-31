const val PI=3.1416

fun main() {

    //8 bit -128 to 127
    val jobs: Byte = 3
    println("$jobs trabajos")

    //16 bit -32768 to 32767
    val workedDays: Short = 200
    println("$workedDays dias trabajados")

    //32 bit -2,147,483,648 to 2,147,483,647
    val workedMinutes: Int = 288000
    println("$workedMinutes minutos")

    //64 bit -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
    val workedInMilliseconds: Long = 17280000000
    println("$workedInMilliseconds milisegundos trabajados")

    //32 bit 1.40129846432481707e-45 to 3.40282346638528860e+38
    val height: Float = 1.75F
    // El uso de las llaves es para delimitar exactamente lo que es una variable
    // y lo que es un string
    println("Estatura ${height}m")

    //:Float...333f //64 bit 4.94065645841246544e-324 to 1.79769313486231570e+308
    val heightDouble: Double = 1.75333333333333
    println("Estatura ${heightDouble}m")

}
