package ClasesObjetos

class Song(
    private val title: String,
    private val artist: String
) {

    private val artistUpper = artist.uppercase()
    private var duration: Int = 0

    constructor(
        title: String,
        artist: String,
        duration: Int
    ) : this(title, artist) {
        this.duration = duration
    }

    init {
        println("Song $title created")
    }

    fun play() {
        println("Playing $title - $artistUpper, duration: $duration")
    }

    fun stop() {
        println("Stopped $title")
    }

}