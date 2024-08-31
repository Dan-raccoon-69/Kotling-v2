
fun main(){
    print("Ingresa el valor de x: ")
    var x = readln().toInt()

    print("Ingresa el valor de y: ")
    var y = readln().toInt()

    var aux = x
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

}