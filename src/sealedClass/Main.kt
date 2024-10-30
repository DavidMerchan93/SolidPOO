package sealedClass

fun main() {
    val sealedClass = ScreenState.Loading
    val sealed2Class = ScreenState.Success("Todo OK")
    println(sealed2Class.code)
}