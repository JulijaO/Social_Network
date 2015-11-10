package socnetwork.model;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class Hobby {
    private int id_hobby;
    private String title;
    private String description;

    public int getId_hobby() {
        return id_hobby;
    }

    public void setId_hobby(int id_hobby) {
        this.id_hobby = id_hobby;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "id_hobby=" + id_hobby +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
