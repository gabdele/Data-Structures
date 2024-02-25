import javax.swing.*;

public class Party {
    private int guests;

    public int getGuests(){
        return guests;
    }
    public void setGuests(int x){
        this.guests = x;
    }
    public void DisplayInvitation(){
        JOptionPane.showMessageDialog(null,
                "Please come to my party!");
    }
}
