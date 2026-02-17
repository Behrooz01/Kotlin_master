//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


   /* var i = 0

    while (i < 10 ) {

        println(i)

        if( i == 4) {
            break
        }
        i++
    }
*/
    //The continue statement breaks one iteration (in the loop),
    // if a specified condition occurs, and continues with the next iteration in the loop.

    var j = 0

    while (j < 10 ) {

        if( j == 4) {
            j++
            continue
        }
        println(j)
        j++
    }

}