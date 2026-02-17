


fun main() {
    //Example 1

    for (i in 1..5) {
        print(i)
    }



    while (i <= 3) {
        println(i)
        i++
    }

    var i = 1
    do {
        println(i)
        i++
    } while (i <= 3)




    println()

   // Example 2 — Skip numbers

    for (i in 1..10 step 2) {
        print(i)
    }
    println()

   // Example 3 — Reverse

    for (i in 5 downTo 1) {
        print(i)
    }

}