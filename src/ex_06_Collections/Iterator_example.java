package ex_06_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_example {
    public static void main(String[] args) {

        List<Integer> cans = new ArrayList<>();
        cans.add(1);
        cans.add(2);
        cans.add(8);
        cans.add(2);


        Iterator<Integer> cans1 = cans.iterator();
        while(cans1.hasNext()) {
            System.out.println(cans1.next());
        }
    }
    }

