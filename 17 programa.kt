private var nullStrGlobal: String?=null
fun main() {
    println("?!! ?:")
    println("\nNull Safety")
    var nullstr: String? = null
    println(nullstr)
    nullstr = null//"Hola"
// println(nullStr.get(0))
    println(nullstr?.get(0))
    nullStrGlobal = null //"Android"
    println(nullStrGlobal?.get(0))
    println("Operador De Llamado Seguro (!!)")
    showMessage(nullstr)
    showMessage(nullStrGlobal)
    println("Operador Elvis ?:")
    nullStrGlobal = null //"Kotlin"
    val elvis = nullStrGlobal ?: "Java"
    println("Yo programo en $elvis")
    val noElvis = if (nullStrGlobal != null){
        nullStrGlobal
    }else{
        "Java"
    }
    println("Yo programo en $elvis")
}

private fun showMessage(msg: String?){
    println("? ${msg?.get(0)}")
    if (msg != null){
        println("! ${msg.get(0)}")
    }
    if (nullStrGlobal != null){
        println("!! ${nullStrGlobal!!.get(0)}")
    }
//println("!! ${nullStrGlobal!!.get(0)}")
}