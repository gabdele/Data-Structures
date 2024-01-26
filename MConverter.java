import java.util.Scanner;
public class MConverter {
    public static void main(String[] args) {
        double price;
        int cents;
        int quarters;
        int dimes;
        int nickels;

// input and initialize price and total cents

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price");
        price = sc.nextDouble();

        cents = (int)(price*100);
        System.out.println("your price is " + price);

// math
        quarters = cents / 25;
        cents %= 25;
        dimes = cents / 10;
        cents %= 10;
        nickels = cents / 5;

// printing!
        System.out.println("Quarters: " + quarters + "\n" + "Dimes: " + dimes + "\n" +
                "Nickels: " + nickels);

// creativity! here is your change

        Scanner sca = new Scanner(System.in);
        System.out.println("enter what was paid");
        float paid = sca.nextFloat();
        float change = (paid - (float)price);
        cents = Math.round(change * 100); //eliminated rounding issue!
        change = ((float)cents)/100;

        quarters = cents / 25;
        cents %= 25;
        dimes = cents / 10;
        cents %= 10;
        nickels = cents / 5;

        System.out.println("your change is " + change);
        System.out.println("Quarters: " + quarters + "\n" + "Dimes: " + dimes + "\n" +
                "Nickels: " + nickels);

    }
}
