data class PhotoAttachment(
    val photo: Photo = Photo(
        id = 1,
        album_id = 2,
        owner_id = 3,
        user_id = 4,
        text = "",
        date = 4,
        null,
        width = 34,
        height = 32
    ),
) : Attachment("photo") {
}