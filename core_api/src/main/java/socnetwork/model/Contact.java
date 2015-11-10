package socnetwork.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class Contact {
    private int id_contact;
    private String login;
    private String password;
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private Set<Hobby> hobby;
    private Set<Place> places;
    private List<Photo> photoList;
    private String ava_photo;

    public int getId_contact() {
        return id_contact;
    }

    public void setId_contact(int id_contact) {
        this.id_contact = id_contact;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Set<Hobby> getHobby() {
        return hobby;
    }

    public void setHobby(Set<Hobby> hobby) {
        this.hobby = hobby;
    }

    public Set<Place> getPlaces() {
        return places;
    }

    public void setPlaces(Set<Place> places) {
        this.places = places;
    }

    public List<Photo> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<Photo> photoList) {
        this.photoList = photoList;
    }

    public String getAva_photo() {
        return ava_photo;
    }

    public void setAva_photo(String ava_photo) {
        this.ava_photo = ava_photo;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id_contact=" + id_contact +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday=" + birthday +
                ", hobby=" + hobby +
                ", places=" + places +
                ", photoList=" + photoList +
                ", ava_photo='" + ava_photo + '\'' +
                '}';
    }
}
