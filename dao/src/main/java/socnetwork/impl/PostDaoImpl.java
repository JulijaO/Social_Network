package socnetwork.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import socnetwork.PostDao;
import socnetwork.model.Post;

import java.util.List;

/**
 * Created by ulia2612 on 09.11.15.
 */
public class PostDaoImpl implements PostDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addPost(Post post) {

    }

    @Override
    public void deletePost(Post post) {

    }

    @Override
    public void editPost(Post post) {

    }

    @Override
    public List<Post> getAllPostForContact(int id_contact) {
        return null;
    }
}
