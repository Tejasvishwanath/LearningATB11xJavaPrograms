package ex_04_Opps;

public class Encapsulation {
    public static void main(String[] args) {
        Bank tejas = new Bank();
     //   tejas.Name="Tejas";  // now we can't set the name as it is private
      //  System.out.println(tejas.Name);
        tejas.setName("Tejas");
        System.out.println(tejas.getName());
        tejas.setEmial_id("test@gmail.com");
        System.out.println(tejas.getEmial_id());
        tejas.setBal(150000,false);
        System.out.println(tejas.getBal());
    }

}
class Bank
{
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmial_id() {
        return emial_id;
    }

    public void setEmial_id(String emial_id) {
        this.emial_id = emial_id;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal,boolean admin) {
        if (admin) {
            this.bal = bal;
        }
        else
        {
            System.out.println("Not a admin to set balance");
        }
    }

    private String Name;
    private String emial_id;
    private int bal;
}
