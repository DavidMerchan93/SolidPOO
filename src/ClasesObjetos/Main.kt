package ClasesObjetos

fun main() {
    val firstSong = Song(
        title = "One",
        artist = "Metallica",
        duration = 10
    )
    val secondSong = Song(
        title = "After Dark",
        artist = "Mr.Kitty",
        duration = 5
    )
    val thirdSong = Song(
        title = "I really want to stay at your house",
        artist = "Rosa Walton & Hallie Cogings"
    )

    firstSong.play()
    secondSong.stop()
    thirdSong.play()
}