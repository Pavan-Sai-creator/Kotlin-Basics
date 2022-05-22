class OuterClass2 {

    val a = "Outside Nested class."

    inner class InnerClass {
        // You can now access members of outer class
        fun innerFunction() = a
    }
}