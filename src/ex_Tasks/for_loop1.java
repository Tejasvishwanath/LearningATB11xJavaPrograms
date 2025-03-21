package ex_Tasks;

public class for_loop1 {
    public static void main(String[] args) {
        for (int i=0;i<=100;i++)
        {
           if (i%3==0 && i%5==0)
           {
               System.out.println("FIZZ BUZZ");
           }
           else if (i%5==0)
           {
               System.out.println("BUZZ");

           }
           else if (i%3==0)
           {
               System.out.println("FIZZ");
           }
           else
           {
               System.out.println(i);
           }
        }
    }
}
