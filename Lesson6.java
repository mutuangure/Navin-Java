/*
//ABSTRACT CLASS/KEYWORD IN JAVA
abstract class Car (//Abstract class)
{
    public abstract void drive();

    public void playMusic()
    {
        System.out.println("Play music");
    }
}

class Wagon extends Car //Concrete class
{
    public void drive() {
        System.out.println("Put in drive");
    }
}

public class Lesson6
{
    static void main(String[] args)
    {
        Car obj =  new Wagon(); //You cannot create obj of an abstract class
        obj.drive();
        obj.playMusic();
    }
}

//INNER CLASS IN JAVA (A class inside a class)
class A
{
    public void show()
    {
        System.out.println("In show");
    }
    class B
    //static class B (Static class only works in the inner class)
    {
        public void config()
        {
            System.out.println("In config");
        }
    }
}
public class Lesson6
{
    static void main(String[] args)
    {
        A method = new A();
        method.show();

        A.B method1 = method.new B();
    //A.B method1 = new A.B();    //Can only work with a static class
        method1.config();
    }
}

//ANONYMOUS INNER CLASS.
class C
{
    public void display()
    {
        System.out.println("Display of class C");
    }
}

public class Lesson6
{
    static void main(String[] args)
    {
        C dis = new C()
        {
            public void display()
            {
                System.out.println("Displaying of class C in new inner class");
            }
        };
        dis.display();
    }
}

//ABSTRACT & ANONYMOUS Inner Class.
abstract class D
{
    public abstract void combine();
    public abstract void multiple();
}

public class Lesson6
{
    static void main(String[] args)
    {
        D both = new D()
        {
            public void combine()
            {
                System.out.println("Using both abstract and anonymous inner class");
            }
            public void multiple()
            {
                System.out.println("Can be used for multiple methods");
            }
        };
        both.combine();
    }
}



//INTERFACE IN JAVA

//  class -> class = extends
//  interface -> class = implements
//  interface -> interface = extends

interface T  //(Interface not a class but every method is public & abstract)
{   String area = "Kenya";
    int code = 123; //Variables in interface are final & static

    void revel();
}
interface V extends T
{
    void run();
}
class S  implements V //Defined method in class from interface is a must
{
    public void revel()
    {
        System.out.println("Interface in java");
    }
    public void run() //Class implementing multiple interface
    {
        System.out.println("Multiple interfaces");
    }
}

public class Lesson6
{
    static void main(String[] args) {
        V use = new S();
        use.revel();
        use.run();

        System.out.println(T.area + " : " + T.code);
    }
}

//NEED for Interface

interface Computer
{
    void code();
}
//  abstract class Computer
//  {
//      public abstract void code()
//      {
//      }
//  }

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Receive a desktop");
    }
}
class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Get a laptop");
    }
}
class Developer
{
    public void devOps(Computer device )
    {
        device.code();
    }
}

public class Lesson6
{
    static void main(String[] args)
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer navin = new Developer();
        navin.devOps(lap);
    }
}



//ENUMS (Enumerations) IN JAVA.  ->These are named constant
enum Status
{
    Debugging, Running, Pending, Successful;
}

public class Lesson6
{
    static void main(String[] args)
    {
        System.out.println(Status.Successful);//You can return the status directly
        //OR
        Status Y = Status.Running;
        System.out.println(Y);

        Status[] ss = Status.values();
        System.out.println(ss[1]);

        //Print all enum
        for(Status y : ss)
        {
            System.out.println(y + " : " + y.ordinal());
        }

        //IF else & Switch
        if (Y == Status.Debugging)
            System.out.println("Start running the code");
        else if (Y == Status.Running)
            System.out.println("Analyzing the code");
        else if (Y == Status.Pending)
            System.out.println("Please wait");
        else
            System.out.println("All good");
        //Switch.
        switch (Y)
        {
            case Debugging:
                System.out.println("Start running the code");
                break;
            case Running:
                System.out.println("Analyzing the code");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:  //(OR) case Successful:
                System.out.println("All good");
                break;
        }
    }
}
*/

enum Phones
{
    Iphone(1500), Samsung(1600), Xiaomi(1100), Oppo;

    private int price;

    private Phones()
    {
        price = 750;
    }

    private Phones(int price) {
        this.price = price;
        System.out.println("In the phone " + this.name());
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

public class Lesson6
{
    static void main()
    {
        //Phones sim = Phones.Samsung;
        //System.out.println(sim + " : " + sim.getPrice());

        //Get all phones
        for(Phones sim : Phones.values())
        {
            System.out.println(sim + " : " + sim.getPrice());
        }
    }
}
