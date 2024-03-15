import java.util.Scanner;
class Student{
    String name;
    int marks;
    boolean checkPass(){
        //control flow
        //conditional statements
        if(marks>40) return true;
        else return false;
    }
}
public class ControlFlow {
    static int findMax(int a, int b, int c){
        //nested if
//        if(a>b){
//            if(a>c){
//                return a;
//            }
//        }
//        else if(b>a){
//            if(b>c){
//                return b;
//            }
//        }
//        else return c;
        int max=0;
        if(a>b&&a>c) max=a;
        else if(b>a&&b>c) max= b;
        else if(c>a&&c>b) max= c;
        return max;
    }
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="Krithik";
        s1.marks=80;
        Student s2=new Student();
        s2.name="Rishii";
        s2.marks=30;

        System.out.println(s1.checkPass());
        System.out.println(s2.checkPass());

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(findMax(a,b,c));

        //switch case
        char d='a';
        switch(d){
            case 'a':
                System.out.println("Hi this is a");
                break;
            case 'b':
                System.out.println("Hi this is b");
                break;
            case 'c':
                System.out.println("Hi this is c");
                break;
            default:
                System.out.println("I'm neither a nor b nor c");
                break;
        }
    }
}