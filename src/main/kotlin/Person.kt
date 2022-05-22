class Person(val _firstName: String = "First Name",val _lastName: String = "Last Name")
{
    val firstName :String
    val lastName :String

    init {
        firstName = _firstName
        lastName = _lastName
        println("This is the constructor of Person class\nFirst Name and Last Name are initialized.")
    }

    fun printInfo(){
        println("First Name is $firstName")
        println("Last Name is $lastName")
    }

    // In Kotlin, visibility is public in general
}