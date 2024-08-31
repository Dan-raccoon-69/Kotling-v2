
fun main(){
    basic()

    print("Ingresa el valor de a: ")
    var a = readln().toDouble()

    print("Ingresa el valor de b: ")
    var b = readln().toDouble()

    suma(a,b)

    var c = suma2(a,b)
    println("El valor de c es : $c")

    var d = suma3(a,b)
    println("El valor de d es : $d")

}

fun basic(){
    println("Hola amigos")
}

fun suma(a: Double, b:Double){
    println("Suma: ${a+b}")
}

fun suma2(a: Double, b:Double): Double{
    return a+b;
}

//  función de una sola expresión o single expression function
fun suma3(a: Double, b:Double) = a+b;