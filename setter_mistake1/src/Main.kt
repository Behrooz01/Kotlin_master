fun main() {
    val student = StudentWithoutField()
    student.marks = 90  // ⚠️ This will cause StackOverflowError
}

class StudentWithoutField {
    var marks: Int = 0
        set(value) {
            println("Setter called with value = $value")
            marks = value   // ❌ wrong: causes infinite loop
        }
}