


fun main() {

        //Using IF-ElSE
        /*val score = 85
        val grade: String

        if (score >= 90 && score <= 100) {
                grade = "A+"
        } else if (score >= 75 && score <= 89) {
                grade = "A"
        } else if (score >= 60 && score <= 74) {
                grade = "B"
        } else {
                grade = "Fail"
        }

        println(grade)

         */


        //USING WHEN

        val score = 85

        val grade = when (score) {
                in 90..100 -> "A+"
                in 75..89  -> "A"
                in 60..74  -> "B"
                else       -> "Fail"
        }

        println(grade)



}

