interface Shape{
    double pi=3.14;  //public, static, final by default
    double getSquare(double r);  //public and abstract
    //we can't create object out of the interface
}
class Circle implements Shape{
    void fun(){
        System.out.println("Hey I implemented an interface named Shape");
    }
    public double getSquare(double r){
        return r*r;
    }
}
public class InterfaceStudy {
    public static void main(String[] args){
        Circle c=new Circle();
        System.out.println(c.getSquare(2.0));
    }
}