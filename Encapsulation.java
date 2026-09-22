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

//THIS KEYWORD IN JAVA
class People_get
{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
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
 */

//CONSTRUCTOR (Default vs Parameterized)
class People_get
{
    private String name;
    private int age;

    //Constructor
    public People_get() //Default Constructor
    {
        System.out.println("This is a default constructor.....  ");
        name = "Raddy";
        age = 28;
    }
    public People_get(String i, int j) //Parameterized Constructor
    {
        System.out.println("This is a parameterized constructor.....  ");
        name = i;
        age = j;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class Encapsulation
{
    public static void main() {
        People_get obj = new People_get();
        People_get obj1 = new People_get("John", 35);

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}