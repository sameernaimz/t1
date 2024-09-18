package day35_tasks.App;
/*
A) Create a class called DiscordUser in your Practice_Programming project and inside the da35_tasks package


        Task:

		- data/create instance variables:
			role, name, id



		- create constructor to initialize the variables



    		- create a toString() method
 */
public class DiscordUser {
    String role;
    String name;
    String id;

    public DiscordUser(String role, String name, String id) {
        this.role = role;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "DiscordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
