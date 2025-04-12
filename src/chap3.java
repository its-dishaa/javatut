/*  ARRAY:-
ARRAY IS THE COLLECTION OF SIMILAR TYPE OF DATA HAVING CONTIGUOUS MEMORY ALLOCATION.
INDEXING START FROM 0.

int[] Marks= New int[5]
Marks is reference and new int is object.

1.int[] Marks->Declaration
2. marks=new int[5]; ->memory allocation
3. int[] marks = new int[5]; ->declaration+memory allocation
4. int[] marks = {100,70,80,71,98}; ->declare+initialize
 */
//public class chap3 {
//    public static void main(String[] args) {
//
//        int[] marks = {98, 45, 79, 99, 80};
//        System.out.println(marks[4]);
//        System.out.println(marks.length);
//
//    }
//}

/* FOR EACH LOOP
For each loop is an enhanced version of for loop.
It travels each element of the data structure one by one.

SYNTAX:
for (int element:Arr) {
            Sout(element);    //Prints all the elements
}

 */


public class chap3{
    public static void main(String[] args){
        int [] marks={88,55,44,88,98,78};
        float [] salary={22.3f,55.3f,44.1f};
        System.out.println("printing marks in naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
//        NOW USING FOR LOOP
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
/* MULTIDIMENSIONAL ARRAY:

Multidimensional 2-D Array
A 2-D array can be created as follows:
int [][] flats = new int[2][3]
flats[0][0] = 100
flats[0][1] = 101
flats[0][2] = 102

Similarly, a 3-D array can be created as follows:
String[][][] arr = new String [2][3][4]

 */