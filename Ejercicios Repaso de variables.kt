import java.text.DecimalFormat
import kotlin.math.pow

fun main(){

    /*
    // PRIMER PROGRAMA

    println("Ingresa el Nombre de la calle: ")
    val nombreCalle = readln()

    println("Ingresa la Ciudad: ")
    val ciudad = readln()

    println("Ingresa el Estado: ")
    val estado = readln()

    println("Ingresa el Pais")
    val pais = readln()

    println("Ingresa el Codigo Postal")
    val cp = readln()

    println("$nombreCalle, $ciudad, $estado, $pais, $cp ")
    */


    /*

    println("Ingresa salario mensual bruto: ")
    val smb = readln().toDouble()

    println("Ingresa impuesto mensual (porcentaje): ")
    val imp = readln().toDouble()

    val impuestoMensual = (smb * imp)/100
    val salarioMensualNeto = smb - impuestoMensual

    println("Salario Mensual neto: $" + DecimalFormat("#.##").format(salarioMensualNeto))
    println("Impuestos a pagar por mes: $" + DecimalFormat("#.##").format(impuestoMensual))

    val salarioAnual = smb * 12
    val impuestoAnual = (salarioAnual * imp)/100
    val salarioAnualNeto = salarioAnual - impuestoAnual

    println("\nSalario Anual neto: $" + DecimalFormat("#.##").format(salarioAnualNeto))
    println("Impuestos a pagar por año: $" + DecimalFormat("#.##").format(impuestoAnual))

    */


    println("Ingresa el radio en cm: ")
    val radio = readln().toDouble()

    datosCentimetros(radio)
    datosPulgadas(radio)
}

fun areaCirculo(radio: Double) {
    println("\nArea                      | " + DecimalFormat("#.##").format(Math.PI * radio * radio))
}

fun areaCirculoPulgadas(radio: Double) {
    println("\nArea                      | " + DecimalFormat("#.##").format((Math.PI * radio * radio) / 2.54))
}

fun datosCentimetros(radio: Double) {
    print("*** CENTIMETROS *** ")
    areaCirculo(radio)
    circunferenciaCirculo(radio)
}

fun circunferenciaCirculo(radio: Double) {
    println("Circunferencia            | " + DecimalFormat("#.##").format(Math.PI * (radio*2)))
}

fun circunferenciaCirculoPulgadas(radio: Double) {
    println("Circunferencia            | " + DecimalFormat("#.##").format((Math.PI * (radio*2))/ 2.54))
}

fun datosPulgadas(radio: Double) {
    print("\n*** PULGADAS *** ")
    areaCirculoPulgadas(radio)
    circunferenciaCirculoPulgadas(radio)
}