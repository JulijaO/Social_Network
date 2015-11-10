package socnetwork.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import socnetwork.PhotoDao;
import socnetwork.model.Photo;

import java.util.List;

/**
 * Created by ulia2612 on 09.11.15.
 */
public class PhotoDaoImpl implements PhotoDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void savePhoto(Photo photo) {

    }

    @Override
    public void deletePhoto(Photo photo) {

    }

    @Override
    public List<Photo> getPhotoForContact(int id_contact) {
        return null;
    }

    @Override
    public Photo getbyPhoto(int id_photo) {
        return null;
    }
}
