interface A {
    fun f(){
        println("I am from interface A")
    }
}

interface B {
    fun f(){
        println("I am from interface B")
    }
}

class C: A,B{
    override fun f(){
        super<A>.f()
        super<B>.f()
    }
}