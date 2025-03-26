package ex_Tasks;

public class Palindrome {
    public static void main(String[] args) {
        int n=101;
        int original=n;
        int reverse_n=0;
        while (n>0)
        {
            int lastdigit=n%10;
             reverse_n=reverse_n*10+lastdigit;
             n=n/10;
        }
        System.out.println("Print the reverse num:"+reverse_n);
        if (original==reverse_n)
        {
            System.out.println("Entered number is palindrome:"+original+" && "+reverse_n);
        }
        else
        {
            System.out.println("Entered number is not palindrome:"+original+"&& "+reverse_n);
        }

        
    }



}
