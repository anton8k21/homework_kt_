import java.util.*

data class Photo(
    val id: Int,
    val album_id: Int,
    val owner_id: Int,
    val user_id: Int,
    val text: String,
    val date: Int,
    var sizes: Array<Sizes>?,
    val width: Int,
    val height: Int
){
}