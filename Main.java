import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number of books in the catalog: ");
        int maxSize = scanner.nextInt();

        LibraryCatalog catalog = new LibraryCatalog(maxSize);

        char choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case '1':
                    scanner.nextLine(); 
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book publication year: ");
                    int year = scanner.nextInt();
                    catalog.addBook(title, author, year);
                    break;
                case '2':
                    catalog.displayBooks();
                    break;
                case '3':
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != '3');

        scanner.close();
    }
}
