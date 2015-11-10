package socnetwork.entity;

import socnetwork.converters.MyLocalDateConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Created by ulia2612 on 08.11.15.
 */

@Entity
@Table(name = "contact")
public class ContactEntity implements Serializable{

    @Id
    @Column(name = "id_contact")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_contact;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "FirstName", nullable = false)
    private String firstname;

    @Column(name = "LastName", nullable = false)
    private String lastname;

    @Column(name = "birthday", nullable = false)
    @Convert(converter = MyLocalDateConverter.class)
    private LocalDate birthday;


    @OneToMany(mappedBy = "id_contact")
    private List<ContactDataEntity> contactDataEntities;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "id_hobby", joinColumns = @JoinColumn(name = "id_contact"), inverseJoinColumns = @JoinColumn(name = "id_hobby"))
    private Set<HobbyEntity> hobby;

    @ManyToMany(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinTable(name = "id_place", joinColumns = @JoinColumn(name = "id_contact"), inverseJoinColumns = @JoinColumn(name = "id_place"))
    private Set<PlaceEntity> places;

    @OneToMany(mappedBy = "id_contact")
    private List<PhotoEntity> photoList;

    @OneToMany(mappedBy = "id_contact")
    private List<MessageEntity> messageEntity;

    @OneToMany(mappedBy = "id_contact")
    private List<PostEntity> postEntities;


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

    public List<ContactDataEntity> getContactDataEntities() {
        return contactDataEntities;
    }

    public void setContactDataEntities(List<ContactDataEntity> contactDataEntities) {
        this.contactDataEntities = contactDataEntities;
    }

    public Set<HobbyEntity> getHobby() {
        return hobby;
    }

    public void setHobby(Set<HobbyEntity> hobby) {
        this.hobby = hobby;
    }

    public Set<PlaceEntity> getPlaces() {
        return places;
    }

    public void setPlaces(Set<PlaceEntity> places) {
        this.places = places;
    }

    public List<PhotoEntity> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<PhotoEntity> photoList) {
        this.photoList = photoList;
    }

    public String getAva_photo() {
        return ava_photo;
    }

    public List<MessageEntity> getMessageEntity() {
        return messageEntity;
    }

    public void setMessageEntity(List<MessageEntity> messageEntity) {
        this.messageEntity = messageEntity;
    }

    public List<PostEntity> getPostEntities() {
        return postEntities;
    }

    public void setPostEntities(List<PostEntity> postEntities) {
        this.postEntities = postEntities;
    }

    public void setAva_photo(String ava_photo) {
        this.ava_photo = ava_photo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactEntity contact = (ContactEntity) o;

        return Objects.equals(id_contact, contact.id_contact);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id_contact);
    }

    @Override
    public String toString() {
        return "ContactEntity{" +
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
