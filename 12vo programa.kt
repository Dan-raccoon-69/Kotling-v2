fun main(){
    println("Arreglo De Sólo Lectura ********************")
    println("list0f")
    val arr = listOf("Hugo", "Paco", "Luis", "Ana")
    println(arr)
    //arr[2] "Juanito"
    println("Elemento en la posición 1: ${arr.get(1)}")
    val lista = intArrayOf(10, 20, 30, 40, 50)
    for (num in lista){
        println(num)
    }
    println("forEachIndexed")
    lista.forEachIndexed { indice, valor ->
        println("$indice = $valor")
    }
    println("for 1")
    for(indice in 0 until lista.size){
        println("$indice = ${lista[indice]}")
    }
    println("otra forma del for 2")
    for(indice in 0..<lista.size){
        println("$indice = ${lista[indice]}")
    }

    println("otra forma del for 3")
    for(indice in lista.indices){
        println("$indice = ${lista[indice]}")
    }


    println("\nArreglo Mutable **************")
    val arreglo = mutableListOf("Hugo", "Paco", "Luis", "Ana")
    println("Contenido: $arreglo")
    arreglo.add("Juanito")
    println("Elemento agregado (add): $arreglo")
    println("Borrar al elemento 2: ${arreglo.removeAt(2)}")
    println("Elemento 2 (remove): $arreglo")
    println("Borrar por nombre: ${arreglo.remove("Hugo")}")
    println("Elemento Hugo (remove): $arreglo")
    println("Modificación")
    arreglo.set(1, "Angel")
    println("Elemento Modificado: $arreglo")

    println("\nMapas o Diccionarios **************")
    val mapa = mutableMapOf<String, String>()
    mapa.put("gato", "Persona que hace mandados")
    mapa.put("perro", "Persona perrada")
    mapa.put("delfin", "Persona con inteligencia casi humana")
    println("Contenido del mapa o diccionario: ")
    println(mapa)
    mapa.forEach { clave, valor ->
        println("Palabra: $clave Significado: $valor")
    }
    println("Recuperar definición de un gato: ${mapa.get("gato")}")
    mapa.put("gato", "Animal muy mamifero")
    println("Nuevo significado del gato: ${mapa.get("gato")}")
    println("Claves")
    println(mapa.keys)
    println("Valores")
    println(mapa.values)
}



