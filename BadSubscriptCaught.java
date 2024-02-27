import java.util.Scanner;

public class BadSubscriptCaught {
    static String[] names = {"Martin","Jennifer","Jonathan", "Margaret","Steve",
            "Geraldine","Mark","Stephanie","Tim","Dorothy"};
    static short entered = 11;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            try{
                System.out.println("please enter an integer:");
                entered = sc.nextShort();
                System.out.println(names[entered-1]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("integer must be below 10");
            }
        } while(entered > 10);
    }


}
