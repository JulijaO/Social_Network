package socnetwork;


import socnetwork.model.LikeCommentPost;
import socnetwork.model.LikePhoto;
import socnetwork.model.LikePost;

/**
 * Created by ulia2612 on 08.11.15.
 */
public interface LikeServiceInterface {
    void saveLikeCommentPost (LikeCommentPost likeCommentPost);
    void saveLikePhoto(LikePhoto likePhoto);
    void saveLikePost (LikePost likePost);
    int getCountLike (int id);
    boolean isLike (int id, int id_contact);
}
