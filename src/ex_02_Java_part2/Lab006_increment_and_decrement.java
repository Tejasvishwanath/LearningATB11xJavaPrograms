package ex_02_Java_part2;

import java.util.Arrays;

public class Lab006_increment_and_decrement {
    public static void main(String[] args) {
       // increment
        int a=10;
        System.out.println(++a); //pre increment
        int b=10;
        System.out.println(b++); //post increment
        System.out.println(b);
        int c=10;
        System.out.println(++c + c++ + c++);
        //first c is 10 after ++c value is 11
        //second c is now 11 after c++ value will be 12
        //third c is now 12, so 11+11+12=34
        int d = 10;
        System.out.println(++d + d++ + d++);
        System.out.println(d);

        //decrement
        int e=10;
        System.out.println(e--);
        System.out.println(e);
    }
}
