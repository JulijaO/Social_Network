package socnetwork.model;

import java.time.LocalDateTime;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class Message {
    private int id_message;
    private LocalDateTime create_time_message;
    private String content_message;
    private Contact recipient;
    private Contact sender;

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

    public Contact getRecipient() {
        return recipient;
    }

    public void setRecipient(Contact recipient) {
        this.recipient = recipient;
    }

    public Contact getSender() {
        return sender;
    }

    public void setSender(Contact sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id_message=" + id_message +
                ", create_time_message=" + create_time_message +
                ", content_message='" + content_message + '\'' +
                ", recipient=" + recipient +
                ", sender=" + sender +
                '}';
    }
}
