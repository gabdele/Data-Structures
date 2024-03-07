import java.util.Scanner;

public class DemoPizza {
    static short toppingCounter = 0;
    static String[] toppings = new String[10];
    static Boolean delivery;
    static Pizza x;

    public static void main(String[] args) {

        //entering toppings loop
        Scanner sc = new Scanner(System.in);
        while(toppingCounter<10){
        System.out.println("(enter any number to stop) Please enter topping:");
        String adding = sc.next();
        try{
                Double.parseDouble(adding);
                break;
            }catch(NumberFormatException e){
            toppings[toppingCounter]=adding;
            }
        toppingCounter ++;
        }
        //determine delivery
        System.out.println("Would you like delivery? enter true or false:");
        if(sc.nextBoolean()){
            //create DeliveryPizza object
            System.out.println("please enter delivery address:");
            x = new DeliveryPizza(toppings,sc.next(),toppingCounter);

        }
        else{
            //create Pizza Object
            x = new Pizza(toppings,toppingCounter);
        }
        x.toTheString();
        }
    }
