package DataClass

fun main() {
    val simpleSong1 = SongSimple(
        title = "One",
        author = "Metallica"
    )
    val simpleSong2 = SongSimple(
        title = "One",
        author = "Metallica"
    )

    println("Simple songs are equals?: ${simpleSong1 == simpleSong2}")

    val songClass1 = SongClass(
        title = "One",
        author = "Metallica"
    )
    val songClass2 = SongClass(
        title = "One",
        author = "Metallica"
    )

    println("Class songs are equals?: ${songClass1 == songClass2}")

    val dataClassSong1 = SongDataClass(
        title = "One",
        author = "Metallica"
    )
    val dataClassSong2 = SongDataClass(
        title = "One",
        author = "Metallica"
    )

    println("Data Class songs are equals?: ${dataClassSong1 == dataClassSong2}")

}