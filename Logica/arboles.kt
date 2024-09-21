fun main() {
    for (i in 1 .. 10 step 1) {
        for (j in 1 .. (10-i)) {
            print(" ")
        }
        for (j in 1.. (1*i)) {
            print("*")
        }
        println()
    }

    println("--------------------------------------\n")

    fun main() {
        for (i in 1 .. 10 step 1) {
            for (j in 1..(1*i)) {
                print("*")
            }
            println()
        }
    }

    println("--------------------------------------\n")

    for (i in 1 .. 10 step 1) {
        for (j in 1 .. i/1){
            print(" ")
        }
        for (j in 10 downTo (i*1) ){
            print("*")
        }
        println()
    }

    println("--------------------------------------\n")


    for (i in 10 downTo 1 step 1) {
        for (j in 1..(1*i)) {
            print("*")
        }
        println()
    }

    println("----------------------------------------\n")


    for (i in 1.. 7 step 1) {
        for (j in 1.. (7-i)){
            print(" ")
        }
        for (j in 1..(i*2-1)){
            print("*")
        }
        println()
    }
    var k = 1
    for (i in 6 downTo 1){
        for (j in 1.. (k*1)) {
            print(" ")
        }
        k++;
        for (j in 1.. (i*2-1)){
            print("*")
        }
        println()
    }


}