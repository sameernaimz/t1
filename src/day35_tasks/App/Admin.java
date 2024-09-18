package day35_tasks.App;

public class Admin extends DiscordUser {

    public Admin(String role, String name, String id) {
        super(role, name, id);
    }
    public void createChannel() {
        System.out.println("Creating new discord channel");
    }
}
