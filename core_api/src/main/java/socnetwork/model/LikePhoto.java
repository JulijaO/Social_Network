package socnetwork.model;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class LikePhoto {
    private int id_like_photo;
    private int id_photo;
    private int id_contact;

    public int getId_like_photo() {
        return id_like_photo;
    }

    public void setId_like_photo(int id_like_photo) {
        this.id_like_photo = id_like_photo;
    }

    public int getId_photo() {
        return id_photo;
    }

    public void setId_photo(int id_photo) {
        this.id_photo = id_photo;
    }

    public int getId_contact() {
        return id_contact;
    }

    public void setId_contact(int id_contact) {
        this.id_contact = id_contact;
    }

    @Override
    public String toString() {
        return "LikePhoto{" +
                "id_like_photo=" + id_like_photo +
                ", id_photo=" + id_photo +
                ", id_contact=" + id_contact +
                '}';
    }
}
