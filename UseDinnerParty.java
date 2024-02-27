import javax.swing.*;
import java.util.Scanner;

public class UseDinnerParty {
    public static void main(String[] args) {

        //using Party
        Party myParty = new Party();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter guest number:");
        int guestNum = sc.nextInt();
        myParty.setGuests(guestNum);
        JOptionPane.showMessageDialog(null, //GUI
                myParty.getGuests() +" "+"guests");
        myParty.DisplayInvitation();

        //using DinnerParty
        DinnerParty myDinnerParty = new DinnerParty();
        String choice;
        System.out.println("enter guest number for dinner party:");
        int newGuestNum = sc.nextInt();
        myDinnerParty.setGuests(newGuestNum);
        System.out.println("enter 1 for spaghetti or 2 for burgers");
        int theDinner = sc.nextInt();
        myDinnerParty.setDinnerChoice(theDinner);
        if (myDinnerParty.getDinnerChoice() == 1){
            choice = "spaghetti";
        }
        else {choice = "burgers";}
        JOptionPane.showMessageDialog(null,  //note: for some reason these dialogs
                myDinnerParty.getGuests() +" "+"guests! \n"+ //show up behind the IDEA window
                        "we will be eating "+choice);
        myDinnerParty.DisplayInvitation();
    }
}

