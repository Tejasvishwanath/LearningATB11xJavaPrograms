package ex_02_Java_part2;

public class Lab003_Assignment {
    public static void main(String[] args) {
        int a=10,b=10,c=10;
        int d=a*a+b*b-Math.abs(c);
        double result =Math.cbrt(d);
        System.out.println(result);
        /*double x=10,y=10,z=10;
        System.out.println(Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z)));
         */
    }
}
