package ex_05_abstract_interface;

public class Interface2 {
    public static void main(String[] args) {
        Computer1 v = new Laptop1();
        Computer1 b = new Desktop1();
        Developer1 n = new Developer1();
        n.dev(v);
        n.dev(b);
    }
}

interface Computer1    //now we can either declare it as interface or an abstract
{
     void code();
}

class Laptop1 implements Computer1
{
    public void code()
    {
        System.out.println("Develops application in Laptop");
    }
}
class Desktop1 implements Computer1
{
    public void code()
    {
        System.out.println("Develops application in Desktop");
    }
}

class Developer1
{
    public void dev(Computer1 lap)
    {
        lap.code();
    }

}
