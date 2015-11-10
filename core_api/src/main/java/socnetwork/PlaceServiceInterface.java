package socnetwork;


import socnetwork.model.Place;

import java.util.List;

/**
 * Created by ulia2612 on 08.11.15.
 */
public interface PlaceServiceInterface {
    Place addPlace(String title, String description);
    void deletePlace (Place place);
    List<Place> getPlaceForContact(int id_contact);

}
