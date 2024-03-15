//if we have abstract method then the class must be abstract class.
abstract class Car{   //we can't instantiate an abstract class i.e. we cannot create object of an abstract class
    int maxSpeed;
    abstract void accelerate(); //only declared but not implemented i.e. withoud a body
    //they are created to force the child classes to implement them before using. we will use them after overriding.
    abstract void brake();
}
abstract class BMW extends Car{
    void accelerate(){
        System.out.println("BMW is accelerating");
    }
}
class BMW2 extends BMW{
    void brake(){
        System.out.println("BMW is braking");
    }
}
public class Abstraction {
    public static void main(String[] args){
     //Car c=new Car();  //cannot instantiate an abstract class.
//        BMW b1=new BMW();
//        b1.accelerate();
        BMW2 b2=new BMW2();
        b2.brake();
    }
}