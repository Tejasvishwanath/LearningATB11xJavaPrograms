package ex_04_Opps;

public class Inner_class {
    public static void main(String[] args) {

        A obj = new B();
        obj.show(); //Method override

        A obj1 = new B()
        {
            public void show ()
            {
                System.out.println("In the new show");
            }

        };          // This is called Inner class
        obj1.show();


    }
}
class B extends A
{
    public void show ()
    {
        System.out.println("in the B show");
    }
}
class A
{
    public void show()
    {
        System.out.println("In the A show");
    }
}
