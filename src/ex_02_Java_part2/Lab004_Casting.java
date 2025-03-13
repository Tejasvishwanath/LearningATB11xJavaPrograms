package ex_02_Java_part2;

public class Lab004_Casting {
    public static void main(String[] args) {
        int a=300;
        byte b = (byte)a;  //explicit type casting Narrowing
        System.out.println(b);
        byte c=4;
        double d= c; // implicit casting Widening
        System.out.println(d);

        //Narrowing will always have a data loss and implicit casting is not possible only explicit
        //Widening will not have data a data loss and implicit casting is possible


    }
}
