package socnetwork.model;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class ContactData {
    private String phone;
    private String email;
    private String country;
    private String city;
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
    public String toString() {
        return "ContactData{" +
                "phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", id_contact_data=" + id_contact_data +
                '}';
    }
}
