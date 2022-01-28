data class AudioAttachment(
    val audio: Audio = Audio(
        id = 0,
        owner_id = 4,
        artist = "",
        title = "",
        duration = 3,
        url = " ",
        lyrics_id = 34,
        album_id = 2,
        genre_id = 7,
        date = 7,
        no_search = true,
        is_hq = false
    )
): Attachment(type = "Audio") {
}