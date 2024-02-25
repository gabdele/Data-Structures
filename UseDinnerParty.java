import javax.swing.*;
import java.util.Scanner;

public class UseDinnerParty {
    public static void main(String[] args) {
        Party myParty = new Party();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter guest number:");
        int guestNum = sc.nextInt();
        myParty.setGuests(guestNum);
        JOptionPane.showMessageDialog(null,
                myParty.getGuests() +" "+"guests");
        myParty.DisplayInvitation();

        DinnerParty myDinnerParty = new DinnerParty();
        System.out.println("enter guest number for dinner party:");
        int newGuestNum = sc.nextInt();
        myDinnerParty.setGuests(newGuestNum);
        System.out.println("enter 1 for spaghetti and 2 for burgers");
        int theDinner = sc.nextInt();
    }
}
