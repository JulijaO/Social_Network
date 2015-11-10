package socnetwork;


import socnetwork.model.Photo;

import java.util.List;

/**
 * Created by ulia2612 on 08.11.15.
 */
public interface PhotoServiceInterface {
    void savePhoto (Photo photo);
    void deletePhoto (Photo photo);
    List<Photo> getPhotoForContact (int id_contact);
}
