package socnetwork;

import socnetwork.model.CommentPost;

import java.util.List;

/**
 * Created by ulia2612 on 09.11.15.
 */
public interface CommentPostInterface {
    void saveCommentPost (CommentPost commentPost);
    void deleteCommentPost (CommentPost commentPost);
    List<CommentPost> getAllCommentsForPost(int id_post);
}
