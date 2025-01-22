//Write a Java program to take Employee id,name,address & salary from user and display on to screen.
import java.util.*;
class Employee_Details {
    public static void main(String args[]) {
        int Emp_id;
        String Emp_name;
        String Emp_Address;
        double Emp_salary;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee id ");
        Emp_id = sc.nextInt();
        sc.nextLine();
        System.out.println("----------------------------");
        System.out.println("Enter the employee name");
        Emp_name = sc.nextLine();
        System.out.println("----------------------------");
        System.out.println("Enter the employee address");
        Emp_Address = sc.nextLine();
        System.out.println("----------------------------");
        System.out.println("Enter the employee salary ");
        Emp_salary = sc.nextDouble();
	System.out.println("*********************************");
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + Emp_id);
        System.out.println("Name: " + Emp_name);
        System.out.println("Address: " + Emp_Address);
        System.out.println("Salary: " + Emp_salary);
    }
}

//OUTPUT 

C:\PROGRAMS>javac Employee_Details.java

C:\PROGRAMS>java Employee_Details
Enter the Employee id
3
----------------------------
Enter the employee name
Shweta
----------------------------
Enter the employee address
Solapur
----------------------------
Enter the employee salary
40000
*********************************

Employee Details:
ID: 3
Name: Shweta
Address: Solapur
Salary: 40000.0