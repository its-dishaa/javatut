/*
OOPS IN JAVA:
1. ABSTRACTION: data abstraction is the way through which only the essential info is shown to the user,
and all the internal details remain hidden from the user.
2. POLYMORPHISM: One entity many forms.
The word polymorphism comprises two words, poly which means many, and morph, which means forms.
In OOPs, polymorphism is the property that helps to perform a  single task in different ways.
3. ENCAPSULATION: The act of putting various components together (in a capsule).
In java, the variables and methods are the components that are wrapped inside a single unit named class.
All the methods and variables of a class remain hidden from any other class.
4. INHERITANCE: The act of deriving new things from existing things.
In Java, one class can acquire all the properties and behaviours of other some other class
The class which inherits some other class is known as child class or sub class.
The class which is inherited is known as parent class or super class.

 */
/*
public class Employee {
	public int id;
	public String name;

	public int getSalary(){
		//code
		}
	public void getDetails(){
		//code
		}
	};
*/

//public class chap4 {
//    public static void main(String[] args) {
//        System.out.println("Hello and welcome!");
//
//    }
//}

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n){
        name=n;
    }
}
class CellPhone{
    public  void ring(){
        System.out.println("ringing");
    }
    public void vibrate(){
        System.out.println("vibrating");
    }
}