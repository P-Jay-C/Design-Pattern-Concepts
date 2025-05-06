package day12.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        ChatRoomMediator chatRoom = new ChatRoomMediator();

        User alice = new User("Alice", chatRoom);
        User bob = new User("Bob", chatRoom);
        User charlie = new User("Charlie", chatRoom);

        chatRoom.addUser(alice);
        chatRoom.addUser(bob);
        chatRoom.addUser(charlie);

        alice.sendMessage("Hi everyone!");
        bob.sendMessage("Hey Alice!");
    }
}