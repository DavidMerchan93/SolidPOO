package abstract

abstract class Animal {
    abstract val description: String
    open val sound: String = "animal"
}