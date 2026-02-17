//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

 /*   //loop through char till x
    for (chars in 'a' .. 'x') {
        println(chars)
    }
*/

   /* for (nums in 1 .. 15 ) {
        println(nums)
    }
*/

    //break and continue with range
  /*  for (nums in 1 .. 15) {


        println(nums)
        if ( nums == 10) {
            break
        }
    }
*/

    for (nums in 1 .. 15 ) {

        if(nums == 10) {
            continue
        }
        println(nums)
    }
}