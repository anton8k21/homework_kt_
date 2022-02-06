import java.util.*

data class Comment(
    val postId: Long,
    val id: Int,
val fromId: Int,
val date: Int,
val text: String,
    val donut: Donut?,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachments: Attachment?,
    val parentsStack: Array<Int>?,
    val thread: Thread?
) {
}