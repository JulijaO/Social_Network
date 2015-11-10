package socnetwork.model;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class LikeCommentPost {
    private int id_like_comment_post;
    private int id_comment_post;
    private int id_contact;

    public int getId_like_comment_post() {
        return id_like_comment_post;
    }

    public void setId_like_comment_post(int id_like_comment_post) {
        this.id_like_comment_post = id_like_comment_post;
    }

    public int getId_comment_post() {
        return id_comment_post;
    }

    public void setId_comment_post(int id_comment_post) {
        this.id_comment_post = id_comment_post;
    }

    public int getId_contact() {
        return id_contact;
    }

    public void setId_contact(int id_contact) {
        this.id_contact = id_contact;
    }

    @Override
    public String toString() {
        return "LikeCommentPost{" +
                "id_like_comment_post=" + id_like_comment_post +
                ", id_comment_post=" + id_comment_post +
                ", id_contact=" + id_contact +
                '}';
    }
}
