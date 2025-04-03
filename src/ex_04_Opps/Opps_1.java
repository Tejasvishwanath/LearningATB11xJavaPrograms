package ex_04_Opps;

public class Opps_1 {
    public static void main(String[] args) {
        Person tejas = new Person();
        tejas.name="Tejas";
        System.out.println(tejas.name);
        tejas.greet(tejas.name);
        int amount=tejas.remain_salary(10000,2500);
        System.out.println("Remaining amount is "+ amount);

        System.out.println("----------------------------------");

        Person naruto = new Person();
        naruto.name="Naruto";
        System.out.println(naruto.name);
        naruto.greet(naruto.name);
        int amount1=naruto.remain_salary(11000,500);
        System.out.println("Remaining amount is "+ amount1);
        tejas.walk();


    }

}

class Person
{
    String name;
    String color;
    String place;
    String DOB;
    byte age;
    int salary;
    String phone_no;
    int legs;
    int hands;

    void walk()
    {
        System.out.println("He will be able to walk");
    }
    int remain_salary(int salary,int tax)
    {
        return salary-tax;
    }
    void greet(String name)
    {
        System.out.println("Hello " + name);
    }
    Person()
    {

    }
}
