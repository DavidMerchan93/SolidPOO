import kotlin.math.atan

class Song(
    private val title: String,
    private val artist: String
) {

    fun play() {
        println("Playing $title - $artist")
    }

    fun stop() {
        println("Stopped $title")
    }

}