import java.util.*

data class Thread(
    val count: Int,
val items: Array<Objects>?,
val canPost: Boolean,
val showReplyButton: Boolean,
val groupsCanPost: Boolean
) {
}