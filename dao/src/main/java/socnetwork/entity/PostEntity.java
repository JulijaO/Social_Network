package socnetwork.entity;

import socnetwork.converters.MyLocalDateTimeToTimestampConverter;
import socnetwork.model.LikePost;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by ulia2612 on 08.11.15.
 */

@Entity
@Table(name = "post")
public class PostEntity {
    @Id
    @Column(name = "id_post")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    @JoinColumn
    private int id_post;

    @Column(name = "create_time_post", nullable = false)
    @Convert(converter = MyLocalDateTimeToTimestampConverter.class)
    private LocalDateTime create_time_post;

    @Column(name = "content_post", nullable = false)
    private String content_post;

    @Column(name = "id_recipient_post", nullable = false)
    private int id_recipient_post;

    @Column(name = "id_sender_post", nullable = false)
    private int id_sender_post;

    @OneToMany (mappedBy = "id_post")
    private List<CommentPostEntity> commentPostEntityList;

    @OneToMany (mappedBy = "id_post")
    private List<LikePost> likePosts;

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

    public List<CommentPostEntity> getCommentPostEntityList() {
        return commentPostEntityList;
    }

    public void setCommentPostEntityList(List<CommentPostEntity> commentPostEntityList) {
        this.commentPostEntityList = commentPostEntityList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PostEntity)) return false;

        PostEntity post = (PostEntity) o;

        return id_post == post.id_post;

    }

    @Override
    public int hashCode() {
        return id_post;
    }

    @Override
    public String toString() {
        return "PostEntity{" +
                "id_post=" + id_post +
                ", create_time_post=" + create_time_post +
                ", content_post='" + content_post + '\'' +
                ", id_recipient_post=" + id_recipient_post +
                ", id_sender_post=" + id_sender_post +
                '}';
    }
}
