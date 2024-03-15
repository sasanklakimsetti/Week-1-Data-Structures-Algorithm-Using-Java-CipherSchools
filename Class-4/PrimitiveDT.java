public class PrimitiveDT {
    public static void main(String[] args){
        int x=5;
        int y=7;
        System.out.println("X is "+x);
        System.out.println("Y is "+y);
        byte b=10;
        System.out.println("B is "+b);
        //implicit typecasting/ widening/ up-casting
        //storing smaller value in larger datatype
        int i=b;
        System.out.println("i is "+i);
        //narrowing/ down-casting/ explicit typecasting
        //storing larger type into smaller type
        byte c=(byte)y;
        System.out.println("c is "+c);
    }
}