package ex_Tasks;

import java.util.Scanner;

public class Task_Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the Triangle of one side l1");
        int l1= scan.nextInt();
        System.out.println("Enter the length of the Triangle of one side l2");
        int l2= scan.nextInt();
        System.out.println("Enter the length of the Triangle of one side l3");
        int l3= scan.nextInt();

        if (l1+l2<=l3 || l2+l3<=l1 || l3+l1<=l2)
        {
            System.out.println("It is not a trianlgle");
        }
        else if (l1<=0 || l2<=0 || l3<=0)
        {
            System.out.println("It is not a triangle");
        }
        else if (l1==l2 && l2==l3)
        {
            System.out.println("Hence all the sides length are equal it is a Equilateral Triangle");
        }
        else if (l1==l2 || l1==l3 || l3==l2)
        {

            System.out.println("Two  sides length are equal it is a isosceles Triangle");
        }
        else
        {
            System.out.println("None of the sides length are equal it is a scalene Triangle");
        }

    }
}
