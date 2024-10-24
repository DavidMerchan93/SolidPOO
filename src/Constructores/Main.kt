package Constructores

import java.time.LocalDateTime
import java.time.Month

fun main() {
    Post(
        name = "El gato negro",
        author = "Edgar Allan Poe",
        date = LocalDateTime.of(
            1989,
            Month.MARCH,
            12,
            10,
            23
        )
    ).also {
        println(it.publish())
    }

    Post(
        name = "Cosmos",
        author = "Carl Sagan",
        date = LocalDateTime.of(
            1993,
            Month.JUNE,
            17,
            11,
            35
        ),
        content = "Erase una vez, un niño llamado David ...",
        category = "Ciencia Ficción"
    ).also {
        println(it.publish())
    }
}
