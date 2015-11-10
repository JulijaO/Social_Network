package socnetwork.model;

import java.time.LocalDateTime;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class Post {

    private int id_post;
    private LocalDateTime create_time_post;
    private String content_post;
    private int id_recipient_post;
    private int id_sender_post;

    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    public LocalDateTime getCreate_time_post() {
        return create_time_post;
    }

    public void setCreate_time_post(LocalDateTime create_time_post) {
        this.create_time_post = create_time_post;
    }

    public String getContent_post() {
        return content_post;
    }

    public void setContent_post(String content_post) {
        this.content_post = content_post;
    }

    public int getId_recipient_post() {
        return id_recipient_post;
    }

    public void setId_recipient_post(int id_recipient_post) {
        this.id_recipient_post = id_recipient_post;
    }

    public int getId_sender_post() {
        return id_sender_post;
    }

    public void setId_sender_post(int id_sender_post) {
        this.id_sender_post = id_sender_post;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id_post=" + id_post +
                ", create_time_post=" + create_time_post +
                ", content_post='" + content_post + '\'' +
                ", id_recipient_post=" + id_recipient_post +
                ", id_sender_post=" + id_sender_post +
                '}';
    }
}
