package ex_02_Java_part2;

public class Lab005_Ternary_Operator {
    public static void main(String[] args) {
        int a=16,b=55,c=45;
        int d= (a>b) ? a:(b>c)? b:c;
        System.out.println("Max number is "+ d);
        //here we didn't compare a with c initially so the output is 16, which is wrong

        int e= (a>b) ? (a>c ? a:c) : (b> c ? b:c);
        System.out.println("Max number is "+ e);



    }
}
