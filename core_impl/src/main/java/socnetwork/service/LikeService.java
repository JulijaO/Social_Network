package socnetwork.service;

import socnetwork.LikeServiceInterface;
import socnetwork.model.LikeCommentPost;
import socnetwork.model.LikePhoto;
import socnetwork.model.LikePost;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class LikeService implements LikeServiceInterface {

    private LikeCommentPost likeCommentPost;

    private LikePhoto likePhoto;

    private LikePost likePost;

    @Override
    public void saveLikeCommentPost(LikeCommentPost likeCommentPost) {

    }

    @Override
    public void saveLikePhoto(LikePhoto likePhoto) {

    }

    @Override
    public void saveLikePost(LikePost likePost) {

    }

    @Override
    public int getCountLike(int id) {
        return 0;
    }

    @Override
    public boolean isLike(int id, int id_contact) {
        return false;
    }
}
