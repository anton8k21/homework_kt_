class WallService {
    private var posts = emptyArray<Post>()
     var commentArray = emptyArray<Comment>()

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

    fun createComment(comment: Comment): Comment {
        for (index in posts.indices){
            if (posts[index].id == comment.postId){
                commentArray += comment
                break
            }
        }
        if (commentArray.last().postId !== comment.postId){
            throw PostNotFoundException("не найден пост с аналогичным id")
        }

        return commentArray.last()
    }
}