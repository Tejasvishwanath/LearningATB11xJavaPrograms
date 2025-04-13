package ex_04_Opps;

public class Interfaces {
    public static void main(String[] args) {

        C obj = new D();
        obj.test();
        obj.stop();

    }
}
class D extends C
{
    public void test()
    {
        System.out.println("Begin the Test");
    }
    public void stop()
    {
        System.out.println("Stop the testing");
    }
}
abstract class C
{
    public  abstract void  test();
    public abstract void stop();
}