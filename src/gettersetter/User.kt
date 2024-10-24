package gettersetter

import java.time.LocalDate

class User(
    email: String,
    password: String
) {

    private val currentDate = LocalDate.now()
    private val validGenders = listOf('F', 'M')
    var isValid = true

    var email: String = ""
        set(value) {
            field = value.lowercase()
        }

    var password: String = ""
        set(value) {
            field = if (value.length == 6) {
                value
            } else {
                isValid = false
                ""
            }
        }

    init {
        this.email = email
        this.password = password
    }

    constructor(
        email: String,
        password: String,
        birthdate: LocalDate,
        gender: Char
    ) : this(email, password) {
        this.birthdate = birthdate
        this.gender = gender
    }

    var birthdate: LocalDate = currentDate
        set(value) {
            val age = currentDate.year - value.year
            field = if (age >= 18) {
                value
            } else {
                isValid = false
                currentDate
            }
        }

    var gender: Char = 'N'
        set(value) {
            field = if (validGenders.contains(value)) {
                value
            } else {
                isValid = false
                'N'
            }
        }

}