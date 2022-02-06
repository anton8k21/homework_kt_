data class AudioAttachment(
    val audio: Audio = Audio(
        id = 0,
        ownerId = 4,
        artist = "",
        title = "",
        duration = 3,
        url = " ",
        lyricsId = 34,
        albumId = 2,
        genreId = 7,
        date = 7,
        noSearch = true,
        isHq = false
    )
): Attachment(type = "Audio") {
}