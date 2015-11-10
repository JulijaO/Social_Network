package socnetwork.entity;

import javax.persistence.*;

/**
 * Created by ulia2612 on 08.11.15.
 */

@Entity
@Table(name = "likeCommentPost")
public class LikeCommentPostEntity {

    @Column(name = "id_like_comment_post", nullable = false)
    private int id_like_comment_post;

    @Column(name = "id_comment_post", nullable = false)
    private int id_comment_post;

    @Id
    @Column(name = "id_contact", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    @JoinColumn
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LikeCommentPostEntity)) return false;

        LikeCommentPostEntity that = (LikeCommentPostEntity) o;

        return id_like_comment_post == that.id_like_comment_post;

    }

    @Override
    public int hashCode() {
        return id_like_comment_post;
    }

    @Override
    public String toString() {
        return "LikeCommentPostEntity{" +
                "id_like_comment_post=" + id_like_comment_post +
                ", id_comment_post=" + id_comment_post +
                ", id_contact=" + id_contact +
                '}';
    }
}
