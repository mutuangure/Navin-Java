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
*/
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
    }
}
