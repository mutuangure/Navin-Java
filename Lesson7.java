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
*/
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



