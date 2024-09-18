package day35_tasks.App;

public class Student extends DiscordUser{

    public Student(String role, String name, String id) {
        super(role, name, id);
    }
    public void sendMessage() {
        System.out.println("Sending message to class chat");
    }
}
