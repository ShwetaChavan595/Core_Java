package ANP_D0453;

import java.util.Vector;

//Class to represent student details
class Stud {
 String name;
 int rollNumber;
 String department;
 
 // Constructor
 public Stud(String name, int rollNumber, String department) {
     this.name = name;
     this.rollNumber = rollNumber;
     this.department = department;
 }
 
 // Method to display student details
 public void display() {
     System.out.println("Name: " + name);
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Department: " + department);
     System.out.println("------------------------");
 }
}


public class StudentVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a Vector to store student details
        Vector<Stud> students = new Vector<>();
        
        // Adding student details to the Vector
        students.add(new Stud("Alice", 101, "Computer Science"));
        students.add(new Stud("Bob", 102, "Electronics"));
        students.add(new Stud("Charlie", 103, "Mechanical"));
        
        // Displaying the student details
        System.out.println("Student Details:");
        System.out.println("------------------------");
        for (Stud student : students) {
            student.display();
        }

	}

}
/*output
 * Student Details:
------------------------
Name: Alice
Roll Number: 101
Department: Computer Science
------------------------
Name: Bob
Roll Number: 102
Department: Electronics
------------------------
Name: Charlie
Roll Number: 103
Department: Mechanical
------------------------

*/
