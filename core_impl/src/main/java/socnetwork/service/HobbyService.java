package socnetwork.service;

import socnetwork.HobbyServiceInterface;
import socnetwork.model.Hobby;

import java.util.List;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class HobbyService implements HobbyServiceInterface {

   private Hobby hobby;

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
