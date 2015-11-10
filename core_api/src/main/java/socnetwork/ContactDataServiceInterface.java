package socnetwork;

import socnetwork.model.ContactData;

/**
 * Created by ulia2612 on 08.11.15.
 */
public interface ContactDataServiceInterface {
    void saveContactDataService (ContactData contactData);
    void editContactDataService (ContactData contactData);
    void deleteContactDataService (ContactData contactData);
}
