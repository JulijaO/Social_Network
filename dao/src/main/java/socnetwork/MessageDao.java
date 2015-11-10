package socnetwork;

import socnetwork.model.Message;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by ulia2612 on 09.11.15.
 */
public interface MessageDao {
    void sendMessage(String content, int id_sender, int id_recipient, LocalDateTime create_time_message);
    List<Message> getMessageForContact (Message message);
}
