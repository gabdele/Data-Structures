import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToppingWindow extends JFrame implements ActionListener {
    //initializing variables and boxes
    JLabel heading;
    JCheckBox pepperoni;
    JCheckBox sausage;
    JCheckBox mushrooms;
    JCheckBox tomatoes;
    JCheckBox peppers;
    JCheckBox bacon;
    JCheckBox olives;
    JCheckBox excheese; //free! but add to order
    JButton next;
    String theorder = PizzaApp.getOrder(); //retrieve order and price from previous window
    float theprice = PizzaApp.getPrice();
    int counter = 0;

    public ToppingWindow() { //create and initialize topping window
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        heading = new JLabel("  Select toppings (up to 3)");
        heading.setFont(new Font("Serif", Font.BOLD, 25));
        pepperoni = new JCheckBox("Pepperoni");
        sausage = new JCheckBox("Sausage");
        mushrooms = new JCheckBox("Mushrooms");
        tomatoes = new JCheckBox("Tomatoes");
        peppers = new JCheckBox("Peppers");
        bacon = new JCheckBox("Bacon");
        olives = new JCheckBox("Olives");
        excheese = new JCheckBox("Extra Cheese");
        next = new JButton("NEXT");
        next.setFont(new Font("Serif", Font.ITALIC,15));

        next.addActionListener(this);

        setLayout(new GridLayout(10, 1, 10, 0));
        add(heading);
        add(pepperoni);
        add(sausage);
        add(mushrooms);
        add(tomatoes);
        add(peppers);
        add(bacon);
        add(olives);
        add(excheese);
        add(next);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //since the only action listener is on the next button, the source does not need to be found.
        //the next button tells the program to read the checkboxes.
        if (pepperoni.isSelected()) {
            counter += 1;
            theorder += " Pepperoni";
        }
        if (sausage.isSelected()) {
            counter += 1;
            theorder += " Sausage";
        }
        if (mushrooms.isSelected()) {
            counter += 1;
            theorder += " Mushroom";
        }
        if (tomatoes.isSelected()) {
            counter += 1;
            theorder += " Tomato";
        }
        if (peppers.isSelected()) {
            counter += 1;
            theorder += " Peppers";
        }
        if (bacon.isSelected()) {
            counter += 1;
            theorder += " Bacon";
        }
        if (olives.isSelected()) {
            counter += 1;
            theorder += " Olive";
        }
        if (excheese.isSelected()) {
            counter += 1;
            theorder += " with Extra Cheese";
        }


        if (counter > 3) { //keeps from selecting too many toppings
            JOptionPane.showMessageDialog(null,
                    "try again! only 3 toppings allowed");
            ToppingWindow tw = new ToppingWindow();
            tw.setVisible(true); //remakes topping window to undo the additions to the order
            dispose();
        }
        else { //adds topping prices
            if (counter == 3) {
                if (!excheese.isSelected()) {
                    theprice += (float) 1.25;
                }
                else {
                    theprice += (float) 1.0;
                }
            }
            else if (counter == 2) {
                if (!excheese.isSelected()) {
                    theprice += (float) 1.0;
                }
                else {
                    theprice += (float) .5;
                }
            }
            else if (counter == 1) {
                if (!excheese.isSelected()) {
                    theprice += (float) .5;
                }
            }
            else { //if no toppings were selected
                theorder += " Cheese";
            }
            theorder += " Pizza";
            //shows user pizza and price
            JOptionPane.showMessageDialog(null,
                    "Your order: "+theorder+"\nYour price: $"+theprice);
            dispose();
        }
    }
}