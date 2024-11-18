package Flows

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

//Cold flow
val firstFlow = flow {
    emit(1)
    delay(1000)
    emit(2)
    delay(2000)
    emit(3)
}

/**
 * Siempre emite los mismos valores que tiene al ser escuchado
 * Depende de un escuchador para emitir valores
 */
fun main() = runBlocking {
    firstFlow.collect {
        println("Received $it")
    }
    firstFlow.collect {
        println("Received $it")
    }
}
