package ex_04_Opps;

public class Pets {
    public static void main(String[] args) {

        Dog a= new Dog();
        a.breed="Husky";
        a.color="black and white";
        System.out.println(a.breed);
        a.run();
        System.out.println("--------------------");
        Cat b = new Cat();
        b.breed="Persian";
        b.color="Pure white";
        System.out.println(b.breed);
        b.jump();
        b.run();

    }
}
class Dog
{
  String breed;
  String color;
  byte height;

  void bark()
  {
      System.out.println("Dog will bark");
  }
  void run()
  {
      System.out.println("Dogs will run");
  }
}
class Cat
{
    String breed;
    String color;
    byte height;

    void pur()
    {
        System.out.println("It will purr");
    }
    void jump()
    {
        System.out.println("It will like to jump");
    }
    void run()
    {
        System.out.println("It will not run too much");
    }

}