data class NoteAttachment(
    val note: Note = Note(
        id = 4,
        ownerId = 5,
        title = " ",
        text = "",
        date = 12,
        comments = 3,
        readComments = 7,
        viewUrl = "",
        privacyView = "",
        privacyComment = "",
        canComment = 7,
        textWiki = ""
    )
): Attachment(type = "Note") {
}