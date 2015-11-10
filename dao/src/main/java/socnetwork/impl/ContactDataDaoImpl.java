package socnetwork.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import socnetwork.ContactDataDao;
import socnetwork.model.ContactData;

/**
 * Created by ulia2612 on 09.11.15.
 */
public class ContactDataDaoImpl implements ContactDataDao{

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void saveContactData(ContactData contactData) {

    }

    @Override
    public void editContactData(ContactData contactData) {

    }

    @Override
    public void deleteContactData(ContactData contactData) {

    }
}
