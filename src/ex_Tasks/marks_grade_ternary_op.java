package ex_Tasks;

public class marks_grade_ternary_op {
    public static void main(String[] args) {
        int a= Integer.parseInt(args[0]);
        String grade;
        grade= (a>=90 && a<=100)? "A":(a>=80&&a<=89)?"B":(a>=70&&a<=79)? "C" :"D";
        System.out.println("the Grade is:"+grade);
    }
}
