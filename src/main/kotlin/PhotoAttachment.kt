data class PhotoAttachment(
    val photo: Photo = Photo(
        id = 1,
        albumId = 2,
        ownerId = 3,
        userId = 4,
        text = "",
        date = 4,
        sizes = null,
        width = 34,
        height = 32
    ),
) : Attachment("photo") {
}