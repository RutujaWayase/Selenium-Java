/*
 Array Exploration
Create an Array:

Create a new array called numbers to store 5 numerical values of your choice (they can be whole numbers or decimals).

Access and Print:

Print the following:

The first element of the numbers array.

The last element of the numbers array.

Reverse Order:

Using a loop, print the elements of the numbers array in reverse order.

Bonus: Element Count:

Calculate the total number of elements within the numbers array.
 */

package CoreJava;

public class ArrayOperations {
	
	public static void main(String[] args) {
        // 1. Create an Array
        double[] numbers = {2.5, 9.0, 17.2, 5.0, 3.14};
 
        // 2. Access and Print
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]); 
 
        // 3. Reverse Order
        System.out.println("Elements in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
 
        // 4. Bonus: Element Count
        System.out.println("Total elements in the array: " + numbers.length);
    }

}
