import java.util.Arrays;

class Intro {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = num1 - num2;
        System.out.println(sum);

        // Logical operator
        boolean hasGoodGrade = true;
        boolean isDisciplined = false;
        boolean hasFinances = false;

        boolean Applicant = (hasGoodGrade || isDisciplined) && hasFinances;
        System.out.println(Applicant);

        // IF ELSE STATEMENT
        int x = 5;
        int y = 7;

        if (x<y)
        {
            System.out.println(x);
            System.out.println("X is greater");
        }
        else
            System.out.println(y);

        // SWITCH STATEMENT
        int Day = 8;

        switch (Day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error:!!!....");
        }

        //LOOPS
        int i = 1;

        while(i<=4)
        {
            System.out.println("Hi " + i);
            ++i;
        }

        //NESTED WHILE LOOP
        int a = 1;

        while(a<=4)
        {
            System.out.println("Hi " + a);

            int b = 1;
            while(b<=3)
            {
                System.out.println("Hello" + b);
                ++b;
            }
            ++a;
        }
        System.out.println("Bye......." + a);

        //DO WHILE LOOP
        int z = 4;

        do
        {
            System.out.println("Yes please " + z);
            ++z;
        }
        while (z<=5);

        //FOR LOOP
        for (int c = 5; c>=0; --c)
        {
            System.out.println("Count "+ c);
        }

        //CREATION OF ARRAYS
        int[] numbs = {3,7,2,4};
        //change the value
        numbs[1] = 5;

        System.out.println(numbs[1]);

        int[] numbers = new int[4];
        numbers[0] = 4;
        numbers[1] = 8;
        numbers[2] = 3;
        numbers[3] = 9;

        for(int j=0;j<4;j++)
        //for(int j=0;j<numbers.lenght;j++)
        {
            System.out.println(numbers[j]);
        }
        //Enhanced for loop
        for(int H : numbers)
        {
            System.out.print(H);
        }

        //MULTI DIMENSIONAL ARRAY.
        int[][] digit = new int[5][3];

        System.out.println(Arrays.deepToString(digit));

        int[][] digits = new int[5][3];

        for (int k=0;k<5;k++)
        {
            for (int l=0;l<3;l++)
            {
                System.out.print(digits[k][l] + "");
            }
            System.out.println();
        }

        //FETCH RANDOM VALUES.
        int[][] figures = new int[5][3];

        for(int m=0;m<5;m++)
        {
            for (int n=0;n<3;n++)
            {
                figures[m][n] = (int)(Math.random() * 100);
            }
        }

        for(int m=0;m<5;m++)
        {
            for(int n=0;n<3;n++)
            {
                System.out.print(figures[m][n] + " ");
            }
            System.out.println();
        }

        //ENHANCED FOR LOOP replaced [m][n] with [p][q].
        for(int[] p : figures)
        {
            for(int q: p)
            {
                System.out.print(q + " " + " ");
            }
            System.out.println();
        }

        //JAGGED ARRAY [Row][Collum].
        int[][] columns = new int[3][];

        columns[0] = new int[3];
        columns[1] = new int[5];
        columns[2] = new int[2];

        for (int s=0;s<columns.length;s++)
        {
            for (int t=0;t<columns[s].length;t++)
            {
                columns[s][t] = (int)(Math.random()*10);
            }
        }

        //Enhanced for loop
        for(int[] u : columns)
        {
            System.out.println(Arrays.toString(u));
        }
        for(int[] u : columns)
        {
            for (int v : u) {
                System.out.print(v + ". ");
            }
            System.out.println();
        }
        //for(int s=0;s>=3;s++)
        //{
        //    for(int t=0;t>=2;t++)
        //    {
        //        System.out.print(columns[s][t] + " ");
        //    }
        //    System.out.println();
        //}
    }
}