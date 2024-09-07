import java.text.DecimalFormat
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round

fun main() {

    println("Operadores de procedencia")

    val c =  17 + 15/32 * 2 - 7+ 12
    println("c= $c")

    val numero = 10
    println(numero)

    val resul = numero + 10
    println(resul)

    // operadore de asignacion
    // var numero  = 10
    // numero  =  numeri  + 5 77 se puede reemplazar por el operador
    // numero+=5
    // printf(numero)

    //operadores de incremento y decremento
    var num1 = 10
    println(num1++)
    println(num1)

    println("Operadores de incremento y precendencia")
    var a = 10
    var b = 0
    b = ++a
    println("a= $a")
    println("b= $b")
    b = a++
    println("a= $a")
    println("b= $b")

    println("Operadores aritmeticos")
    print("Dame el valor de a: ")
    a = readln().toInt()

    print("Dame el valor de b: ")
    b = readln().toInt()

    println("$a + $b = ${a+b}")
    println("$a - $b = ${a-b}")
    println("$a * $b = ${a*b}")
    println("$a / $b = ${a/b}")
    println("$a % $b = ${a%b}")

    //operadores de asignacion
    print("Dame el valor de x: ")
    var x = readln().toInt()

    print("Dame el valor de y: ")
    val y = readln().toInt()

    val aux = x
    x+=y // x = x + y
    println("x= $aux + $y = $x")
    x = aux

    x-=y // x = x - y
    println("x= $aux - $y = $x")
    x = aux

    x*=y // x = x * y
    println("x= $aux * $y = $x")
    x = aux

    x/=y // x = x / y
    println("x= $aux / $y = $x")
    x = aux

    x%=y // x = x % y
    println("x= $aux % $y = $x")


    // CONVERSION DE ENTRE TIPOS DE DATOS

    val valor = "5"
    val r = valor.toInt() * 5
    println(r)

    print("Dame el valor del lado: ")
    val lado = readln().toDouble()
    val resu = lado * lado
    println("El area es $resu")

    // val pi = 3.14156
    // println(round(pi))

    val num = 3.5
    println(round(num).toInt()) // redondea a 4
    println(floor(num)) // redondea el numero hacia abajo
    println(ceil(num)) // redondea al num hacia arriba

    val pi = 3.14156
    println(DecimalFormat().format(pi))
    println(DecimalFormat("#.##").format(pi))

}