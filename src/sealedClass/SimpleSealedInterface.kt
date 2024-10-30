package sealedClass

sealed interface Screen2State {
    data object Loading: Screen2State
    data class Success(val body: String): Screen2State, OtherInterface {
        override fun print(message: String) {

        }
    }

    data class Error(val message: String): Screen2State
    class Other(val other: String): Screen2State
}