/*
//ANNOTATION IN JAVA.
// (It is a supplement to the compiler/run time).
//This includes @Override help identify the problem before run time


//INTERFACE IN JAVA (Function interface(SAM)).
@FunctionalInterface
interface Function
{
    void inter();
}

public class Lesson7
{
    static void main(String[] args)
    {
        Function fun = new Function()
        {
            public void inter()
            {
                System.out.println("Functional Interface");
            }
        };
        fun.inter();
    }
}
//LAMBDA EXPRESSION IN JAVA (only works with functional interface)
//Lambda expression is simplifying the code in the interface
@FunctionalInterface
interface Function
{
    void inter();
}

public class Lesson7
{
    static void main(String[] args)
    {
        Function fun = () -> //THe arrow is a lambda
                System.out.println("Simplified Functional Interface");
        fun.inter();
    }
}

//Lambda expression with a methods that returns a value
@FunctionalInterface
interface Nums
{
    int add(int i, int j);
}

//public class Lesson7
//{
//    static void main(String[] args)
//    {
//        Nums sum = new Nums() {
//            public int add(int i, int j)
//            {
//                return i + j;
//            }
//        };
//        int result = sum.add(5,4);
//        System.out.println("Anonymous Inner class : " + result);
//    }
//}

//Simplified using Lambda expression
public class Lesson7
{
    static void main(String[] args)
    {
        Nums sum =(i, j) -> i + j; //Lambda Expression

        int result = sum.add(5,4);
        System.out.println("Simplified using Lamnda Expression : " + result);
    }
}




//EXCEPTIONS IN JAVA (Exceptions are run time errors)

//Exception handling.
public class Lesson7
{
    static void main(String[] args)
    {
        int m = 0;
        int n = 0;

        try
        {
            n = 18/m;
        }
        catch(Exception e) //catch block only executed in case of an exception
        {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(n);
        System.out.println("Program executed");
    }
}

//Multiple catch in java (Exception).
public class Lesson7
{
    static void main(String[] args)
    {
        int m = 2;
        int n = 0;

        int[] nums = new int[5];
        String str = null;

        try
        {
            n = 18/m;

            //System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by the int n " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Out of bounds in array");
        }
        catch (Exception e) //Exception is a parent class thus it should be last
        //Exception can handle everything
        {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(n);
        System.out.println("Program executed");
    }
}
//Throw keyword in Java (Exception).
public class Lesson7
{
    static void main(String[] args)
    {
        int m = 20;
        int n = 0;

        try
        {
            n = 18/m;
            if (n==0)
                throw new ArithmeticException("i don't want to print zero");
        }
        catch(ArithmeticException e) //Handle the error
        {
            n = 18/1;
            System.out.println("That the default output" + e);

        }
        catch(Exception e) //catch block only executed in case of an exception
        {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(n);
        System.out.println("Program executed");
    }
}
*/
//Custom Exception & Ducking Exception->(throws ClassNotFoundException).
class NavinException extends Exception
{
    public NavinException(String string)
    {
        super(string);
    }
}
public class Lesson7
{
    static void main(String[] args)
    {
        int m = 20;
        int n = 0;

        try
        {
            n = 18/m;
            if (n==0)
                throw new NavinException("I don't want to print zero");
        }
        catch(ArithmeticException e) //Handle the error
        {
            n = 18/1;
            System.out.println("That the default output" + e);

        }
        catch(Exception e) //catch block only executed in case of an exception
        {
            System.out.println("Something went wrong " + e);
        }

        System.out.println(n);
        System.out.println("Program executed");
    }
}