import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ShoppingCart extends JFrame implements ActionListener {
    static ArrayList<ItemOrder> list = new ArrayList<ItemOrder>(1);
    JLabel heading;
    JLabel deal;
    JLabel itemPrompt;
    JLabel pricePrompt;
    JLabel qPrompt;
    JTextField itemBox;
    JTextField priceBox;
    JTextField qBox;
    JButton addIt;
    JButton next;
    public ShoppingCart() {
        setSize(600, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        heading = new JLabel("        Shopping List");
        heading.setFont(new Font("Serif", Font.BOLD, 30));
        deal = new JLabel("buy 2 of anything and get one free!");
        deal.setFont(new Font("Serif", Font.ITALIC, 20));
        itemPrompt = new JLabel("  enter item name:");
        pricePrompt = new JLabel("  enter price:");
        qPrompt = new JLabel("  enter quantity:");

        itemBox = new JTextField(8);
        priceBox = new JTextField(4);
        qBox = new JTextField(2);

        addIt = new JButton("ADD TO LIST");
        next = new JButton("FINISH");
        addIt.addActionListener(this);
        next.addActionListener(this);

        setLayout(new GridLayout(5, 2, 10, 0));
        add(heading);
        add(deal);
        add(itemPrompt);
        add(itemBox);
        add(pricePrompt);
        add(priceBox);
        add(qPrompt);
        add(qBox);
        add(addIt);
        add(next);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object pressed = e.getSource();
        if (pressed == addIt){ //store itemOrders in list
            float thePrice = Float.parseFloat(priceBox.getText());
            String theName = itemBox.getText();
            int theQ = Integer.parseInt(qBox.getText());
            ItemOrder x = new ItemOrder(new Item(theName,thePrice), theQ);
            list.add(x);
            ShoppingCart fw = new ShoppingCart();
            fw.setVisible(true);
            dispose();
        }
        else{ //return list
            String order = "";
            float listTotal = 0;
            for(ItemOrder i : list) {
                order += (i.q + " " + i.itemName + ", ");
                listTotal += (i.totalPrice);
            }

            JOptionPane.showMessageDialog(null,
                    "your order: "+ order + " "
                    + "total price: $"+ listTotal);
            dispose();
        }
    }
    public static void main(String[] args) {
        ShoppingCart firstWindow = new ShoppingCart();
        firstWindow.setVisible(true);
    }
}
