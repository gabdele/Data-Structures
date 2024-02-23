import com.sun.source.tree.WhileLoopTree;

import java.sql.SQLOutput;
import java.util.Scanner;
public class ArrayLab {
    static short counter = 0;
    static String listPrinter;

    public static void main(String[] args) {
        short limit;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many values would you like to enter?");
        short enteredL = sc.nextShort();
        if (enteredL <=20){
            limit = enteredL;
        }
        else {
            System.out.println("please enter a value below 20.");
            limit = sc.nextShort();
        }
        double[] Values = new double[limit];

        while (counter < limit){
            System.out.println("enter a double");
            double entered = sc.nextDouble();
            Values[counter]=entered;
            counter +=1;
        }

        System.out.println("values entered:");
        for (int index = 0; index < limit; index++){
            System.out.println(Values[index]+ " ");
        }



    }
}
