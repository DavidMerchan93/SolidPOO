package sealedClass

sealed class ScreenState(val code: String) {
    data object Loading: ScreenState(""), OtherInterface {
        override fun print(message: String) {

        }
    }

    data class Success(val body: String): ScreenState(""), OtherInterface {
        override fun print(message: String) {

        }
    }

    data class Error(val message: String): ScreenState("")
    class Other(val other: String): ScreenState("")
}