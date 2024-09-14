fun main(){
    fibonacci(5)
}

fun fibonacci(n : Int){
    //0,1,1,2,3,5,8,13 ...
    var before = 0
    var now = 1
    var suma = 0

    if (n < 1) {
        print("La secuencia debe tener al menos un número.")
        return
    }

    if (n == 1) {
        print(before)
        return
    }

    print("$before $now")
        for (i in 1..n-2){
            suma = before + now
            print(" $suma")
            before = now
            now = suma
        }
}