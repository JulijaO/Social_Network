package socnetwork.service;

import socnetwork.CommentPostInterface;
import socnetwork.model.CommentPost;

import java.util.List;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class CommentPostService implements CommentPostInterface {

    private CommentPost commentPost;
    @Override
    public void saveCommentPost(CommentPost commentPost) {

    }

    @Override
    public void deleteCommentPost(CommentPost commentPost) {

    }

    @Override
    public List<CommentPost> getAllCommentsForPost(int id_post) {
        return null;
    }
}
