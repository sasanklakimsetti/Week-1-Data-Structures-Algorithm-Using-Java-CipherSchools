public class OperatorsAndOperands {
    public static void main(String[] args){
        int x=1;
        int y=2;
        int z=x+y;
        //x and y are operands
        //+ is operator
        System.out.println("z: "+z);
        //increment operators
        System.out.println("++z: "+ ++z);  //increment the value first
        System.out.println("z: "+z);
        System.out.println("z++: "+ z++);  //takes the value and then increment
        System.out.println("z: "+z);
        //decrement operators
        System.out.println("--z: "+ --z);  //decrement the value first
        System.out.println("z: "+z);
        System.out.println("z--: "+ z--);  //takes the value and then decrements
        System.out.println("z: "+z);
    }
}