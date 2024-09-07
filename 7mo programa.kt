
fun main() {
    println("****** Funciones ******")
    println("Invocacion de una funcion basica")
    basico()

    println("Invocacion de una funcion con argumentos y parametros")
    println("Dame tu nombre")
    val name = readln()

    println("Dame tu edad")
    val edad = readln().toInt()
    arguments(name, edad)

    println("Invocacion de una funcion con valores de retorno")
    print("Dame el valor de a: ")
    val a = readln().toDouble()

    print("Dame el valor de b: ")
    val b = readln().toDouble()
    val c = suma5(a, b)
    println("La suma de a + b es = $c")

    val c1 = suma1(a,b)
    println("La suma de a + b es = $c1")

    // SOBRECARGA
    println("SOBRECARGA DE FUNCIONES O METODOS")

    println("Dame tu nombre")
    val nombre = readln()

    println("Dame tu edad")
    val age = readln().toInt()

    overload(age)

    println("Dame tu trabajo")
    val work = readln()

    overload(work)

    println("Dame tu lenguaje favorito")
    val lenguaje = readln()

    overload(work, lenguaje)
    overload(nombre, age, lenguaje)

    println("Salario base de $5000 y por centaje de impuesto del 10%")
    println("Impuesto a pagar FIJO es de $ ${calcularImpuesto()}")
    println("Impuesto a pagar $ ${calcularImpuesto(10_000.00,0.16)}")
    println("Impuesto a pagar con salario base de $20,000.00 $ ${calcularImpuesto(20_000.00)}")
    println("Impuesto a pagar con impuesto del 5% $ ${calcularImpuesto(impuesto = 0.5)}")

}

fun calcularImpuesto(sueldo: Double = 5000.0, impuesto: Double = 0.1): Double {
    return sueldo * impuesto
}

fun suma5(a: Double, b: Double): Double {
    return a + b
}

fun suma1(a: Double, b:Double) = a + b


fun overload(nombre: String, age: Int, lenguaje: String) {
    println("Mi nombre es $nombre y mi edad $age y mi lenguaje favorito es $lenguaje")
}

fun arguments(nombre: String, edad: Int) {
    println("Hola $nombre con edad $edad")
}


fun overload(nombre: String, edad: Int, trabajo: String, lenguaje: String) {
    println("Mi nombre es $nombre , mi edad es $edad , trabajo en $trabajo y mi lenguaje favorito es $lenguaje")
}

fun overload(edad: Int) {
    println("Edad es: $edad")
}

fun overload(work: String) {
    println("Trabajo es: $work")
}

fun overload(work: String, lenguaje: String = "Kotlin") {
    println("Mi trabajo es $work con el  lenguaje $lenguaje")
}

fun basico(){
    println("Hola a todos")
}
