// When a function is common in all subclasses but the implementation is different in each
// subclass, you use abstract classes


abstract class Animal(name:String) {
    init {
        println("I am $name.")
    }
    fun describe(){
        println("I eat and walk")
    }
    val nose: Int = 1
    abstract val legs: Int
    abstract fun specialAbility()
}

class Horse(name:String): Animal(name){
    override val legs: Int = 4
    override fun specialAbility() {
        println("I can run fast")
    }
}

class Hyena(name:String): Animal(name){
    override val legs: Int=4
    override fun specialAbility() {
        println("I can laugh")
    }
}