// Wap a program to check wheathre the number is perfect or not 

/* 6=1,2,3,4,5  here the 6 is completly divisible by the 1,2,3 then to check wheather the number is perfct or not for that we need to check
that 6 is  completly divisble by 1,2,& 3 then we have to check the sum of them that is 1+2+3=6 then further our taken number that is 6 and 
its sum is 6 if these both matches with each other then we said that number is perfect number */

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int num,sum=0;   //Declare the num and sum variable 

       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();

        for(int i=1;i<num;i++)
        {
            if(num%i==0)      //it checks whether the number is completly divisible by that number or not 
            {
                sum=sum+i;         //it yes then we just simpply take the addition 

            }
        }

        if(num==sum)                   //we have to check wheather the num is equal to their sum or not 
        {
            System.out.println("Perfect Number");

        }
        else{
            System.out.println("Not a perfect number");

        }

    }
}


//OUTPUT 

Enter the number:
6
Perfect Number
