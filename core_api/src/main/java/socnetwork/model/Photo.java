package socnetwork.model;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class Photo {
    private int id_photo;
    private String address_photo;

    public int getId_photo() {
        return id_photo;
    }

    public void setId_photo(int id_photo) {
        this.id_photo = id_photo;
    }

    public String getAddress_photo() {
        return address_photo;
    }

    public void setAddress_photo(String address_photo) {
        this.address_photo = address_photo;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id_photo=" + id_photo +
                ", address_photo='" + address_photo + '\'' +
                '}';
    }
}
