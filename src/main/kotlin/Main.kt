import java.lang.NullPointerException

fun main(args: Array<String>) {
    val post4 = Post(
        id = 0,
        ownerId = 2,
        fromId = 2,
        createdBy = 3,
        date = 3,
        text = "wewe",
        replyOwnerId = 4,
        replyPostId = 43,
        friendsOnly = true,
        copyright = Copyright(
            id = 4,
            link = 3,
            name = "sdf",
            type = "sdf"
        ),
        comments = Comments(),
        likes = Likes(
            count = 3,
            userLikes = true,
            canLike = true,
            canPublish = true
        ),
        Reposts(
            count = 4,
            userReposted = true
        ),
        Views(count = 5),
        attachments = null,
        postType = "dffd",
        signerId = 3,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = true,
        isFavorite = true,
        donut = Donut(
            isDonut = true,
            paidDuration = 4,
            Placeholder(),
            canPublishFreeCopy = true,
            editMode = "ret"
        ),
        postponedId = 4
    )

    val comment1 = Comment(
        postId = 3,
        id = 4,
        fromId = 5,
        date = 3,
        text = " ",
        donut = null,
        replyToUser = 4,
        replyToComment = 5,
        attachments = null,
        parentsStack = null,
        thread = null
    )
val wallService = WallService()

    wallService.add(post4)
    wallService.add(post4.copy(id = 2))
    wallService.createComment(comment1)




}
