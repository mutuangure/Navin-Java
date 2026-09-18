/*
class Calculator
{
    public int add(int n1,int n2)
    {
        int r = n1 + n2;
        return r;
    }
}

public class Object{
    public static void main(String[] args)
    {
        int num1 = 5;
        int num2 = 10;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);

        System.out.println(result);
    }
}

class Methods
{
    public void playMusic()
    {
        System.out.println("MusicPlaying");
    }

    public String needAPen(int cost)
    {
        if (cost >=5)
            return "Pen";
        else
            return "Nothing";
    }

    public static void main(String[] args)
    {
        Methods obj = new Methods();
        obj.playMusic();
        String pen = obj.needAPen(4);

        System.out.println(pen);
    }
}
*/
//ARRAY OF STUDENTS
class Students
{
    int id_num;
    String name;
    int marks;
}

public class Object{
    public static void main(String[] args)
    {
        Students s1 = new Students();
        s1.id_num = 1;
        s1.name = "Navin";
        s1.marks = 88;

        Students s2 = new Students();
        s2.id_num = 2;
        s2.name = "Kevin";
        s2.marks = 79;

        Students s3 = new Students();
        s3.id_num = 3;
        s3.name = "Johnson";
        s3.marks = 66;

        System.out.println(s1.name + " :" + s1.marks);

        Students[] students = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int a=0;a<students.length;a++)
        {
            System.out.println(students[a].name + " ... " + students[a].marks);
        }
        //Enhanced for loop
        for (Students student : students) {
            System.out.println(student.name + " : " + student.marks);
        }

    }
}