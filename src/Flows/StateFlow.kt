package Flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Es un hot flow
 * Necesita un estado incial
 * Siempre guarda el ultimo estado
 * No emite valores iguales
 * No depende de un escuchador para emitir valores
 */
fun main(): Unit = runBlocking {
    val stateFlow = MutableStateFlow("Hola 1")

    launch {
        stateFlow.collect {
            println("Flow: $it")
        }
    }

    stateFlow.emit("Hola 2")
    delay(2000)
    stateFlow.emit("Hola 3")
    delay(2000)
    stateFlow.emit("Hola 4")
    delay(1000)
    stateFlow.emit("Hola 4")

    launch {
        stateFlow.collect {
            println("Launch 2 Flow: $it")
        }
    }
}