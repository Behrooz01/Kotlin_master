
//oop (fixed)
class Bill(val price: Int, val discount: Int, val delivery: Int) {

    fun calculate(): Int {
        return price - discount + delivery
    }

    fun printBill() {
        println("Total Bill = ${calculate()}")
    }

    fun save() {
        println("Bill saved with total = ${calculate()}")
    }

    fun send() {
        println("Bill sent with total = ${calculate()}")
    }
}

fun main() {
    val myBill = Bill(100, 20, 50)
    myBill.printBill()
    myBill.save()
    myBill.send()
}
