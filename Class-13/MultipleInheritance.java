//Multiple inheritance can be achieved in java using Interfaces
//No diamond problem will be faced
interface A{
    int x=10;
    void fun();
}
interface B{
    int x=20;
    void fun();
}
//Multiple Inheritance
class C implements A,B{
    public void fun(){
        System.out.println("Hello I'm function in C");
        System.out.println(A.x); //ambiguity resolved using fully Qualified name  otherwise will give an error.
        System.out.println(B.x);
    }
}
//Multiple Inheritance through Interfaces
interface O extends A,B{
    void fun();
}
class D implements O{
    public void fun(){
        System.out.println("Hello, I'm function in D");
        System.out.println(A.x);
        System.out.println(B.x);
    }
}
public class MultipleInheritance {
    public static void main(String[] args){
        C c1=new C();
        c1.fun();
        D d1=new D();
        d1.fun();
    }
}