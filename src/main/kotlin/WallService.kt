class WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        post.id = posts.size + 1L
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        var returnValue: Boolean = false
        for (index in posts.indices) {
            if (posts[index].id == post.id) {
                posts[index] = post.copy(id = posts[index].id, date = posts[index].date)
                returnValue = true
                break
            } else
                returnValue = false
        }
        return returnValue
    }
}