



class Car {

    var brand: String = ""
    var model: String = ""
    var year: Int = 0

    fun startEngine() {
        println("$brand $model engine started")
    }

    fun stopEngine() {
        println("$brand $model engine stopped")
    }
}

fun main() {

    val car1 = Car()

    car1.brand = "Toyota"
    car1.model = "Corolla"
    car1.year = 2022

    car1.startEngine()
}
