import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> books;
    private int capacity;

    public Library(String name){
        this.name = name;
        this.books = new ArrayList<>();
        this.capacity = 4;
    }


    public int getBookCount() {
        return this.books.size();
    }

    public void addBook(Book bookObj) {
        if(this.getBookCount() < this.capacity) {
            this.books.add(bookObj);
        }
    }


}
