//import calcTools.Calc;
//import calcTools.AdvCalc;
//import calcTools.VeryAdvCalc;
import calcTools.*;  //Helps import all file in the folder
//import other.calcTools.*; //Helps import all folders plus the file in the folder.

public class Inheritance{
    static void main(String[] args)
    {
        VeryAdvCalc num = new VeryAdvCalc();
        int n1 = num.add(4, 2);
        int n2 = num.sub(4, 2);
        int n3 = num.multi(4, 2);
        int n4 = num.div(4, 2); //Single level Inheritance
        double n5 = num.power(4, 2); //Multilevel Inheritance

        System.out.println(n1 + " : " + n2 + " : " + n3 + " : " + n4 + " : " + n5);
    }
}