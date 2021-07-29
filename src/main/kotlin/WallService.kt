object WallService {
    var posts = emptyArray<WritingOnTheWall>()

    var item = 0


    fun add(post: WritingOnTheWall): WritingOnTheWall {
        posts += post.copy(id = if (posts.isEmpty()) 1 else posts.last().id + 1)
        return posts.last()
    }

    fun printAllPosts(posts: Array<WritingOnTheWall>) {
        for (post in posts) {
            print(post)
        }
    }


    fun update(post: Array<WritingOnTheWall>, item: Int): Any {
        for ((index, post) in posts.withIndex()) {
            if (item == post.id) {
                posts[index] = post.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false
    }


    fun checkCopyrightLink(post: WritingOnTheWall): String {
        return post.link.url

    }



        fun creatComment(post: WritingOnTheWall, text: String) {
            post.text = text
        }

        fun delete(post: WritingOnTheWall) {
            var result = post.copy(post = null)

        }

        fun deleteComment(post: WritingOnTheWall) {
            var result = post.copy(commentInfo = null)

        }



}































