
data class Poll(
    val id: Int,
    val ownerId: Int,
    val created: Int,
    val question: String,
    val votes: Int,
    val answers: Array<Answer>?,
    val anonymous: Boolean,
    val multiple: Boolean,
    val answerIds: Array<Int>?,
    val endDate: Int,
    val closed: Boolean,
    val isBoard: Boolean,
    val canEdit: Boolean,
    val canVote: Boolean,
    val canReport: Boolean,
    val canShare: Boolean,
    val authorId: Int,
    val photo: Photo,
    val background: Background,


){

data class Answer(
    val id:Int,
    val text: String,
    val votes: Int,
    val rate: Number,
    )

sealed class Background {
    abstract val id: Int


    data class Gradient(
        override val id: Int,
        val angle: Int,
        val points: Array<Point>?
    ) : Background() {

        data class Point(
            val position: Int,
            val color: String
        )
    }

    data class Tile(
        override val id: Int,
        val width: Int,
        val height: Int,
        val images: Array<Photo>?
    ) : Background()
}
}


