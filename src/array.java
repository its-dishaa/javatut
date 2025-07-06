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

// 2-D Array:- Two Dimensional Array.
class Main {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2},
            {1, 2, 3},
            {5, 7, 8}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}

/*ArrayList:- An ArrayList in Java is a resizable array — unlike regular arrays, which have a fixed size, an ArrayList can grow or shrink as needed.
Think of it like a dynamic list that can hold many elements and automatically manages its size.
SYNATX */
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<>();
    }
}
//EXAMPLE:-

import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in); 

        ArrayList<Integer>list=new ArrayList<>(5);
        list.add(10);
        list.add(100);
        list.add(11);
        list.add(156);
        list.add(111);
        list.add(101);
        list.add(856);
        System.out.println(list);
        list.remove(Integer.valueOf(101));
        list.set(0,22);
        System.out.println(list);
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
        
    }
}

/* Multidimensional ArrayList:- A Multidimensional ArrayList is like a table — an ArrayList inside another ArrayList.
The outer list stores multiple inner lists (which are rows).
Each inner list holds values like columns.
Syntax:-  
ArrayList<ArrayList<Integer>> list = new ArrayList<>();

Example:-
*/


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}






