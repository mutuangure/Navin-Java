import java.time.Duration;

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//CREATE USER INPUT
import java.io.InputStream;

public class Lesson8
{
    static void main(String[] args) throws IOException {
        System.out.println("Enter the character");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        String value = bf.readLine();
        int digits = Integer.parseInt(bf.readLine());

        System.out.println(value + " : " + digits);

        bf.close();
    }
}
//Simplified user input using Scanner
public class Lesson8
{
    static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        String name = value.nextLine();
        System.out.println(name);
    }
}
//TRY WITH RESOURCES IN JAVA (Finally)
public class Lesson8 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int entry = 0;
        BufferedReader  br = null;

        try
        {
            InputStreamReader in = new InputStreamReader(System.in);
            br = new BufferedReader(in);
            //br = new BufferedReader(new InputStreamReader(System.in));
            entry = Integer.parseInt(br.readLine());
            System.out.println(entry);
        }
        finally
        {
            br.close();
        }
    }
}
//Simplified try resources.
//try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
//        {
//        entry = Integer.parseInt(br.readLine());
//        System.out.println(entry);
//        }




//THREADS IN JAVA.
//Threads is the smallest unit one can work with is a program.
class Hi extends
{
    public void print()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Hi");
        }
    }
}
class Hello extends
{
    public void print()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Hello");
        }
    }
}
public class Lesson8
{
    static void main(String[] args)
    {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.print();
        obj2.print();
    }
}
//Multiple threads.
class Hi extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Hi");
        }
    }
}
class Hello extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Hello");
        }
    }
}
public class Lesson8
{
    static void main(String[] args)
    {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start();
        obj2.start();
    }
}

//Threads priority and sleep in java
class Hi extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Hi");
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
class Hello extends Thread {
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Hello");
            try
            {
                Thread.sleep(10);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Lesson8
{
    static void main(String[] args)
    {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        //System.out.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        try //trying to optimize the program fot Hi Hello respectively.
        {
            Thread.sleep(10);
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        obj2.start();
        }
}

//Runnable vs Threads in java
class Hi implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hi");
            try
            {
                Thread.sleep(5);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
class Hello implements Runnable
{
    public void run()
    {
        for (int i=1;i<=5;i++)
        {
            System.out.println("Hello");
            try
            {
                Thread.sleep(5);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Lesson8
{
    static void main(String[] args)
    {
        Runnable obj1 = new Hi();
        Runnable obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
//Lambda Expression
public class Lesson8
{
    static void main(String[] args) {
//        Runnable obj1 = new Runnable()
//        {
//            public void run()
//            {
//                for(int i=1;i<=5;i++)
//                {
//                    System.out.println("Hi");
//                    try
//                    {
//                        Thread.sleep(5);
//                    }
//                    catch (InterruptedException e)
//                    {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//    }

        Runnable obj1 = () ->
        {
            for (int i=1;i<=5;i++) {
                System.out.println("Hi");
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

//        Runnable obj2 = new Runnable()
//        {
//            public void run()
//            {
//                for (int i=1;i<=5;i++)
//                {
//                    System.out.println("Hello");
//                    try
//                    {
//                        Thread.sleep(5);
//                    } catch (InterruptedException e)
//                    {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        };
        Runnable obj2 = () ->
        {
            for (int i=1;i<=5;i++) {
                System.out.println("Hello");
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
*/
//Race Condition in java.

//Lambda Expression

class Counter
{
    int count;
    public synchronized void increment() //synchronized helps to call one method at a time
    {
        count++;
    }
}
public class Lesson8
{
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () ->
        {
            for(int i=1;i<=1000;i++)
            {
                c.increment();
            }
        };

        Runnable obj2 = () ->
        {
            for (int i=1;i<=1000;i++)
            {
                c.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}

//Thread States in java.