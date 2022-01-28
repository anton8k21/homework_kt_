import org.junit.Test

import org.junit.Assert.*
import java.util.*

class WallServiceTest {
    val post4 = Post(
        id = 0,
        owner_id = 2,
        from_id = 2,
        created_by = 3,
        date = 3,
        text = "wewe",
        reply_owner_id = 4,
        reply_post_id = 43,
        friends_only = true,
        copyright = Copyright(
            id = 4,
            link = 3,
            name = "sdf",
            type = "sdf"
        ),
        comments = Comments(),
        likes = Likes(
            count = 3,
            user_likes = true,
            can_like = true,
            can_publish = true
        ),
        Reposts(
            count = 4,
            user_reposted = true
        ),
        Views(count = 5),
        post_type = "dffd",
        signer_id = 3,
        can_pin = true,
        can_delete = true,
        can_edit = true,
        is_pinned = true,
        marked_as_ads = true,
        is_favorite = true,
        donut = Donut(
            is_donut = true,
            paid_duration = 4,
            Placeholder(),
            can_publish_free_copy = true,
            "ret"
        ),
        postponed_id = 4
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
        wallService.add(post4.copy(id = 0, can_delete = false,signer_id = 23,postponed_id = 99999))
        wallService.add(post4.copy(id = 1, can_delete = false,signer_id = 232323,postponed_id = 991212999))
        wallService.add(post4.copy(id = 2, can_delete = false,signer_id = 29999913,postponed_id = 9121219))
        val post5 = post4.copy(id = 5)
        val post3 = post4.copy(id = 1)

        val resultTrue = wallService.update(post3)
        assertTrue(resultTrue)
        val resultFalse = wallService.update(post5)
        assertFalse(resultFalse)


    }
}