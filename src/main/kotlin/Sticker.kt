
data class Sticker(
    val productId: Int,
    val stickerId: Int,
    val images: Array<Image>?,
    val imagesWithBackground: Array<Image>?
) {

    data class Image(
        val url: String,
        val width: Int,
        val height: Int
    )


}