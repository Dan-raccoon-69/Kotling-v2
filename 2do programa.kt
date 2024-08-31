
fun main(){
    print("Ingresa tu nombre: ")
    val name = readln()

    print("Ingresa tu edad: ")
    val age = readln().toInt();

    /*
    val age = readln().toInt()
    */

    //Java
    println("Tu nombre es "+name+" y tu edad es "  + age + " años")

    //Kotlin
    println("Tu nombre es $name y tu edad es $age años")

    //Kotlin con secuencias de escape
    print("Tu nombre es $name\n y tu edad es $age años\n")

    //Raw String
    print(""" 
        Tu nombre es: $name
        Con edad de : $age años
    """)

        print(""" 
            Tu nombre es: $name
            Con edad de : $age años
        """.trimIndent())

}