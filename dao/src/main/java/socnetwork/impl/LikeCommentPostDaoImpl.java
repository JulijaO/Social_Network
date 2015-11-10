package socnetwork.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import socnetwork.LikeCommentPostDao;
import socnetwork.model.LikeCommentPost;

/**
 * Created by ulia2612 on 09.11.15.
 */
public class LikeCommentPostDaoImpl implements LikeCommentPostDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveLikeCommentPost(LikeCommentPost likeCommentPost) {

    }

    @Override
    public int getCountLike(int id_likeCommentPost) {
        return 0;
    }

    @Override
    public boolean isLike(int id_commentPost, int id_contact) {
        return false;
    }
}
