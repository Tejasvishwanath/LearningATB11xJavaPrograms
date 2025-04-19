package ex_06_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Arraylist_example2 {
    public static void main(String[] args) {

        Set<Integer> num = new HashSet<Integer>();
        num.add(23);
        num.add(58);
        num.add(83);
        num.add(93);
        num.add(23);

        System.out.println(num);
        // hashset duplicate values are not allowed and not sorted and not support index value

        Set<Integer> num1 = new TreeSet<Integer>();
        num1.add(23);
        num1.add(58);
        num1.add(83);
        num1.add(93);
        num1.add(23);

        System.out.println(num1);// In tree set values are sorted and duplicates are not allowed
    }
}
