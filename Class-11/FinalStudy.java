class A{
    final int x=0;  //final keyword doesn't let others to change the value.
    final int noOfDigits; //if we don't assign the value to a final variable then it will throw an error because it is the variable which can''t be changed i.e. it needs to be assigned first.
    //but we can initialise and assign in a constructor
    A(){
        noOfDigits=10;
    }
    final void fun(){  //final keyword doesn't let the other class to override the method.
        System.out.println("Hi, I'm a function in class A");
    }
}
final class B extends A{  //final classes can't be inherited

//    void fun(){  //this will throw an error during compile time as in class A, final keyword is used for the method
//        System.out.println("I'm function in B overriding the function in A");
//    }
}
public class FinalStudy {
    public static void main(String[] args){
        B b=new B();
        b.fun();
    }
}