package day34_tasks;

public class AllClassesBook {
    public static void main(String[] args) {

        Book nb2 = new Book();
        nb2.title = "sus book";
       nb2.author = "Dr .Suess";
       nb2.chapter = 5;
       nb2.price = 15_00;
       nb2.hasAmovie = true;
        System.out.println(nb2);

        System.out.println("--------------");
        AudioBook a1 = new AudioBook();
        a1.title = "Defending Jacob\t";
        a1.author = "William Landay";
        a1.chapter = 25;
        a1.price = 17_00;
        a1.hasAmovie = true;
        a1.narrator = "Morgan Freeman";
        a1.duration = "2 hour 34 min";

        a1.listen();
        System.out.println("------------");
        Ebook e1 = new Ebook();
        e1.title = "Green eggs & Ham";
        e1.size = 19.5;
        e1.pages = 234;
        e1.read();
    }
}
