//Write java program to invoke current class method using this keyword

public class ThisKeywordExample {

    // Method that will be called using 'this' keyword
    public void displayMessage() {
        System.out.println("Hello from the current class method!");
    }

    // Method to invoke the 'displayMessage' method using 'this'
    public void invokeMethod() {
        this.displayMessage(); // Using 'this' keyword to invoke current class method
    }

    public static void main(String[] args) {
        // Create an object of the current class
        ThisKeywordExample example = new ThisKeywordExample();
        
        // Invoke method using 'this' inside the class
        example.invokeMethod();
    }
}

//OUTPUT
c:\PROGRAMS>java ThisKeywordExample
Hello from the current class method!


