import org.junit.Test

import org.junit.Assert.*
import java.util.*

class WallServiceTest {
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
        postId = 2,
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




    @Test
    fun add()  {
        val wallService = WallService()

        val result = wallService.add(post4)
            assertNotEquals(result.id,0)


    }

    @Test
    fun update() {
        val wallService = WallService()
        wallService.add(post4.copy(id = 0, canDelete = false,signerId = 23,postponedId = 99999))
        wallService.add(post4.copy(id = 1, canDelete = false,signerId = 232323,postponedId = 991212999))
        wallService.add(post4.copy(id = 2, canDelete = false,signerId = 29999913,postponedId = 9121219))
        val post5 = post4.copy(id = 5)
        val post3 = post4.copy(id = 1)

        val resultTrue = wallService.update(post3)
        assertTrue(resultTrue)
        val resultFalse = wallService.update(post5)
        assertFalse(resultFalse)
    }

    @Test(expected = PostNotFoundException :: class)
    fun createComment(){
        val wallService = WallService()
        wallService.add(post4.copy(id = 0, canDelete = false,signerId = 23,postponedId = 99999))
        wallService.createComment(comment1)
    }

    @Test
    fun createCommentTrue(){
        val wallService = WallService()
        wallService.add(post4.copy(id = 0, canDelete = false,signerId = 23,postponedId = 99999))
        wallService.add(post4.copy(id = 1, canDelete = false,signerId = 232323,postponedId = 991212999))
        wallService.add(post4.copy(id = 2, canDelete = false,signerId = 29999913,postponedId = 9121219))

        val result = wallService.createComment(comment1).postId
        assertEquals(result, 2)
    }
}