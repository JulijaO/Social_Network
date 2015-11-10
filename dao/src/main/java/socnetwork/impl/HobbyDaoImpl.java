package socnetwork.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import socnetwork.HobbyDao;
import socnetwork.model.Hobby;

import java.util.List;

/**
 * Created by ulia2612 on 09.11.15.
 */
public class HobbyDaoImpl implements HobbyDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addHobby(String title, String description) {

    }

    @Override
    public void deleteHobby(Hobby hobby) {

    }

    @Override
    public List<Hobby> getAllHobbyForContact(int id_contact) {
        return null;
    }
}
