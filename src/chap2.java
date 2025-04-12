/* A STRING IS THE SEQUENCE OF CHARACTERS. SYNTAX:
String name;
name=new string("ram");

STRINGS ARE IMMUTABLE AND CANNOT BE CHANGED.

DIFFERENT WAYS TO PRINT IN JAVA ARE:
System.out.print  -> no new line at the end
System.out.println -> prints the new line at the end
System.out.printf -> print formatted output to the console


 */

public class chap2 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        int a = 6;
        double b = 21.538;
        System.out.printf("The value of a is %d and b is %.2f%n", a, b);
        String name = "kavita";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }
}
