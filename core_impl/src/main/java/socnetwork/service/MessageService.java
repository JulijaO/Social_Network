package socnetwork.service;

import socnetwork.MessageServiceInterface;
import socnetwork.model.Message;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by ulia2612 on 08.11.15.
 */
public class MessageService implements MessageServiceInterface {

    private Message message;

    @Override
    public void sendMessage(String content, int id_sender, int id_recipient, LocalDateTime create_time_message) {

    }

    @Override
    public List<Message> getMessageForContact(Message message) {
        return null;
    }
}
