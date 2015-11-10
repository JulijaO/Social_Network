package socnetwork;



import socnetwork.model.Hobby;

import java.util.List;

/**
 * Created by ulia2612 on 08.11.15.
 */
public interface HobbyServiceInterface {
    void addHobby (String title, String description);
    void deleteHobby (Hobby hobby);
    List<Hobby> getAllHobbyForContact (int id_contact);
}
