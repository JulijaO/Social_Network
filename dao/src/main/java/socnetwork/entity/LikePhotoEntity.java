package socnetwork.entity;

import javax.persistence.*;

/**
 * Created by ulia2612 on 08.11.15.
 */

@Entity
@Table(name = "likePhoto")
public class LikePhotoEntity {

    @Column(name = "id_like_photo", nullable = false)
    private int id_like_photo;

    @Column(name = "id_photo", nullable = false)
    private int id_photo;

    @Id
    @Column(name = "id_contact", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    @JoinColumn
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LikePhotoEntity)) return false;

        LikePhotoEntity likePhoto = (LikePhotoEntity) o;

        return id_like_photo == likePhoto.id_like_photo;

    }

    @Override
    public int hashCode() {
        return id_like_photo;
    }

    @Override
    public String toString() {
        return "LikePhotoEntity{" +
                "id_like_photo=" + id_like_photo +
                ", id_photo=" + id_photo +
                ", id_contact=" + id_contact +
                '}';
    }
}
