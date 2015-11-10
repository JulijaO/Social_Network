package socnetwork.model;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class LikePost {
    private int id_like_post;
    private int id_post;
    private int id_contact;

    public int getId_like_post() {
        return id_like_post;
    }

    public void setId_like_post(int id_like_post) {
        this.id_like_post = id_like_post;
    }

    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    public int getId_contact() {
        return id_contact;
    }

    public void setId_contact(int id_contact) {
        this.id_contact = id_contact;
    }

    @Override
    public String toString() {
        return "LikePost{" +
                "id_like_post=" + id_like_post +
                ", id_post=" + id_post +
                ", id_contact=" + id_contact +
                '}';
    }
}
