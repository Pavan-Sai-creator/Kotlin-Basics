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

    val petName: String? = null
    val petNameToPrint = petName ?: "You dont't have a pet"
    println("$petNameToPrint")
    //  (?:) is called Elvis operator. If LHS of (?) is not null, it returns value of LHS
    // else it returns RHS of (:).

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

    val person1 = Person()
    person1.printInfo()

    val person2 = Person("Pavan","Sai")
    person2.printInfo()

    val human = Human("Pavan",21)
    val teacher = mathTeacher("Bala Muragan",40)
    teacher.teachMaths()
    val player = footballPlayer("Ronaldo",35,"LA Galaxy")
    player.playFootball()

    val badhsha = Horse("horse")
    badhsha.describe()
    println("I have ${badhsha.legs} legs and ${badhsha.nose} nose")
    badhsha.specialAbility()

    val kiara = Hyena("hyena")
    kiara.describe()
    println("I have ${kiara.legs} legs and ${kiara.nose} nose")
    kiara.specialAbility()

    val myChild = child()
    println("${myChild.variable}")
    myChild.functionWithImplementation()
    myChild.abstractFunction()

    val c = C()
    c.f()

    val nestedObject = OuterClass.NestedClass()
    nestedObject.nestedFunction()

    val innerObject = OuterClass2().InnerClass()
    val x:String = innerObject.innerFunction()

    val car1 = Car("Audi","A4","Sedan","Black")
    val car2 = car1.copy()
    val car3 = car1.copy(model="A6")

    println("${car1.hashCode()}")
    println("${car2.hashCode()}")
    println("${car3.hashCode()}")

    println("${car1.equals(car2)}")
    println("${car1.equals(car3)}")

    // Destructuring Declarations
    val (c1brand,c1model,c1type,c1color) = car1

    println("$c1brand, $c1color, $c1model, $c1type")

    // Component functions
    println("${car1.component1()}")
    println("${car1.component2()}")
    println("${car1.component3()}")
    println("${car1.component4()}")



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
