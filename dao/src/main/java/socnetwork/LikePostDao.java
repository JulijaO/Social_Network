package socnetwork;

import socnetwork.model.LikePost;

/**
 * Created by ulia2612 on 09.11.15.
 */
public interface LikePostDao {
    void saveLikePost (LikePost likePost);
    int getCountLike (int id_likePost);
    boolean isLike (int id_post, int id_contact);
}
