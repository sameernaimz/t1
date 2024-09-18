package day34_tasks;

public class Book {
    String title;
    String author;
    String genre;
    int chapter;
    int price;
    boolean hasAmovie;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", chapter=" + chapter +
                ", price=" + price +
                ", hasAmovie=" + hasAmovie +
                '}';
    }
}
