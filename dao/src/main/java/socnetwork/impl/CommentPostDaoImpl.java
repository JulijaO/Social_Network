package socnetwork.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import socnetwork.CommentPostDao;
import socnetwork.model.CommentPost;

import java.util.List;

/**
 * Created by ulia2612 on 09.11.15.
 */
public class CommentPostDaoImpl implements CommentPostDao{

    @Autowired
    private SessionFactory sessionFactory;

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
