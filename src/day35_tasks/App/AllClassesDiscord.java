package day35_tasks.App;

public class AllClassesDiscord {
    public static void main(String[] args) {
        DiscordUser d1 = new DiscordUser("N/A", "George Washington", "344021");
        System.out.println(d1.role);
        System.out.println(d1.name);
        System.out.println(d1.id);
        System.out.println(d1);
        System.out.println("-------------");

        Admin a1 = new Admin("Admin", "Feyruz", "403240");
        System.out.println(a1.role);
        System.out.println(a1.name);
        System.out.println(a1.id);
        System.out.println(a1);
        a1.createChannel();
        System.out.println("-----------------");

        Student s1 = new Student("Student", "Bilal", "976000");
        System.out.println(s1.role);
        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s1);
        s1.sendMessage();
    }
}
