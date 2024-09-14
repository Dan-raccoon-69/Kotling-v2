fun main(){
    println("Tamanio arbol")
    val large = readln().toInt()
    var cf = 0

    for (i in 1 .. large step 1){
        for (j in 1 .. (large-i)){
            print(" ")
        }

        for (j in 1..(i*2-1)){
            print("*")
            cf = i*2-1
        }
        println()

    }

    // tronco
    for (k in 1..3 step 1){
        for (l in 1..(cf/2-1)){
            print(" ")
        }
        print("| |\n")
    }

}