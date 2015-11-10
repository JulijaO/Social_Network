package socnetwork.entity;

import javax.persistence.*;

/**
 * Created by ulia2612 on 08.11.15.
 */

@Entity
@Table(name = "hobby")
public class HobbyEntity {
    @Id
    @Column(name = "id_hobby", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    @JoinColumn
    private int id_hobby;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HobbyEntity)) return false;

        HobbyEntity hobby = (HobbyEntity) o;

        return id_hobby == hobby.id_hobby;

    }

    @Override
    public int hashCode() {
        return id_hobby;
    }

    @Override
    public String toString() {
        return "HobbyEntity{" +
                "id_hobby=" + id_hobby +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
