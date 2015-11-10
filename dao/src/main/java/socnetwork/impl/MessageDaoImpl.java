package socnetwork.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import socnetwork.MessageDao;
import socnetwork.model.Message;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by ulia2612 on 09.11.15.
 */
public class MessageDaoImpl implements MessageDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void sendMessage(String content, int id_sender, int id_recipient, LocalDateTime create_time_message) {

    }

    @Override
    public List<Message> getMessageForContact(Message message) {
        return null;
    }
}
