
data class Video (
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val photo130: String,
    val photo320: String,
    val photo640: String,
    val photo800:String,
    val photo1280: String,
    val firstFrame130: String,
    val firstName320: String,
    val firstFrame640: String,
    val firstFrame800: String,
    val firstFrame1280: String,
    val canAdd: Boolean,
    val canComment: Boolean,
    val canLike: Boolean,
    val calRepost: Boolean,
    val canSubscribe: Boolean,
    val canAddToFaves: Boolean,
    val converting: Boolean,
    val added: Boolean,
    val isSubscribed: Boolean,
    val canAttachLink:Boolean,
    val liveStatus: String,
    var date: Int,
    val addingDate: Int,
    val views: Int,
    val comments: Int,
    val payer: String,
    val platform: String,
    val canEdit: Boolean,
    val isPrivate:Boolean,
    val accessKty: String,
    val processing: Boolean,
    val live: Boolean,
    val upcoming: Boolean,
    val isFavorite: Boolean
    )