public class Shadowing{
    static int x=90;
    public static void main(String[] args){
        System.out.println(x);
        int x=40;
        System.out.println(x);
    }
    // static void fun(){
    // System.out.println(x);
}
}

/*
VARARGS(VARIABLE ARGUMENTS):-METHOD TO ACCEPT ZERO OR MORE ARGUMENTS OF SAME TYPE.
SYNATX:-
returnType methodName(type... variableName)
EXAMPLE:-
*/
public class Ex{
    static void printnum(int...numbers){
        for(int num:numbers){
            System.out.println(num);
        }
        System.out.println();
    }
    public static void main(String[] args){
        printnum(1,2,3);
    }
}

