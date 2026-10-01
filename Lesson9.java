import java.lang.Object;
import java.util.*;

/*
//COLLECTION IN JAVA.
//Collection API -> Concept (List, Set, Queue, Map(Does not extent collection API but is part))
//Collection -> Interface
//Collections ->Class

//Collection Interface & list

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lesson9
{
    public static void main(String[] args)
    {
        //collection adds values and fetch
        Collection<Integer> values = new ArrayList<Integer>();
        //ArrayList is a class that implements a List
        values.add(6);
        values.add(5);
        values.add(8);
        values.add(2);


        for (int c : values)
        {
            System.out.println(+ c);
        }

        //list works/suppots index values
        List<Integer> digits = new ArrayList<Integer>();
        digits.add(12);
        digits.add(10);
        digits.add(16);
        digits.add(4);

        System.out.println("List " + digits.get(2));
    }
}

import java.util.HashSet;
import java.util.Set;

//Set in java.
public class Lesson9
{
    public static void main(String[] args)
    {
        //Set a collection contains no duplicate values or index values.
        Set<Integer> set = new HashSet<Integer>();
        //Set<Integer> set = new HashSet<Integer>(); //Sorted values
        set.add(12);
        set.add(10);
        set.add(16);
        set.add(4);
        set.add(16);

        for (int s : set)
        {
            System.out.println(s);
        }
    }
}

import java.util.HashMap;
import java.util.Map;

//Map in Java. ///Map(Interface) is a collection of Keys & value
public class Lesson9
{
    public static void main(String[] args)
    {
        Map<String, Integer> students = new HashMap<>();

        students.put("Navin", 56);
        students.put("Harsh", 23);
        students.put("Sushil", 67);
        students.put("Kiran", 92);

        System.out.println(students);
        System.out.println(students.get("Harsh"));
        System.out.println(students.keySet());
        //To print all keys

        for (String key : students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
        }
    }
}

//Comparator vs Comparable in java.
public class Lesson9
{
    public static void main(String[] args)
    {
        Comparator<Integer> com =new Comparator<Integer>()
                //Comparator is an interface used for specifying list for sorting.
        {
            public int compare(Integer i,Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> comp = new ArrayList<Integer>();
        comp.add(34);
        comp.add(50);
        comp.add(16);
        comp.add(88);

        Collections.sort(comp, com);

        System.out.println(comp);
    }

}

class Student
{
    int age;
    String name;

    public Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    public String toString()
    {
        return "Student [" + "age= " + age + ", name= " + name + "]";
    }
}
public class Lesson9
{
    public static void main(String[] args)

    {
        Comparator<Student> com =new Comparator<Student>()
                //Comparator is an interface used for specifying list for sorting.
        {
            public int compare(Student x, Student y)
            {
                if(x.age > y.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(21, "Navin"));
        stud.add(new Student(36, "James"));
        stud.add(new Student(28, "Faith"));
        stud.add(new Student(23, "Kamau"));
        stud.add(new Student(18, "Jane"));

        stud.sort(com);
        //OR Collections.sort(stud, com);

        for(Student t : stud)
            System.out.println(t);

    }
}
*/
//Comparable simplify
class Student
{
    int age;
    String name;

    public Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    public String toString()
    {
        return "Student [" + "age= " + age + ", name= " + name + "]";
    }
}
public class Lesson9
{
    public static void main(String[] args)

    {
        Comparator<Student> com =(Student x, Student y) -> x.age > y.age?1:-1;
//           OR {
//                if(x.age > y.age)
//                    return 1;
//                else
//                    return -1;
//
//            };

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(21, "Navin"));
        stud.add(new Student(36, "James"));
        stud.add(new Student(28, "Faith"));
        stud.add(new Student(23, "Kamau"));
        stud.add(new Student(18, "Jane"));

        stud.sort(com);

        for(Student t : stud)
            System.out.println(t);

    }
    }
//Need of stream API in java.


//ForEach method in java.


//Stream API in java.


//Map Filter Reduces Sorted in java.