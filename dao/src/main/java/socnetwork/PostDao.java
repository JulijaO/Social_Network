package socnetwork;

import socnetwork.model.Post;

import java.util.List;

/**
 * Created by ulia2612 on 09.11.15.
 */
public interface PostDao {
    void addPost(Post post);
    void deletePost (Post post);
    void editPost (Post post);
    List<Post> getAllPostForContact (int id_contact);
}
