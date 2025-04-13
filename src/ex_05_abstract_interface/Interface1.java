package ex_05_abstract_interface;

public class Interface1 {
    public static void main(String[] args) {
        Computer d = new Laptop();
        Computer f = new Desktop();
         Developer s = new Developer();
            s.dev(d);
            s.dev(f);
    }
}

abstract class Computer    //now we can either declare it as interface or an abstract
{
    public abstract void code();

}

class Laptop extends Computer
{
    public void code()
    {
        System.out.println("Develops application in Laptop");
    }
}
class Desktop extends Computer
{
    public void code()
    {
        System.out.println("Develops application in Desktop");
    }
}

class Developer
{
    public void dev(Computer lap)
    {
        lap.code();
    }

}
