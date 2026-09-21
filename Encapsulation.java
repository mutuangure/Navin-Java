/*
class People_value
{
    String name = "Navin";
    int age = 24;
}

public class Encapsulation
{
    public static void main() {
        People_value obj = new People_value();

        System.out.println(obj.name + " : " + obj.age);
    }
}

class People_get
{
    private String name = "Navin";
    private int age = 24;

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class Encapsulation
{
    public static void main() {
        People_get obj = new People_get();

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
*/

class People_get
{
    private String name;
    private int age;


    public String getName()
    {
        return name;
    }
    public void setName(String a)
    {
        name = a;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int b)
    {
        age = b;
    }
}
public class Encapsulation
{
    public static void main() {
        People_get obj = new People_get();
        obj.setName("Java");
        obj.setAge(30);

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
