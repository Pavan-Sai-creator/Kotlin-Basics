fun printEvenNumbers(numbers:List<Int>,checkEvenNumber: (Int) -> Boolean){
    numbers.forEach {
        if(checkEvenNumber(it)){
            println("$it")
        }
    }
}

fun main(){
    val numbers = listOf(1,2,3,4,5,6,7,8,9,0)

    printEvenNumbers(numbers){
        if(it%2==0)
            true
        else
            false
    }

    // This is how functions can be passed as arguments

    // Other way of doing it, where we use functions as variables

//    val checkEvenNumber : (Int) -> Boolean = {
//        if(it%2==0)
//            true
//        else
//            false
//    }
//    printEvenNumbers(numbers,checkEvenNumer)
}