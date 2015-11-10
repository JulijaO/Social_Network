package socnetwork.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import socnetwork.ContactDao;
import socnetwork.model.Contact;
import socnetwork.model.Hobby;
import socnetwork.model.Photo;
import socnetwork.model.Place;

import java.util.List;

/**
 * Created by ulia2612 on 09.11.15.
 */
public class ContactDaoImpl implements ContactDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Contact> getAllContacts() {
        return null;
    }

    @Override
    public void saveContact(Contact contact) {

    }

    @Override
    public void editContact(Contact contact) {

    }

    @Override
    public void deleteContact(Contact contact) {

    }

    @Override
    public Contact getBy(String email, String password) {
        return null;
    }

    @Override
    public void addFriendship(Contact firstcontact, Contact secondcontact) {

    }

    @Override
    public void deleteFriendship(Contact firstcontact, Contact secondcontact) {

    }

    @Override
    public void addHobbyToContact(Contact contact, Hobby hobby) {

    }

    @Override
    public void addPlaceToContact(Contact contact, Place place) {

    }

    @Override
    public void addPostToContact(Contact contact, Photo photo) {

    }

    @Override
    public void addPhotoToContact(Contact contact, Photo photo) {

    }

    @Override
    public void deleteHobbyToContact(Contact contact, Hobby hobby) {

    }

    @Override
    public void deletePlaceToContact(Contact contact, Place place) {

    }

    @Override
    public void deletePostToContact(Contact contact, Photo photo) {

    }

    @Override
    public void deletePhotoToContact(Contact contact, Photo photo) {

    }
}
