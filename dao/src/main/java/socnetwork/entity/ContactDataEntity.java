package socnetwork.entity;

import javax.persistence.*;

/**
 * Created by ulia2612 on 08.11.15.
 */
@Entity
@Table(name = "contact_data")
public class ContactDataEntity {

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "id_hobby", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    @JoinColumn
    private int id_contact_data;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId_contact_data() {
        return id_contact_data;
    }

    public void setId_contact_data(int id_contact_data) {
        this.id_contact_data = id_contact_data;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactDataEntity)) return false;

        ContactDataEntity that = (ContactDataEntity) o;

        return id_contact_data == that.id_contact_data;

    }

    @Override
    public int hashCode() {
        return id_contact_data;
    }

    @Override
    public String toString() {
        return "ContactDataEntity{" +
                "phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", id_contact_data=" + id_contact_data +
                '}';
    }
}
