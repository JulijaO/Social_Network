package socnetwork.entity;

import javax.persistence.*;

/**
 * Created by ulia2612 on 08.11.15.
 */

@Entity
@Table(name = "place")
public class PlaceEntity {

    @Id
    @Column(name = "id_photo", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    @JoinColumn
    private int id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "longitude", nullable = false)
    private double longitude;

    @Column(name = "latitude", nullable = false)
    private double latitude;

    @Column(name = "description", nullable = false)
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
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
        if (!(o instanceof PlaceEntity)) return false;

        PlaceEntity place = (PlaceEntity) o;

        return id == place.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "PlaceEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", description='" + description + '\'' +
                '}';
    }
}
