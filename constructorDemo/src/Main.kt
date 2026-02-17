
//Primary constructor with init block
class Car(var brand: String) {

    init {
        println("Brand: $brand")
    }
}

//secondary constructor
class Product {
    var brand: String = ""

    constructor(brand: String) {
        this.brand = brand
        println("Brand: $brand")
    }
}

//both together (Primary and secondary constructor)

class Animal(var name: String) {
    var age : Int = 0
    constructor(name: String, age: Int) : this(name) {
        this.age = age
        println("Animal: $name")
    }
}


fun main() {
     val car = Car("Honda")
     val product = Product("Laptop Hp Victus")
     val animal = Animal("Gog",1)
}