public class LibraryCatalog {
    private Book[] books;
    private int maxSize;
    private int currentSize;

    public LibraryCatalog(int maxSize) {
        this.maxSize = maxSize;
        this.books = new Book[maxSize];
        this.currentSize = 0;
    }

    public void addBook(String title, String author, int year) {
        if (currentSize < maxSize) {
            Book book = new Book(title, author, year);
            books[currentSize] = book;
            currentSize++;
            System.out.println("Book added to the catalog.");
        } else {
            System.out.println("Catalog is full. Cannot add more books.");
        }
    }

    public void displayBooks() {
        if (currentSize == 0) {
            System.out.println("No books in the catalog.");
        } else {
            System.out.println("Books in the catalog:");
            for (int i = 0; i < currentSize; i++) {
                System.out.println(books[i]);
            }
        }
    }
}
