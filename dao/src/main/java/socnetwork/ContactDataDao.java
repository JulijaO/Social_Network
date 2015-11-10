package socnetwork;

import socnetwork.model.ContactData;

/**
 * Created by ulia2612 on 09.11.15.
 */
public interface ContactDataDao {
    void saveContactData (ContactData contactData);
    void editContactData (ContactData contactData);
    void deleteContactData (ContactData contactData);
}
