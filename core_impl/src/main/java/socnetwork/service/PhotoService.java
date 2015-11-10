package socnetwork.service;

import socnetwork.PhotoServiceInterface;
import socnetwork.model.Photo;

import java.util.List;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class PhotoService implements PhotoServiceInterface {

   private Photo photo;

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
}
