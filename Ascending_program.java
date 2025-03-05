//Write a Java program to sort in ascending order an array of given integers[45,35,56,67,78,89,78,12,20]
/*
In order to arrange the element of the array we need to chhose the first elemet after that we have to take the j variable from the i+1 that is 0+1=1 postion 
and then we have to check wheather that a[j]<a[i] or not if it less then we simply need to swap their positions

*/

class Ascending_program
{
    public static void main(String[] args) 
    {
      int arr[]={45,35,56,67,78,89,78,12,20};  // Represting the gve array 
      int temp=0;
      System.out.println("Original Array:");
      for(int i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]);   // Displaying those array element 

      } 
      for(int i=0;i<arr.length;i++)    // Consider the ith elemet on the 0 th position    
      {
        for(int j=0;j<i+1;j++)        // Then consider the jth element as 1 that is i+1
        {
            if(arr[j]<arr[i])         // Chck wheather the arr[j]<arr[i] or not 
            {
                temp=arr[i];          //    Then simply replace their postions 
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
      }
        System.err.println("----------------------------");      // Displaying the sorted array list 
        System.out.println("Sorted Array:");
      for(int i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]);

      } 

    }
}


// OUTPUT 
Original Array :
45
35
56
67
78
89
78
12
20
----------------------------
Sorted Array :
89
78
78
67
56
45
35
20
12
