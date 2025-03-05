package ANP_D0453;

import java.util.ArrayDeque;

public class BookQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Creating an ArrayDeque to store book names
        ArrayDeque<String> bookQueue = new ArrayDeque<>();
        
        // Adding books to the queue from both ends
        bookQueue.addFirst("Harry Potter");
        bookQueue.addLast("The Lord of the Rings");
        bookQueue.addFirst("To Kill a Mockingbird");
        bookQueue.addLast("Pride and Prejudice");
        
        // Displaying the books in the queue
        System.out.println("Books in Queue: " + bookQueue);
        
        // Removing books from both ends
        String removedFirst = bookQueue.pollFirst();
        String removedLast = bookQueue.pollLast();
        
        // Displaying removed books
        System.out.println("Removed from First: " + removedFirst);
        System.out.println("Removed from Last: " + removedLast);
        
        // Displaying remaining books in the queue
        System.out.println("Remaining Books in Queue: " + bookQueue);

	}

}
/*output
 * Books in Queue: [To Kill a Mockingbird, Harry Potter, The Lord of the Rings, Pride and Prejudice]
Removed from First: To Kill a Mockingbird
Removed from Last: Pride and Prejudice
Remaining Books in Queue: [Harry Potter, The Lord of the Rings] 
 */
