/*
class Continue{
    public static void main(String[] args)
    {
        String name = new String("Navin");
        name = name + " Java";

        System.out.println(name);

        String sb
    }
}
 */
class Sim
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Sim obj)
    {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}
public class Mobile{
    public static void main(String[] args) {
        Sim obj1 = new Sim();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Sim.name = "Smartphone";

        Sim obj2 = new Sim();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Sim.name = "Smartphone";

        obj1.show();
        obj2.show();

        Sim.show1(obj1);
    }
}