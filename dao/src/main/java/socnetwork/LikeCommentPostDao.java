package socnetwork;

import socnetwork.model.LikeCommentPost;

/**
 * Created by ulia2612 on 09.11.15.
 */
public interface LikeCommentPostDao {
    void saveLikeCommentPost (LikeCommentPost likeCommentPost);
    int getCountLike (int id_likeCommentPost);
    boolean isLike (int id_commentPost, int id_contact);
}
