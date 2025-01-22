// Write a Java Program  to pass  this keyword as argument in the constructor call.



class A {
    int num;

    // Constructor of class A
    A(int num) {
        this.num = num;
    }

    // Method to display the value of num
    void display() {
        System.out.println("Value of num: " + num);
    }

    // Method to pass 'this' as an argument to the constructor of class B
    void passThisToB() {
        B b = new B(this); // Passing 'this' object of class A to constructor of class B
        b.show();
    }
}

class B {
    A a;  // Object of class A

    // Constructor of class B which accepts an object of class A
    B(A a) {
        this.a = a;
    }

    // Method to display the value of num from object of class A
    void show() {
        System.out.println("Value from class A's num: " + a.num);
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A(100);   // Create an object of class A with value 100
        a.passThisToB();     // Passing 'this' (object of class A) to class B's constructor
    }
}


//Output 

c:\PROGRAMS>java Main
Value from class A's num: 100

