package ex_Tasks;

public class TypeCasting_Practice {
    public static void main(String[] args) {
        char a='a';
        int b=6;
        float c=10.02f;
        double d=12.356;
        System.out.println(a+b+c+d); // here char is converted to int >> int to float >> float to double (Widening)

        // Swap of two numbers without extra variable
        int e=10;
        int f=2;
        System.out.println("Before Swapiing :"+"e is "+e+" "+"f is "+f);
        e= e+f;
        f=e-f;
        e=e-f;
        System.out.println("After Swap:"+"e is "+e+" "+"f is "+f);
    }
}
