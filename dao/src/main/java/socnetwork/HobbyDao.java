package socnetwork;

import socnetwork.model.Hobby;

import java.util.List;

/**
 * Created by ulia2612 on 09.11.15.
 */
public interface HobbyDao {
    void addHobby (String title, String description);
    void deleteHobby (Hobby hobby);
    List<Hobby> getAllHobbyForContact (int id_contact);
}
