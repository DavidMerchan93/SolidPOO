package gettersetter

import java.time.LocalDate

fun main() {
    val validSimpleUser = User(
        email = "davidmerchan10@gmail.com",
        password = "123abc"
    )
    RegisterUseCase().invoke(validSimpleUser).also {
        if (it != null) {
            println(
                """
                email: ${validSimpleUser.email}
                password: ${validSimpleUser.password}
            """.trimIndent()
            )
        } else {
            println("Invalid user")
        }
    }

    println("----------------------------")

    val validCompleteUser = User(
        email = "davidmerchan10@gmail.com",
        password = "123abc",
        birthdate = LocalDate.of(1993,6,17),
        gender = 'G'
    )
    RegisterUseCase().invoke(validCompleteUser).also {
        if (it != null) {
            println(
                """
                email: ${validCompleteUser.email}
                password: ${validCompleteUser.password}
                birthdate: ${validCompleteUser.birthdate}
                gender: ${validCompleteUser.gender}
            """.trimIndent()
            )
        } else {
            println("Invalid user")
        }
    }
}