/*An array in Java is a collection of elements (like a box of items) where:
All items are of the same data type (e.g., all int, all String, etc.)
Elements are stored in contiguous memory locations
Each element is accessed by an index (starting from 0)

Synatx of arr:-
int[] numbers;

*/

int[] marks = {90, 85, 70, 95, 88};  //initialisation of array
for (int i = 0; i < marks.length; i++) {
    System.out.println("Mark " + i + ": " + marks[i]);
}

//String Array:- 
String[] fruits = {"Apple", "Banana", "Mango"};
System.out.println(fruits[1]);  // Output: Banana

/* Ways for accessing a array:-
1. Using indexing:- You can access each element using its index (starts from 0).
Example:-
  */

int[] numbers = {10, 20, 30, 40};

System.out.println(numbers[0]); // prints 10
System.out.println(numbers[2]); // prints 30

//2. Using a For loop:- 
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

//3. For Each Loop:-
for (int num : numbers) {
    System.out.println(num);
}

// Array to String:- Arrays.toString() is a method that converts an array into a readable string format, which is especially useful when you want to print an array.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        System.out.println(Arrays.toString(numbers));
    }
}


// Array of an object:-
 String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        // modify
        str[1] = "kunal";
        System.out.println(Arrays.toString(str));







