package ex_02_Java_part2;

public class Lab003_Assignment {
    public static void main(String[] args) {
        int a=10,b=10,c=10;
        int d=a*a+b*b-Math.abs(c);
        double result =Math.cbrt(d);
        System.out.println(result);
        int X = 10, Y = 10, Z = 10 ;
        int P=2;
        double Result= Math.cbrt(Math.pow(X,P)+Math.pow(Y,P)-Math.abs(Z));
        System.out.println("Result="+Result);


    }
}
