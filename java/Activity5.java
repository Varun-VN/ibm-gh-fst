package fst;

public class Activity5 {

	public static void main(String[] args) {
		// Initialize title of the book
		String title = "The Hunger Games";
		// Create object for MyBook
		Activity5 activity = new Activity5();
		Book newNovel = activity.new MyBook();
		// Set title
		newNovel.setTitle(title);

		// Print result
		System.out.println("The title is: " + newNovel.getTitle());

	}

	// Abstract class
	abstract class Book {
		String title;

		// Abstract method
		abstract void setTitle(String title);

		// Concrete method
		String getTitle() {
			return title;
		}
	}

	class MyBook extends Book {
		// Define abstract method
		public void setTitle(String title) {
			this.title = title;
		}
	}
}
