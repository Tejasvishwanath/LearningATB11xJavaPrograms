package ex_06_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayLists_examples {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(8);
        nums.add(10);
        // In collections we can't get the index of the values, So we have to use list
        System.out.println(nums);
        for (int n:nums)
        {
            System.out.println(n);
        }
        List<String> ben = new ArrayList<String>(); // In list we can get the values based on the index also
        ben.add("Teas");
        ben.add("Test user1");
        ben.add("Test user2");
        System.out.println(ben.get(0));

    }
}
