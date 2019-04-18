package io.access.kotlintraining

fun hello() {
    println("hello world!")
}

fun fizzbuzz(){
    //exercise 1
    for (i in 1..100){
        if (i % 15 == 0) {
            println("fizzbuzz")
        }
        else if (i%5 == 0) {
            println("buzz")
        }
        else if(i % 3 == 0) {
            println("fizz")
        }else{
            println("$i")
        }
    }
}

// うるう年かどうかを判定する関数
fun isLeapYear(y: Int): Boolean {
    /* TODO: test */

        if(y%4 == 0){
            if(y%100 == 0 && y%400 !=0){
                return false
            }else{
                return true
            }
        }else{
            return false
        }

}


fun Int.isOdd():Boolean{
    if (this%2 == 0){
        return true
    }else{
        return false
    }
}

fun Int.isEven():Boolean{
    if (this%2 == 0){
        return false
    }else{
        return true
    }
}

