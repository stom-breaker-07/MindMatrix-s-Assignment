
fun main() {
      println("===== Student Performance Report Generator =====")

    print("Enter Student Name: ")
    val name = readLine()!!

    print("Enter Number of Subjects: ")
    val subjectCount = readLine()!!.toInt()

    val marks = IntArray(subjectCount)

    for (i in 0 until subjectCount) {
        print("Enter marks for Subject ${i + 1}: ")
        marks[i] = readLine()!!.toInt()
    }

    val total = calculateTotal(marks)
    val average = calculateAverage(total, subjectCount)
    val grade = calculateGrade(average)

    printReport(name, marks, total, average, grade)
}

fun calculateTotal(marks: IntArray): Int {
    var sum = 0
    for (mark in marks) {
        sum += mark
    }
    return sum
}

fun calculateAverage(total: Int, count: Int): Double {
    return total.toDouble() / count
}


fun calculateGrade(average: Double): String {
    return when {
        average >= 90 -> "A+"
        average >= 75 -> "A"
        average >= 60 -> "B"
        average >= 50 -> "C"
        average >= 40 -> "D"
        else -> "Fail"
    }
}


fun printReport(
    name: String,
    marks: IntArray,
    total: Int,
    average: Double,
    grade: String
) {
    println("\n===== Performance Report =====")
    println("Student Name: $name")

    println("Marks:")
    for (i in marks.indices) {
        println("Subject ${i + 1}: ${marks[i]}")
    }

    println("Total Marks: $total")
    println("Average: %.2f".format(average))
    println("Grade: $grade")

    if (grade == "Fail") {
        println("Result: Needs Improvement")
    } else {
        println("Result: Passed")
    }
}