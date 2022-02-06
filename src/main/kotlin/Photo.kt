import java.util.*

data class Photo(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    var sizes: Array<Sizes>?,
    val width: Int,
    val height: Int
){
}