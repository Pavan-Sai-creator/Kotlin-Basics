open class Human(_name: String,_age: Int) {
    val name: String
    val age: Int

    init {
        name=_name
        age=_age
        println("My name is $name")
        println("I am $age years old")
    }

    open fun displayPower(){
        println("My power is 80")
    }
}

class mathTeacher(_name: String,_age: Int) : Human(_name,_age){
    fun teachMaths(){
        println("I am teaching Maths.")
    }
}

class footballPlayer(_name:String,_age:Int,_club:String) : Human(_name,_age){
    val club: String
    init {
        club=_club
        println("I play for $club")
    }
    fun playFootball(){
        println("I am playing Football.")
    }
    override fun displayPower(){
        super.displayPower()
        // You can call functions of parent class from child class using the super keyword
        println("My fake power is 90")
    }
    // the name of this function is same in parent class as well. When you call player.displayPower,
    // the function from parent class will be executed. To avoid that, make the parent function
    // open and add override keyword to the function in child class

    // variables can be overrided in similar way
}