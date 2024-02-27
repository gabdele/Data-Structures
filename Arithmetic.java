import java.util.InputMismatchException;
import java.util.Scanner;
public class Arithmetic { //catch if someone tries to put in a string or 0
    public static void main(String[] args) {
        double entered = -1;
        Scanner sc = new Scanner(System.in);
        do{
            try{
                System.out.println("please enter a number to find the root:");
                entered = sc.nextDouble();
                System.out.println("the square root of "+entered+" is "+ Math.sqrt(entered));
            }
            catch(Exception e){
                System.out.println("please enter a NUMBER.");
                sc.nextLine();
            }
//            catch(ArithmeticException f){
//                System.out.println(f.getMessage());
            //}
        }while(entered < 0);
    }
}

//NumberFormatException