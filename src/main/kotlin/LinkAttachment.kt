import java.util.*

data class LinkAttachment(
    val link: Link = Link(
        url = " ",
        title = "",
        caption = "",
        description = "",
        photo = null,
        product = null,
        button = null,
        preview_page = "  ",
        preview_url = ""
    )
): Attachment(type = "Link") {
}