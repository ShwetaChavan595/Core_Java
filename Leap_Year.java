// Wap a program to check wheather it is a Leap year or not 
import java.util.*;

public class Leap_Year
{

public static void main(String args[])
{
int year;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the year");
year=sc.nextInt();

System.out.println("---------------------------");

if(year%4 ==0 && year % 400 ==0)
{
System.out.println("The year is a leap year");

}
else
{

System.out.println("The year is not a leap year");
}
}
}

//OUTPUT 
C:\PROGRAMS>javac Leap_Year.java

C:\PROGRAMS>java Leap_Year
Enter the year
2012
---------------------------
The year is not a leap year

C:\PROGRAMS>java Leap_Year
Enter the year
2000
---------------------------
The year is a leap year

C:\PROGRAMS>
