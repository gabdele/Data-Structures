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
        String choice;
        System.out.println("enter guest number for dinner party:");
        int newGuestNum = sc.nextInt();
        myDinnerParty.setGuests(newGuestNum);
        System.out.println("enter 1 for spaghetti or 2 for burgers");
        int theDinner = sc.nextInt();
        myDinnerParty.setDinnerChoice(theDinner);
        if (myDinnerParty.getDinnerChoice() == 1){
            choice = "Spaghetti";
        }
        else {choice = "burgers";}
        JOptionPane.showMessageDialog(null,
                myDinnerParty.getGuests() +" "+"guests! \n"+
                        "we will be eating "+choice);
        myDinnerParty.DisplayInvitation();
    }
}

