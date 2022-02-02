data class Note(
    val id: Int,
val ownerId: Int,
val title: String,
val text: String,
val date: Int,
val comments: Int,
val readComments: Int,
val viewUrl: String,
val privacyView: String,
val privacyComment: String,
val can_comment: Int,
val textWiki: String
) {
}