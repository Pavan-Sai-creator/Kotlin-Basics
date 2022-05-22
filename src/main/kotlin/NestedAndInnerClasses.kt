class OuterClass{
    val a: Int = 5
    class NestedClass{
        fun nestedFunction(){
            println("I am in nested class")
        }
       // fun test() = a
       // You can't access members of outer class in a nested class
        // For that, you have to inner class
    }
}
