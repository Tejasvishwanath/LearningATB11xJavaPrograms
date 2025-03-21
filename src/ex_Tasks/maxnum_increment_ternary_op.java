package ex_Tasks;

public class maxnum_increment_ternary_op {
    public static void main(String[] args) {
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);

        int max;
        max=(a>b)?a:b;
        System.out.println("Max number is:"+max);
    }
}
