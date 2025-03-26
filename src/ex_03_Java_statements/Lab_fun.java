package ex_03_Java_statements;

public class Lab_fun {
    public static void main(String[] args) {
        int a=10;
        //a+12;
        System.out.println(a);
        String b="tejas";
        b=b.toUpperCase(); // b.toUppercase() will not print in uppercase until assigned to the variable
        System.out.println(b);

        String c="test";
        String d=new String ("test");
        System.out.println(c==d);
    }
}
