import POO.Alumno

fun main(){
    val cristian = Alumno()
    cristian.boleta = 2022601861
    cristian.nombre = "Cristian Alcantal"
    cristian.fechaTexto = "19/02/2003"
    cristian.estudiar()
    println("-----------------------------")
    println("Objeto creado con un constructor secundario")
    cristian.muestra()
    println("-----------------------------")
    println("Obieto creado con un constructor primario")
    val edgar = Alumno(2021602244, "Edgar Pedraza", "14/10/2002")
    edgar.muestra()
    println("-----------------------------")
    println("Objeto creado con un constructor secundario")
    val rogelio = Alumno("Rogelio Garcia", "18/10/2000")
    rogelio.muestra()
}
