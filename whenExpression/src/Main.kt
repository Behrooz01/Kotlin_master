//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //when as expression return a value

    val x = 4

    val result = when(x) {

        1 -> "the value is 1"
        2 -> "the value is 2"
        else -> {
            "x is Unknown"
        }
    }

    println(result)

    //multiple conditions in single branch when

    val x1 = 6

    val result1 = when (x1) {

        1 , 2 -> "x is 1 or 2 "
        3 , 4 -> "x is 3 or 4"
        5 , 6 -> "x is 5 or 6"
        7 , 8 -> "x is 7 or 8"
        else -> "x is Unknown"
    }
    println(result1)

    //checking the type with is using when
    println(describeType("yes"))




}

fun describeType(obj: Any): String =
   when (obj) {
       is Int -> "Integer"
       is String -> "String"
       is Double -> "Double"
       is Boolean -> "Boolean"
       else -> "Unknown"
   }