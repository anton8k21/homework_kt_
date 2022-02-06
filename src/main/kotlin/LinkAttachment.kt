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
        previewPage = "  ",
        previewUrl = ""
    )
): Attachment(type = "Link") {
}