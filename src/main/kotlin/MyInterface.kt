// Interfaces can have functions with implementation and abstract functions
// But, they can't have variable declarations. All variables must be abstract

interface MyInterface {
    val variable: Int
    // In interfaces variables is abstract by default
    fun functionWithImplementation(){
        println("This function is within the interface and has default implementation.")
    }
    fun abstractFunction()
}

class child : MyInterface{
    override val variable: Int = 1
    override fun abstractFunction() {
        println("This is the implementation of abstractFunction in child class.")
    }
}