class Student{
    int rollNo;  //Instance variables: because they belong to the object
    String name;
    static int count=0; //static variables belong to a class
    Student(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
        count++;
    }
    static void showCount(){  //static methods can only use static variables
        System.out.println(count);
    }
}
public class SecretStudy {
    public static void main(String[] args){
        Student s1=new Student(1,"Shyam");
        System.out.println(s1.count);
        Student s2=new Student(2,"Ram");
        System.out.println(s2.count);
        Student s3=new Student(3,"Alex");
        System.out.println(s3.count);

        //Task is to find the total number of objects created of Student class
        System.out.println(Student.count);
        Student.showCount();
    }
}