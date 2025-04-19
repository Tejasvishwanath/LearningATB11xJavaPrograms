package ex_06_Collections;

import java.util.HashMap;
import java.util.Map;

public class Map_example {
    public static void main(String[] args) {

        Map<String,Integer> student = new HashMap<>();
        student.put("John",35);
        student.put("Marco",45);
        student.put("Walter",78);
        student.put("Joseph",88);
        student.put("white",95);

       // System.out.println(student.keySet());

        for(String s: student.keySet())
        {
            System.out.println(s+": "+student.get(s));
        }
    }
}
