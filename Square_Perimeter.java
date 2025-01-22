//write a program to find the perimeter of the square


import java.util.*;

class Square_Perimeter {
    public static void main(String[] args) {
        double length;
	double perimeter;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side length of the square: ");
        length= scanner.nextDouble();

       
        perimeter = 4 * length;

       System.out.println("---------------------------");
        System.out.println("The perimeter of the square is: " + perimeter);

}
}


//OUTPUT 

C:\PROGRAMS>javac Square_Perimeter.java

C:\PROGRAMS>java Square_Perimeter
Enter the side length of the square:
4
---------------------------
The perimeter of the square is: 16.0