package socnetwork.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ulia2612 on 09.11.15.
 */
@Entity
@Table(name = "commentPost")
public class CommentPostEntity {

    @Id
    @Column(name = "id_comment_post", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    @JoinColumn
    private int id_comment_post;

    @Column(name = "content_comment_post", nullable = false)
    private String content;

    @OneToMany(mappedBy = "id_comment_post")
    private List<LikeCommentPostEntity> likeCommentPostEntities;



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


    public List<LikeCommentPostEntity> getLikeCommentPostEntities() {
        return likeCommentPostEntities;
    }

    public void setLikeCommentPostEntities(List<LikeCommentPostEntity> likeCommentPostEntities) {
        this.likeCommentPostEntities = likeCommentPostEntities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentPostEntity that = (CommentPostEntity) o;

        return id_comment_post == that.id_comment_post;

    }

    @Override
    public int hashCode() {
        return id_comment_post;
    }

    @Override
    public String toString() {
        return "CommentPostEntity{" +
                "id_comment_post=" + id_comment_post +
                ", content='" + content + '\'' +
                '}';
    }
}
