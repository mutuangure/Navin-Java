package folder;

class Launch{

    //protected in class A1 work in the same package subclass, same package non-subclass and different package subclass
    //protected does not work in different package non_subclass
    public void abc()
    {
        A1 obj = new A1();
        System.out.println(obj.marks);


    }
}

public class A1 extends A2
{
    protected int marks = 6;

    public void show()
    {
        System.out.println("Folder File A1");
    }
}