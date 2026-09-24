/*
class A {

    //Calls the default constructor
    //Every constrictor contains super()
    //To call the parameterized constructor you include super(n)
    public A() //default constructor
    {
        super();
        System.out.println("In A");
    }
    public A(int n) // parameterized constructor
    {
        super();
        System.out.println("In A int");
    }
}
class B extends A
{
    public B()
    {
        super(5);
        System.out.println("In B");
    }
    public B(int n)
    {
        super(n);
        System.out.println("In B int");
    }
}

    //This {this()} method executes the constructor of the same class
    public A() //default constructor
    {
        System.out.println("In A");
    }
    public A(int n) // parameterized constructor
    {
        super();
        System.out.println("In A int");
    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("In B");
    }
    public B(int n)
    {
        this();
        System.out.println("In B int");
    }
}
public class Super5
{
    static void main(String[] args) {
        B obj = new B(5);
    }
}

import folder.FileA;
import folder.FileC;
import folder.A1;

public class Super5
{
    static void main() {
        FileA file = new FileA();
        int fileB = file.add(5, 2);

        FileC show = new FileC();

        A1 mark = new A1();
        //System.out.println(mark.marks); //cannot call 'marks' has protected access in 'folder.A1'
        mark.show();
        mark.show1();

        System.out.println(fileB);

        Computer device = new Computer();
        device.fact();

        device = new Laptop();
        //(OR) Computer device = new Laptop();
        //(ERROR) Laptop device = new Computer(); //Computer cannot be converted to Laptop
        device.fact();
    }
}

//POLYMORPHISM  &  FINAL KEYWORD in java.
class Computer  //{final class Computer;} (final) prevents your class from being extended.
{
    public void fact()
    {
        System.out.println("A laptop can act as a computer");
    }
}
class Laptop extends Computer
{
    public void fact() {
        System.out.println("A computer cannot act as a laptop");
    }
}

public class Super5
{
    static void main() {
        Computer device = new Computer();
        device.fact();

        device = new Laptop();
        //(OR) Computer device = new Laptop();
        //(ERROR) Laptop device = new Computer(); //Computer cannot be converted to Laptop
        device.fact();
    }
}

//OBJECT CLASS equals & toString.
class Laptop
{
    String model;
    int price;

    public String toString()
    {
        return model + " : " + price;
    }
    public boolean equals(Laptop that)
    {
        if (this.model.equals(that.model) && this.price == that.price)
            return true;
        else
            return false;
        //(SIMPLIFY)return this.model.equals(that.model) && this.price == that.price;
    }
}

public class Super5
{
    static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 35000;

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 35000;

        System.out.println(obj);

        boolean result = obj.equals(obj1);

        System.out.println(result);
    }
}
*/

//DOWN_CASTING AND UPCASTING.
//Typecasting is converting a value from one variable to another double to int
class A
{
    public void castingA()
    {
        System.out.println("Casting in A");
    }
}
class B extends A
{
    public void castingB()
    {
        System.out.println("Casting in B");
    }
}

public class Super5
{
    static void main(String[] args) {
        A cast = (A) new B(); //Upcasting for typecasting
        cast.castingA();

        B cast1 = (B) cast; //Downcasting for typecasting
        cast1.castingB();

    }
}
