package socnetwork.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import socnetwork.LikePostDao;
import socnetwork.model.LikePost;

/**
 * Created by ulia2612 on 09.11.15.
 */
public class LikePostDaoImpl implements LikePostDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveLikePost(LikePost likePost) {

    }

    @Override
    public int getCountLike(int id_likePost) {
        return 0;
    }

    @Override
    public boolean isLike(int id_post, int id_contact) {
        return false;
    }
}
