package socnetwork.model;

/**
 * Created by ulia2612 on 09.11.15.
 */
public class CommentPost {
    private int id_comment_post;
    private String content;
    private int id_post;

    public int getId_comment_post() {
        return id_comment_post;
    }

    public void setId_comment_post(int id_comment_post) {
        this.id_comment_post = id_comment_post;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    @Override
    public String toString() {
        return "CommentPost{" +
                "id_comment_post=" + id_comment_post +
                ", content='" + content + '\'' +
                ", id_post=" + id_post +
                '}';
    }
}
