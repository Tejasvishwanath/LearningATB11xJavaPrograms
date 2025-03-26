package ex_Tasks;

import java.util.Scanner;

public class vowels_consonats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scan.nextLine();
        int vowel=0;
        int consonant=0;

        for (int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            if  (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                vowel++;
            }
            else if ((ch>='a' && ch<='z' || ch>='A' && ch<='Z') &&
                    !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
            {
                consonant++;
            }

        }
        System.out.println("The number of vowels:"+vowel);
        System.out.println("The number of consonants:"+consonant);
    }
}
