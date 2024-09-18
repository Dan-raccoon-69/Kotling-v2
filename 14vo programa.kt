import java.io.File
import java.io.FileNotFoundException

fun main(){
    println("Manejo De Excepciones")
    try {
        print("Ingresa las repeticiones: ")
        val repeticiones = readln().toInt()
        val mensaje = File("C:\\Usuarios\\gusta\\Descargas\\prueba1.txt")
            .readLines()[0]
        for (i in 0 until repeticiones) println(mensaje)
    } catch (e: FileNotFoundException) {
        println("El archivo no se encuentra")
    } catch (e: NumberFormatException) {
        println("Entrada invalida, debe ser un número")
    } catch (e: Exception) {
        println("Entrada Invalida")
    }
    finally {
        println("siempre me ejecuto")
    }

}
