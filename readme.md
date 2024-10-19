# Online Book Store

This project demonstrates a simple implementation of the Model-View-Controller (MVC) design pattern in Java, using a book store as an example.

## Project Structure

The project consists of four main Java classes:

1. `OnlineBookStore.java`: The main class that demonstrates the usage of the MVC pattern.
2. `Book.java`: The Model class that represents a book.
3. `BookView.java`: The View class that handles the display of book information.
4. `BookController.java`: The Controller class that manages the interaction between the Model and the View.

## Class Descriptions

### OnlineBookStore

This is the main class that demonstrates how the MVC pattern works:

- It creates instances of the Model (Book), View (BookView), and Controller (BookController).
- It shows how to update the book details and display them using the controller.

### Book (Model)

This class represents the data model for a book:

- It has properties for title, author, and price.
- It includes getter and setter methods for each property.

### BookView (View)

This class is responsible for displaying the book information:

- It has a method `printBookDetails` that formats and prints the book details.

### BookController (Controller)

This class acts as an intermediary between the Model and the View:

- It holds references to both the Model (Book) and the View (BookView).
- It provides methods to get and set the book properties.
- It includes an `updateView` method to refresh the view with the current model data.

## How It Works

1. The `OnlineBookStore` class creates a `Book` object with initial data.
2. It then creates a `BookView` object for displaying book information.
3. A `BookController` is created, linking the Model and the View.
4. The controller's `updateView` method is called to display the initial book details.
5. The book details are updated using the controller's setter methods.
6. The `updateView` method is called again to display the updated information.

This structure demonstrates the MVC pattern by separating the data (Model), its presentation (View), and the logic that connects them (Controller).

## Running the Program

To run the program, compile all Java files and execute the `OnlineBookStore` class. The output will show the initial book details followed by the updated details.
