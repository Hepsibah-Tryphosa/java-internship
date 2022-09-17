public class Main {
    public static void main(String[] args) {
        Author a = new Author("sweety", "s@gmail.com", "female");
        Book b = new Book("sweety", a, 11, 1);
        System.out.println(b);
    }
}
