package ANP_D0453;

import java.util.TreeSet;

public class treesetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a TreeSet to store Integer values
        TreeSet<Integer> numbers = new TreeSet<>();
        
        // Adding integer values to the TreeSet
        numbers.add(25);
        numbers.add(10);
        numbers.add(50);
        numbers.add(5);
        numbers.add(30);
        
        // Displaying the values in sorted order
        System.out.println("TreeSet Elements in Sorted Order: " + numbers);

	}

}
/*output
 * TreeSet Elements in Sorted Order: [5, 10, 25, 30, 50] 
 */
    