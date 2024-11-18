package Flows

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Es un hot flow
 * No necesita un estado incial
 * No depende de un escuchador para emitir valores
 * Emite valores iguales
 *
 * replay: Cuantos valores va a almacenar en el estado
 * extraBufferCapacity: Cuantos valores va a mantener en el buffer
 * onBufferOverflow: Que va hacer con el resto de valores en el buffer
 */
fun main(): Unit = runBlocking {
    val sharedFlow = MutableSharedFlow<String>(replay = 2, extraBufferCapacity = 3, onBufferOverflow = BufferOverflow.DROP_LATEST)

    sharedFlow.emit("Hola 1")
    sharedFlow.emit("Hola 1.5")
    sharedFlow.emit("Hola 1.6")
    sharedFlow.emit("Hola 1.7")
    sharedFlow.emit("Hola 1.8")
    launch {
        sharedFlow.collect {
            println("Flow: $it")
        }
    }

    delay(2000)
    sharedFlow.emit("Hola 2")
    delay(2000)
    sharedFlow.emit("Hola 3")
    delay(2000)
    sharedFlow.emit("Hola 4")
    delay(1000)
    sharedFlow.emit("Hola 4")
    delay(1000)
    sharedFlow.emit("Hola 5")
    delay(1000)
    sharedFlow.emit("Hola 6")
    delay(1000)
    sharedFlow.emit("Hola 7")
    delay(1000)
    sharedFlow.emit("Hola 8")

    launch {
        sharedFlow.collect {
            println("Launch 2 Flow: $it")
        }
    }
}
