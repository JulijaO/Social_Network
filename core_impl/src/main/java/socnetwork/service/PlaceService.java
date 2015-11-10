package socnetwork.service;

import socnetwork.PlaceServiceInterface;
import socnetwork.model.Place;

import java.util.List;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class PlaceService implements PlaceServiceInterface {

    private Place place;

    @Override
    public Place addPlace(String title, String description) {
        return null;
    }

    @Override
    public void deletePlace(Place place) {

    }

    @Override
    public List<Place> getPlaceForContact(int id_contact) {
        return null;
    }
}
