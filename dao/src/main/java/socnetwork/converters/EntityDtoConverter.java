package socnetwork.converters;

import socnetwork.entity.*;
import socnetwork.model.*;

/**
 * Created by ulia2612 on 10.11.15.
 */
public class EntityDtoConverter {

    private EntityDtoConverter() {
    }

    public static ContactEntity contactEntity (Contact contact){
        if (contact == null){
            return null;
        }
        ContactEntity contactEntity = new ContactEntity();

        contactEntity.setId_contact(contact.getId_contact());
        contactEntity.setLogin(contact.getLogin());
        contactEntity.setPassword(contact.getPassword());
        contactEntity.setLastname(contact.getLastname());
        contactEntity.setFirstname(contact.getFirstname());
        contactEntity.setBirthday(contact.getBirthday());
        contactEntity.setAva_photo(contact.getAva_photo());

        return contactEntity;
    }

    public static Contact contact (ContactEntity contactEntity){
        if (contactEntity == null){
            return null;
        }
        Contact contact = new Contact();

        contact.setId_contact(contactEntity.getId_contact());
        contact.setLogin(contactEntity.getLogin());
        contact.setPassword(contactEntity.getPassword());
        contact.setLastname(contactEntity.getLastname());
        contact.setFirstname(contactEntity.getFirstname());
        contact.setBirthday(contactEntity.getBirthday());
        contact.setAva_photo(contactEntity.getAva_photo());

        return contact;
    }

    public static CommentPostEntity commentPostEntity (CommentPost commentPost){
        if (commentPost == null){
            return null;
        }
        CommentPostEntity commentPostEntity = new CommentPostEntity();

        commentPostEntity.setId_comment_post(commentPost.getId_comment_post());
        commentPostEntity.setContent(commentPost.getContent());

        return commentPostEntity;
    }

    public static CommentPost commentPost (CommentPostEntity commentPostEntity){
        if (commentPostEntity == null){
            return null;
        }
        CommentPost commentPost = new CommentPost();

        commentPost.setId_comment_post(commentPostEntity.getId_comment_post());
        commentPost.setContent(commentPostEntity.getContent());

        return commentPost;
    }

    public static ContactDataEntity contactDataEntity (ContactData contactData){
        if (contactData == null){
            return null;
        }
        ContactDataEntity contactDataEntity = new ContactDataEntity();

        contactDataEntity.setId_contact_data(contactData.getId_contact_data());
        contactDataEntity.setPhone(contactData.getPhone());
        contactDataEntity.setEmail(contactData.getEmail());
        contactDataEntity.setCountry(contactData.getCountry());
        contactDataEntity.setCity(contactData.getCity());

        return contactDataEntity;
    }

    public static ContactData contactData (ContactDataEntity contactDataEntity){
        if(contactDataEntity == null){
            return null;
        }
        ContactData contactData = new ContactData();

        contactData.setId_contact_data(contactDataEntity.getId_contact_data());
        contactData.setPhone(contactDataEntity.getPhone());
        contactData.setEmail(contactDataEntity.getEmail());
        contactData.setCountry(contactDataEntity.getCountry());
        contactData.setCity(contactDataEntity.getCity());

        return contactData;
    }

    public static HobbyEntity hobbyEntity (Hobby hobby){
        if(hobby == null){
            return null;
        }
        HobbyEntity hobbyEntity = new HobbyEntity();

        hobbyEntity.setId_hobby(hobby.getId_hobby());
        hobbyEntity.setTitle(hobby.getTitle());
        hobbyEntity.setDescription(hobby.getDescription());

        return hobbyEntity;
    }

    public static Hobby hobby (HobbyEntity hobbyEntity){
        if(hobbyEntity == null){
            return null;
        }
        Hobby hobby = new Hobby();

        hobby.setId_hobby(hobbyEntity.getId_hobby());
        hobby.setTitle(hobbyEntity.getTitle());
        hobby.setDescription(hobbyEntity.getDescription());

        return hobby;
    }

    public static LikeCommentPostEntity likeCommentPostEntity (LikeCommentPost likeCommentPost){
        if(likeCommentPost == null){
            return null;
        }
        LikeCommentPostEntity likeCommentPostEntity = new LikeCommentPostEntity();

        likeCommentPostEntity.setId_like_comment_post(likeCommentPost.getId_like_comment_post());
        likeCommentPostEntity.setId_comment_post(likeCommentPost.getId_comment_post());
        likeCommentPostEntity.setId_contact(likeCommentPost.getId_contact());

        return likeCommentPostEntity;
    }

    public static LikeCommentPost likeCommentPost(LikeCommentPostEntity likeCommentPostEntity){
        if(likeCommentPostEntity == null){
            return null;
        }
        LikeCommentPost likeCommentPost = new LikeCommentPost();

        likeCommentPost.setId_like_comment_post(likeCommentPostEntity.getId_like_comment_post());
        likeCommentPost.setId_comment_post(likeCommentPostEntity.getId_comment_post());
        likeCommentPost.setId_contact(likeCommentPostEntity.getId_contact());

        return likeCommentPost;
    }

    public static LikePhotoEntity likePhotoEntity (LikePhoto likePhoto){
        if(likePhoto == null){
            return null;
        }
        LikePhotoEntity likePhotoEntity = new LikePhotoEntity();

        likePhotoEntity.setId_like_photo(likePhoto.getId_like_photo());
        likePhotoEntity.setId_photo(likePhoto.getId_photo());
        likePhotoEntity.setId_contact(likePhoto.getId_contact());

        return likePhotoEntity;
    }

    public static LikePhoto likePhoto (LikePhotoEntity likePhotoEntity){
        if(likePhotoEntity == null){
            return null;
        }
        LikePhoto likePhoto = new LikePhoto();

        likePhoto.setId_like_photo(likePhotoEntity.getId_like_photo());
        likePhoto.setId_photo(likePhotoEntity.getId_photo());
        likePhoto.setId_contact(likePhotoEntity.getId_contact());

        return likePhoto;
    }

    public static LikePostEntity likePostEntity (LikePost likePost){
        if(likePost == null){
            return null;
        }
        LikePostEntity likePostEntity = new LikePostEntity();

        likePostEntity.setId_like_post(likePost.getId_like_post());
        likePostEntity.setId_post(likePost.getId_post());
        likePostEntity.setId_contact(likePost.getId_contact());

        return likePostEntity;
    }

    public static LikePost likePost (LikePostEntity likePostEntity){
        if(likePostEntity == null){
            return null;
        }
        LikePost likePost = new LikePost();

        likePost.setId_like_post(likePostEntity.getId_like_post());
        likePost.setId_post(likePostEntity.getId_post());
        likePost.setId_contact(likePostEntity.getId_contact());

        return likePost;
    }

    public static MessageEntity messageEntity (Message message){
        if(message == null){
            return null;
        }
        MessageEntity messageEntity = new MessageEntity();

        messageEntity.setId_message(message.getId_message());
        messageEntity.setContent_message(message.getContent_message());
        messageEntity.setCreate_time_message(message.getCreate_time_message());

        return messageEntity;
    }

    public static Message message (MessageEntity messageEntity){
        if(messageEntity == null){
            return null;
        }
        Message message = new Message();

        message.setId_message(messageEntity.getId_message());
        message.setCreate_time_message(messageEntity.getCreate_time_message());
        message.setContent_message(messageEntity.getContent_message());

        return message;
    }

    public static PhotoEntity photoEntity (Photo photo){
        if(photo == null){
            return null;
        }
        PhotoEntity photoEntity = new PhotoEntity();

        photoEntity.setId_photo(photo.getId_photo());
        photoEntity.setAddress_photo(photo.getAddress_photo());

        return photoEntity;
    }

    public static PlaceEntity placeEntity (Place place){
        if(place == null){
            return null;
        }
        PlaceEntity placeEntity = new PlaceEntity();

        placeEntity.setId(place.getId());
        placeEntity.setTitle(place.getTitle());
        placeEntity.setDescription(place.getDescription());
        placeEntity.setLatitude(place.getLatitude());
        placeEntity.setLongitude(place.getLongitude());

        return placeEntity;
    }

    public static Place place(PlaceEntity placeEntity){
        if(placeEntity == null){
            return null;
        }
        Place place = new Place();

        place.setId(placeEntity.getId());
        place.setTitle(placeEntity.getTitle());
        place.setDescription(placeEntity.getDescription());
        place.setLatitude(placeEntity.getLatitude());
        place.setLongitude(placeEntity.getLongitude());

        return place;
    }

    public static PostEntity postEntity (Post post){
        if(post == null){
            return null;
        }
        PostEntity postEntity = new PostEntity();

        postEntity.setId_post(post.getId_post());
        postEntity.setContent_post(post.getContent_post());
        postEntity.setCreate_time_post(post.getCreate_time_post());
        postEntity.setId_recipient_post(post.getId_recipient_post());
        postEntity.setId_sender_post(post.getId_sender_post());

        return postEntity;
    }

    public static Post post (PostEntity postEntity){
        if(postEntity == null){
            return null;
        }
        Post post = new Post();

        post.setId_post(postEntity.getId_post());
        post.setContent_post(postEntity.getContent_post());
        post.setCreate_time_post(postEntity.getCreate_time_post());
        post.setId_recipient_post(postEntity.getId_recipient_post());
        post.setId_sender_post(postEntity.getId_sender_post());

        return post;
    }

}
