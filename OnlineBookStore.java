public class OnlineBookStore {
    public static void main(String[] args) {
        // Criar uma instância de livro
        Book book = new Book("Effective Java", "Joshua Bloch", 39.99);

        // Create a book view instance
        BookView view = new BookView();

        // Create a book controller instance
        BookController controller = new BookController(book, view);

        // Display the initial book details
        controller.updateView();

        // Update the book details and display the updated details
        controller.setBookTitle("Clean Code");
        controller.setBookAuthor("Robert C. Martin");
        controller.setBookPrice(34.99);
        controller.updateView();
    }
}

