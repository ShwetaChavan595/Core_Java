//Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B]
/*
In order to arrange the element of the array we need to choose the first elemet after that we have to take the j variable from the i+1 that is 0+1=1 postion 
then we need to check arr[j].compareTo(arr[i]) checks if arr[j] comes before arr[i] alphabetically. If arr[j] < arr[i], it returns a negative number.
& The condition if (arr[j].compareTo(arr[i]) < 0) checks if arr[j] is smaller than arr[i].
we simply need to swap their positions

*/

class Descending_program {
    public static void main(String[] args) 
    {
        String arr[] = {"A", "X", "D", "Z", "Y", "C", "W", "B"}; // Representing the given array
        String temp;

        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]); // Displaying the original array elements
        }

        // Sorting logic for descending order
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < i + 1; j++) { // Then consider the jth element as i+1
                if (arr[j].compareTo(arr[i]) < 0) // arr[j].compareTo(arr[i]) checks if arr[j] comes before arr[i] alphabetically.
                { 
                    temp = arr[i]; // Swap their positions
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.err.println("----------------------------"); // Displaying the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]);
        }
    }
}

//OUTPUT 

Original Array:
A
X
D
Z
Y
C
W
B
----------------------------
Sorted Array:
Z
Y
X
W
D
C
B
A