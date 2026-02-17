//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val cars = arrayOf("Volvo" , "BMW" , "3B")

    //Access an element in array
    println( cars[0] )

    // check if an element exist in array

    if ( "Volvo" in  cars)
    {
        println("volvo exist")
    }else {
        println("Volvo does not exist")
    }

    //loop through an array

    for ( x in cars) {
        println(x)
    }

    cars.forEach {
        println(it)
    }
}