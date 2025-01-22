//Write a java programs to check candidate eligible for voting or not 

import java.util.*;

public class Voting {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the Student: ");
        age = sc.nextInt();
        
        if (age >= 18) {
            System.out.println("Eligible for voting.");
        } else {
            System.out.println("Not Eligible for voting.");
        }
       
    }
}

//Output 


C:\PROGRAMS>javac Voting.java

C:\PROGRAMS>java Voting
Enter the age of the Student:
45
Eligible for voting.

C:\PROGRAMS>java Voting
Enter the age of the Student:
11
Not Eligible for voting.

C:\PROGRAMS>
