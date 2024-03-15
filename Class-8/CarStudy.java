class Car{
    String name;
    String color;
    int year;
    int maxSpeed;
    void accelerate(){
        System.out.println(name+" is accelerating");
    }
}
public class CarStudy {
    public static void main(String[] args){
        Car polo=new Car();
        polo.name="Polo";
        polo.color="Red";
        polo.year=2019;
        polo.maxSpeed=220;
        System.out.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);
        polo.accelerate();
    }
}