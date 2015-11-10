package socnetwork;


import socnetwork.model.Contact;

/**
 * Created by ulia2612 on 08.11.15.
 */
public interface ContactServiсeInterface {
    void saveContact(Contact contact);
    void editContact (Contact contact);
    void deleteContact (Contact contact);
    Contact getBy (String email, String password);
}
