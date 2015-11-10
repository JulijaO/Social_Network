package socnetwork.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ulia2612 on 08.11.15.
 */
@Entity
@Table(name = "photo")
public class PhotoEntity {
    @Id
    @Column(name = "id_photo", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    @JoinColumn
    private int id_photo;

    @Column(name = "address_photo", nullable = false)
    private String address_photo;

    @OneToMany(mappedBy = "id_photo")
    private List<LikePhotoEntity> likePhotoEntities;


    public int getId_photo() {
        return id_photo;
    }

    public void setId_photo(int id_photo) {
        this.id_photo = id_photo;
    }

    public String getAddress_photo() {
        return address_photo;
    }

    public List<LikePhotoEntity> getLikePhotoEntities() {
        return likePhotoEntities;
    }

    public void setLikePhotoEntities(List<LikePhotoEntity> likePhotoEntities) {
        this.likePhotoEntities = likePhotoEntities;
    }

    public void setAddress_photo(String address_photo) {
        this.address_photo = address_photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhotoEntity)) return false;

        PhotoEntity photo = (PhotoEntity) o;

        return id_photo == photo.id_photo;

    }

    @Override
    public int hashCode() {
        return id_photo;
    }

    @Override
    public String toString() {
        return "PhotoEntity{" +
                "id_photo=" + id_photo +
                ", address_photo='" + address_photo + '\'' +
                '}';
    }
}
