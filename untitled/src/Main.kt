//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

        val myCar = Car()

        myCar.brand = "BMW"
        myCar.model = "M"
        myCar.speed = 200

        println(myCar.brand)
        println(myCar.model)

        myCar.drive()
        myCar.stop()
}


class Car {

    var brand : String = ""
    var model : String = ""
    var year  : Int = 0
    var speed : Int = 0

    fun drive() {
        println("The car is driving at $speed km/hr ")
    }

    fun stop(){
        println("The car has stopped ")
    }



}