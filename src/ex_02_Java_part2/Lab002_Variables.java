package ex_02_Java_part2;

public class Lab002_Variables {
    public static void main(String[] args) {
        int binary= 0b1010;
        int octal= 0101;
        int hexadecimal=0xface;
        final int a=12; //user cannot change the value once it is final
        int b=6;
        boolean c = a > b;
        System.out.println(c);
        System.out.println(octal);
        System.out.println(hexadecimal);
        System.out.println(binary);

    }
}
