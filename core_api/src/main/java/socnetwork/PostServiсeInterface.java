package socnetwork;


import socnetwork.model.Post;

import java.util.List;

/**
 * Created by ulia2612 on 08.11.15.
 */
public interface PostServiсeInterface {
    void addPost(Post post);
    void removePost (Post post);
    void editPost (Post post);
    List<Post> getAllPostForContact (int id_contact);
}
