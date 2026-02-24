data class UserProfile(
    val name: String,
    val age: Int,
    val email: String,
    val bio: String,
    val showAvatar: Boolean
)

fun printAvatar(name: String) {
    val initials = name.split(" ")
        .map { it.first().uppercase() }
        .joinToString("")

    println("+--------+")
    println("|        |")
    println("|   $initials   |")
    println("|        |")
    println("+--------+")
}

fun displayProfile(user: UserProfile) {
    println("=================================")

    if (user.showAvatar) {
        printAvatar(user.name)
    }

    println("Name  : ${user.name}")
    println("Age   : ${user.age}")
    println("Email : ${user.email}")
    println("Bio   : ${user.bio}")
    println("=================================\n")
}

fun main() {

    val users = listOf(
        UserProfile(
            name = "Chinmay Ranganath",
            age = 21,
            email = "chinmay@email.com",
            bio = "Backend Developer | Kotlin Learner",
            showAvatar = true
        ),
        UserProfile(
            name = "Strom Breaker",
            age = 21,
            email = "Strombreaker07@email.com",
            bio = "Android Developer | UI Enthusiast",
            showAvatar = true
        )
    )
    
     println(" USER PROFILE")

    for (user in users) {
        displayProfile(user)
    }
}
