package socnetwork;

import socnetwork.model.LikePhoto;
import socnetwork.model.LikePost;

/**
 * Created by ulia2612 on 09.11.15.
 */
public interface LikePhotoDao {
    void saveLikePhoto (LikePhoto likePhoto);
    int getCountLike (int id_like);
    boolean isLike (int id_photo, int id_contact);
}
