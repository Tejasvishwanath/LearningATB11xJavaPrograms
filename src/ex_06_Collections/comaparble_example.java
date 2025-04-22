package ex_06_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collection.*;

public class comaparble_example {
    public static void main(String[] args) {

        Student s1 = new Student("user1",004,"user1@test.com");
        Student s2 = new Student("user2",002,"user2@test.com");
        Student s3 = new Student("user1",001,"user1@test.com");
        Student s4 = new Student("user3",003,"user3@test.com");

        List<Student> arrange = new ArrayList<>();
        arrange.add(s1);
        arrange.add(s2);
        arrange.add(s3);
        arrange.add(s4);

        Collections.sort(arrange);
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

class Student implements Comparable<Student>
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

    Student(String name, int roll_no, String email_id)
    {
        this.name=name;
        this.emial_id=email_id;
        this.roll_no=roll_no;
    }


    @Override
    public int compareTo(Student o) {
        return this.roll_no-o.roll_no;
    }
}