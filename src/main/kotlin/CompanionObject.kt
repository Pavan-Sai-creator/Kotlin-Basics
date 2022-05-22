// When you use companion objects, you can access the properties of the class by using class
// name without creating an object for it
class CompanionObject {
    companion object{
        fun test(){
            println("This is test function from CompanionObject class")
        }
    }
}