
data class Preview (
    val photo: Photo,
    val graffiti: Graffiti,
    val audioMessage:AudioMessage
    )

data class AudioMessage (
    val duration: Int,
    var waveform: Array<WritingOnTheWall>? = emptyArray<WritingOnTheWall>(),
    val linkOgg: String,
    val linkMp3: String

)
