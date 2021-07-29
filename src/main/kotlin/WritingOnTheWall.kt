data class WritingOnTheWall(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val date: Int,
    var text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendOnly: Boolean,
    val commentInfo: CommentInfo?,
    val copyright: Copyright,
    val like: LikeInformation,
    val repost: Repost,
    val view: Views,
    val postType: String,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donute,
    val postponedId: Int,
    val audio: Audio,
    val document: Document,
    val link: Link,
    val note: Note,
    val page: Page,
    val poll: Poll,
    val post: Post?,
    val postSource: PostSource,
    val sticker: Sticker,
    val video: Video,


    ) {

}


