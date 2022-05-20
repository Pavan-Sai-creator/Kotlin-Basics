fun main() {
    var age: Int = 21 // This is variable and can be reassigned
    val name: String = "Pavan" // This is constant and can't be modified
    println("\n$name's age is $age as of 2022")

    // Types are non-nullable in Kotlin by default
    // So, you can't write val name: String = null
    // To declare nullable values, you have to add a (?) for example,

    val nullable_name: String? = null

    if(nullable_name == null){
        println("Name is null")
    }else{
        println("$nullable_name")
    }

    // In Kotlin when() is used instead of switch.
    when(age){
        18 -> {
            println("You are now eligible to vote.")
            println("You are a major.")
        }
        21 -> println("You will receive your Degree in an year.")
        else -> {
            println("There is no information for your age.")
        }
    }
    println("Sum of 2 and 3 is ${add(2,3)}")
    getGreeting()
    val mySkills = arrayOf("Kotlin","C++","Android","AWS")
    println("I have ${mySkills.size} skills")
    println("I am working on ${mySkills[0]} now")
    println("\nMy other skills include:\n")

    for(skill in mySkills){
        println(skill)
    }
    // Other way of iterating with (it) keyword
    mySkills.forEach {
        println(it)
    }
    // Referencing (it) with a name of our choice
    mySkills.forEach {skill ->
        println(skill)
    }
    // But, in above methods, we lost track of index of the items in our array. To avoid that, we can use:
    mySkills.forEachIndexed { index,skill ->
        println("$skill is at index $index")
    }
    // Other than arrays, we also have lists in Kotlin
    val favouriteSubjects = listOf("Maths","Science","Social","English")
    print("\nMy favourite subjects are: ")
    favouriteSubjects.forEach{
        print(it+", ")
    }

    val fruitColors = mapOf("Mango" to "Yellow","Strawberry" to "Red","Grapes" to "Green")
    // Format: key to value
    // fruit is key and color is value
    println("\n")
    fruitColors.forEach{fruit,color ->
        println("$fruit -> $color")
    }

    // By default, a collection type in Kotlin is immutable. You need to use mutable collections
    // to add more elements to your collection. For example,

    val colors = mutableListOf("Gold","Blue","Orange")
    colors.add("White")
    val mutableMap = mutableMapOf(1 to "a",2 to "b", 3 to "c")
    mutableMap.put(4,"d")

    // Passing a list of strings to a function and iterating through it with forEach
    val personsToGreet = mutableListOf("David","Ron","Jaqueline")
    sayHi("Hi",personsToGreet)




}

// Here, 0 is default value. If you don't provide any parameter while calling the function,
// the default value will be taken.
fun add(a: Int=0, b:Int=0): Int{
    return a+b
}
// To return a nullable type you have to add (?) at the end of return type. For example,
fun getNullableType(): String?{
    return null
}
// Single line functions
fun getGreeting() = "Hello, How are you?"
// As it is a single line, Kotlin knows that the RHS part is something to be returned.
// As the RHS is a String, the return type of the function is automatically inferred without us having to specify.

fun sayHi(greeting: String, peopleToGreet: List<String>) {
    peopleToGreet.forEach{ person ->
        println("$greeting, $person")
    }
}
