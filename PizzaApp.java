//The user selects a pizza order from the list, and the app displays the price.
// The customer can select a sandwich size of small ($5), medium ($10), large ($15),
// or super ($20) and one of a variety of toppings. There is a $0.50 additional charge
// for toppings; if the user requests two toppings, the additional cost is $1.
// There is also a deal in which if a user requests three toppings, the additional
// cost should be $1.25, not $1.50. Max toppings is 3 and there is no additional charge for extra cheese.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaApp extends JFrame implements ActionListener
{   // initialize all variables and buttons
    int FRAME_WIDTH = 300;
    int FRAME_HEIGHT = 160;
    static float price;
    static String order;
    JButton szSmall;
    JButton szMedium;
    JButton szLarge;
    JButton szSuper;
    JButton next;

    //set and get methods so the toppingwindow class can access price and order
    public static String getOrder(){
        return order;
    }
    public static float getPrice(){
        return price;
    }
    public PizzaApp() //constructor for size window
    {
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel heading = new JLabel("Which size would you like?");
        heading.setFont(new Font("Serif", Font.BOLD,20));

        szSmall = new JButton("Small ($5)");
        szMedium = new JButton("Medium ($10)");
        szLarge = new JButton ("Large ($15)");
        szSuper= new JButton ("Super ($20)");
        next = new JButton ("NEXT");
        next.setFont(new Font("Serif", Font.ITALIC,15));

        szSmall.addActionListener(this);
        szMedium.addActionListener(this);
        szLarge.addActionListener(this);
        szSuper.addActionListener(this);
        next.addActionListener(this);

        setLayout(new FlowLayout());
        add(heading);
        add(szSmall);
        add(szMedium);
        add(szLarge);
        add(szSuper);
        add(next);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // price and order will record the latest size button pressed
        JButton size = (JButton) e.getSource();
        if(size == szSmall) {
            price = 5;
            order = "Small";
        }
        else if (size==szMedium) {
            price = 10;
            order = "Medium";
        }
        else if (size==szLarge) {
            price = 15;
            order = "Large";
        }
        else if (size==szSuper) {
            price = 20;
            order = "Super";
        }
        else if (size==next & !(price>0) ){ //stops user from proceeding without size
            JOptionPane.showMessageDialog(null,
                    "please choose a size before hitting next.");
        }
        else { //(if next button is pressed, open topping window and close size window)
            ToppingWindow tw = new ToppingWindow();
            tw.setVisible(true);
            dispose();
        }
    }
    public static void main(String[] args) {
        PizzaApp sizewindow = new PizzaApp();
        sizewindow.setVisible(true);
    }
}
