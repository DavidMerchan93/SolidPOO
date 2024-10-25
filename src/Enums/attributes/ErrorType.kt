package Enums.attributes

enum class ErrorType(
    val message: String
) {

    CONNECTION_ERROR("Error when connect to the server") {
        override val titleError: String
            get() = "Connection"

        override val retryIntents: Int
            get() = 3

        override fun getCodeError(): String = "C115"
    },
    LOGIN_ERROR("Error when login") {
        override val titleError: String
            get() = "Login"

        override val retryIntents: Int
            get() = 2

        override fun getCodeError(): String = "L101"
    },
    REGISTER_ERROR("Error when register") {
        override val titleError: String
            get() = "Register"

        override fun getCodeError(): String = "R2R2"
    };

    abstract val titleError: String
    abstract fun getCodeError(): String

    open val retryIntents: Int = 0

    val showError: Boolean = true
}