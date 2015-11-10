package socnetwork;

import socnetwork.model.Contact;
import socnetwork.model.Hobby;
import socnetwork.model.Photo;
import socnetwork.model.Place;

import java.util.List;

/**
 * Created by ulia2612 on 09.11.15.
 */
public interface ContactDao {

    List<Contact> getAllContacts();
    void saveContact(Contact contact);
    void editContact (Contact contact);
    void deleteContact (Contact contact);
    Contact getBy (String email, String password);
    void addFriendship(Contact firstcontact, Contact secondcontact);
    void deleteFriendship(Contact firstcontact, Contact secondcontact);
    void addHobbyToContact (Contact contact, Hobby hobby);
    void addPlaceToContact (Contact contact, Place place);
    void addPostToContact (Contact contact, Photo photo);
    void addPhotoToContact (Contact contact, Photo photo);
    void deleteHobbyToContact (Contact contact, Hobby hobby);
    void deletePlaceToContact (Contact contact, Place place);
    void deletePostToContact (Contact contact, Photo photo);
    void deletePhotoToContact (Contact contact, Photo photo);

}
