



class Car(val brand: String, val model: String,
          val year: Int) {

    fun start() {
        println("The car has started")
    }

    fun stop() {
        println("The car has stopped")
    }
}




fun main() {
    //First Object
    val myCar1 = Car("Toyota",
        "Corolla", 2026)

    println(myCar1.brand)   // Toyota
    println(myCar1.model)   // Corolla
    println(myCar1.year)    // 2026

    myCar1.start()
    myCar1.stop()


    //Second Object
    val myCar2 = Car("Mercedes",
        "G63", 2026)

    println(myCar2.brand)   // Mercedes
    println(myCar2.model)   // G63
    println(myCar2.year)    // 2026

    myCar2.start()
    myCar2.stop()

}