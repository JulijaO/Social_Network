package socnetwork.entity;

import javax.persistence.*;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class LikePostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_like_post", nullable = false)
    private int id_like_post;

    @Column(name = "id_post", nullable = false)
    private int id_post;

    @Column(name = "id_contact", nullable = false)
    @ManyToOne
    @JoinColumn
    private int id_contact;

    public int getId_like_post() {
        return id_like_post;
    }

    public void setId_like_post(int id_like_post) {
        this.id_like_post = id_like_post;
    }

    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
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
        if (!(o instanceof LikePostEntity)) return false;

        LikePostEntity likePost = (LikePostEntity) o;

        return id_like_post == likePost.id_like_post;

    }

    @Override
    public int hashCode() {
        return id_like_post;
    }

    @Override
    public String toString() {
        return "LikePostEntity{" +
                "id_like_post=" + id_like_post +
                ", id_post=" + id_post +
                ", id_contact=" + id_contact +
                '}';
    }
}
