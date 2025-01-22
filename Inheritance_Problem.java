/*Create a parent class called "Person" with attributes such as name, age, and a method called "speak". Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" and a method called "study". Create an object of the Student class and call both the "speak" and "study" methods*/


// Parent class Person here it will be follows the is a relationship 
class Person {
    // Attributes of the Person class
    String name;
    int age;

    // Constructor for Person class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to speak
    public void speak() {
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
    }
}

// Child class Student that extends Person
class Student extends Person {
    // Additional attribute specific to Student
    String grade;

    // Constructor for Student class
    public Student(String name, int age, String grade) {
        super(name, age);  // Call the constructor of the parent (Person) class
        this.grade = grade;
    }

    // Method specific to Student
    public void study() {
        System.out.println("My grade is: " + grade);
    }
}

// Main class to test the inheritance and methods
public class Inheritance_Problem {
    public static void main(String[] args) {
        // Create an object of Student class
        Student student = new Student("Shweta", 22, "A");

        // Call methods from both Person and Student classes
        student.speak();  // Method from Person class
        student.study();  // Method from Student class
    }
}

//OUTPUT 
c:\PROGRAMS>java Inheritance_Problem
My name is: Shweta
My age is: 22
My grade is: A
