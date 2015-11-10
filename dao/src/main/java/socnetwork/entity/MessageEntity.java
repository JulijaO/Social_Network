package socnetwork.entity;

import com.sun.javafx.beans.IDProperty;
import socnetwork.converters.MyLocalDateTimeToTimestampConverter;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by ulia2612 on 08.11.15.
 */
@Entity
@Table(name = "message")
public class MessageEntity {
    @Id
    @Column(name = "id_message", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    @JoinColumn
    private int id_message;

    @Column(name = "create_time_message", nullable = false)
    @Convert(converter = MyLocalDateTimeToTimestampConverter.class)
    private LocalDateTime create_time_message;

    @Column(name = "content_message", nullable = false)
    private String content_message;

    @Column(name = "recipient", nullable = false)
    private ContactEntity recipient;

    @Column(name = "sender", nullable = false)
    private ContactEntity sender;

    public int getId_message() {
        return id_message;
    }

    public void setId_message(int id_message) {
        this.id_message = id_message;
    }

    public LocalDateTime getCreate_time_message() {
        return create_time_message;
    }

    public void setCreate_time_message(LocalDateTime create_time_message) {
        this.create_time_message = create_time_message;
    }

    public String getContent_message() {
        return content_message;
    }

    public void setContent_message(String content_message) {
        this.content_message = content_message;
    }

    public ContactEntity getRecipient() {
        return recipient;
    }

    public void setRecipient(ContactEntity recipient) {
        this.recipient = recipient;
    }

    public ContactEntity getSender() {
        return sender;
    }

    public void setSender(ContactEntity sender) {
        this.sender = sender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageEntity)) return false;

        MessageEntity message = (MessageEntity) o;

        return id_message == message.id_message;

    }

    @Override
    public int hashCode() {
        return id_message;
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "id_message=" + id_message +
                ", create_time_message=" + create_time_message +
                ", content_message='" + content_message + '\'' +
                ", recipient=" + recipient +
                ", sender=" + sender +
                '}';
    }
}
