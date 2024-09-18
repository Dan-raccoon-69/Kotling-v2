
fun main(){
    println("Manejo De Excepciones")
    print("Ingresa un número: ")
    var num = readln()
    var res = esNumero(num)
    if (res){
        println("$num es un número")
    }else{
        println("$num no es un número")
    }
}

fun esNumero(valor: Any): Boolean {
    val resultado = try {
        valor.toString().toDouble()
        true
    }catch (e: Exception){
        false
    }
    return resultado
}
