class A{
    public int a, b;
    public void show(){
        System.out.println("Showing");
    }
}
//single inheritance
class B extends A{
    int c,d;
    public void write(){
        System.out.println("Writing");
    }
}
//multilevel inheritance
class C extends B{
    int e, f;
    public void speak(){
        System.out.println("Speaking");
    }
}
//hierarchial inheritance
class D extends C{
    int g,h;
    public void eat(){
        System.out.println("Eating!");
    }
}

public class Inheritance {
    public static void main(String[] args){
        B b=new B();
        C c=new C();
        D d=new D();
        b.write();
        c.speak();
        d.eat();
    }
}