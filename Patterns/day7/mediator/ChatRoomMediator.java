package day7.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoomMediator implements Mediator{
    private final List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User sender) {
        for (User user: users){
            if (user != sender){
                user.receiveMessage(message);
            }
        }
    }

    public void addUser(User user) {
        users.add(user);
    }

}
