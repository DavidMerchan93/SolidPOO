package gettersetter

class RegisterUseCase {
    operator fun invoke(user: User): User? {
        return if (user.isValid) {
            user
        } else {
            null
        }
    }
}