abstract class Attachment {
    abstract val type: String

}

class VideoAttachment(override val type: String, val video: Video) : Attachment() {
   var canAdd = video.canAdd
    var canComment = video.canComment
    var canEdit = video.canEdit
    var canLike = video.canLike
    var canSubscrive = video.canSubscribe
    var canAddToFaves = video.canAddToFaves
    var canAttachLink = video.canAttachLink
    var converting = video.converting
    var added = video.added
    var isSubscribed = video.isSubscribed

    var liveStatus = when(video.liveStatus){
       "waiting" -> "waiting"
        "started" -> "started"
        "finished" ->"finished"
        "failed" -> "failed"
        "upcoming" -> "upcoming"
        else -> "неверно"
    }
    override fun toString(): String {
        return "$canAdd $canComment $canEdit $canLike $canSubscrive $canAddToFaves $canAttachLink $converting $added $isSubscribed $liveStatus"
    }

}




class PhotoAttachment(override val type: String, val photo: Photo) : Attachment() {
    var result = photo.id

    override fun toString(): String {
        return "$result"
    }
}
    class AudoiAttachment(override val type: String, val audio: Audio) : Attachment() {
        var genre = when (audio.genreId) {
            1 -> "Rock"
            2 -> "Pop"
            3 -> "Rap & Hip-Hop"
            4 -> "Easy Listening"
            5 -> "House & Dance"
            6 -> "Instrumental"
            7 -> "Metal"
            21 -> "Alternative"
            8 -> "Dubstep"
            1001 -> "Jazz & Blues"
            10 -> "Drum & Bass"
            11 -> "Trance"
            12 -> "Chanson"
            13 -> "Ethnic"
            14 -> "Acoustic & Vocal"
            15 -> "Reggae"
            16 -> "Classical"
            17 -> "Indie Pop"
            19 -> "Speech"
            22 -> "Electropop & Disco"
            18 -> "Other"
            else -> "Неправильное число"
        }

        override fun toString(): String {
            return genre
        }


    }

    class DocumentsAttachment(override val type: String, val document: Document) : Attachment() {


        var result = when (document.type) {
            1 -> "текстовые документы"
            2 -> "архивы"
            3 -> "gif"
            4 -> "изображения"
            5 -> "аудио"
            6 -> "видео"
            7 -> "электронные книги"
            8 -> "неизвестно"
            else -> "Неизвестный тип"
        }

        override fun toString(): String {
            return result
        }

    }

    class PageAttachment(override val type: String, val page: Page) : Attachment() {

        var whoCanEdit = when (page.whoCanEdit) {
            2 -> "просматривать страницу могут все"
            1 -> "только участники сообщества"
            0 -> "только руководители сообщества"
            else -> "неверное значение"
        }

        var whoСanView = when (page.whoCanView) {
            2 -> "редактировать страницу могут все"
            1 -> "только участники сообщества"
            0 -> "только руководители сообщества"
            else -> "неверное значение"
        }

        var currentUserCanEdit = page.currenlUserCanEdit
        var currentUserCanEditAccess = page.currenlUserCanEditAcces

        override fun toString(): String {
            return "$whoCanEdit $whoСanView $currentUserCanEdit $currentUserCanEditAccess"
        }



    }







