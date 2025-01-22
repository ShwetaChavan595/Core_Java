// Wap a program for the prime number 

/* The number is said to be prime if it is divisible by 1 and itself only then it is said to be the prime number . for chceking wheather the 
the number is prime or not for that we need go take one input from the user then we have to chek wheather that number is completly divible or not 
if it is divisible then increment the count value .Then we have to check aagin that the number is equla to 2 or not . The proime number 
is always divisible by 1 & itself only if the number is greather than 2 then that number is not be a prime number 

*/

import java.util.*;

class Prime_Number
{
    public static void main(String args[])
    {
        int num,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");  // Take a input from the user 
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)            // Chcek whether that number is completly divisible or not 
            {
                count++;              //Increment the count variable 

            }
        }

        if(count==2)                   //Chcek wheather that count is equal to 2 which means that it is a prime number 
        {
            System.out.println("Prime Number");

        }

        else{                                             //if the count value is not equal to 2 means it is divisible by more than 2 
            System.out.println("Not a prime Number");

        }


    }
}

//OUTPUT 

Enter the number:
7
Prime Number
