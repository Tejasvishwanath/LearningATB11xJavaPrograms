package ex_06_Collections;

import java.util.*;

import static java.util.Collection.*;

public class Comparator_example {
    public static void main(String[] args) {

        Students s1 = new Students("user1",004,"user1@test.com");
        Students s2 = new Students("user2",002,"user2@test.com");
        Students s3 = new Students("user1",001,"user1@test.com");
        Students s4 = new Students("user3",003,"user3@test.com");

        List<Students> arrange = new ArrayList<>();
        arrange.add(s1);
        arrange.add(s2);
        arrange.add(s3);
        arrange.add(s4);

        arrange.sort(new Roll_numbers());
        System.out.println(arrange);

        for (Object e:arrange)
        {
            System.out.println(e);
        }
        //  System.out.println(arrange);
        List<Integer> c = new ArrayList<>();
        c.add(52);
        c.add(54);
        c.add(25);
        c.add(201);

        Collections.sort(c);
        System.out.println(c);





    }
}
class Roll_numbers implements Comparator<Students>
{
    @Override
    public int compare(Students o1, Students o2) {
        return o1.roll_no-o2.roll_no;
    }
}

class Students
{
    private  String name;
    int roll_no;
    private  String emial_id;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", emial_id='" + emial_id + '\'' +
                '}';
    }

    Students(String name, int roll_no, String email_id)
    {
        this.name=name;
        this.emial_id=email_id;
        this.roll_no=roll_no;
    }



}