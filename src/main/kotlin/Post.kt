import java.util.*

data class Post(
    var id: Long,
    val owner_id: Int,
    val from_id: Int,
    val created_by: Int,
    val date: Int,
    val text: String,
    val reply_owner_id: Int,
    val reply_post_id: Int,
    val friends_only: Boolean,
    val copyright: Copyright,
    val comments: Comments,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    var attachments: Array<Attachment>,
    val post_type: String,
    val signer_id: Int,
    val can_pin: Boolean,
    val can_delete: Boolean,
    val can_edit: Boolean,
    val is_pinned: Boolean,
    val marked_as_ads: Boolean,
    val is_favorite: Boolean,
    val donut: Donut,
    val postponed_id: Int
    ) {

}
