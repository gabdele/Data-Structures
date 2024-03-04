import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestWedding {

    public static void main(String[] args) {
        WeddingWindow lalala = new WeddingWindow();
        lalala.setVisible(true);
    }

    public static class WeddingWindow extends JFrame implements ActionListener
    {
        Person pBride, pGroom;
        static Wedding pWedding;
        JLabel heading;
        JLabel bPrompt;
        JLabel gPrompt;
        JLabel dPrompt;
        JLabel lPrompt;
        JTextField bFirstBox;
        JTextField bLastBox;
        JTextField gFirstBox;
        JTextField gLastBox;
        JTextField dayBox;
        JTextField yBox;
        JTextField locBox;
        JComboBox monthBox;
        String[] months = {"Month","January","February","March","April","May",
        "June","July","August","September","October","November","December"};
        JButton next;
        public static Wedding getpWedding(){
            return pWedding;
        }
        public WeddingWindow(){
            setSize(360,300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            heading = new JLabel("Wedding Planner");
            heading.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 40));
            bPrompt = new JLabel("enter bride:");
            gPrompt = new JLabel("enter groom:");
            dPrompt = new JLabel("enter date M/D/Y:");
            JLabel slashes = new JLabel("/");
            lPrompt = new JLabel("enter location:");

            bFirstBox = new JTextField(8);
            bLastBox = new JTextField(8);
            gFirstBox = new JTextField(8);
            gLastBox = new JTextField(8);
            monthBox = new JComboBox(months);
            dayBox = new JTextField(2);
            yBox = new JTextField(4);
            locBox = new JTextField(8);

            next = new JButton("SUBMIT");
            next.addActionListener(this);

            setLayout(new FlowLayout());
            add(heading);
            add(bPrompt);
            add(bFirstBox);
            add(bLastBox);
            add(gPrompt);
            add(gFirstBox);
            add(gLastBox);
            add(dPrompt);
            add(monthBox);
            add(slashes);
            add(dayBox);
            add(slashes);
            add(yBox);
            add(lPrompt);
            add(locBox);
            add(next);

        }


        @Override
        public void actionPerformed(ActionEvent e) {
            pBride = new Person(bFirstBox.getText(),bLastBox.getText());
            pGroom = new Person(gFirstBox.getText(),gLastBox.getText());
            short month = (short) monthBox.getSelectedIndex();
            short day = Short.parseShort(dayBox.getText());
            short year = Short.parseShort(yBox.getText());
            short[] theDate = {month,day,year};
            pWedding = new Wedding(pBride,pGroom,theDate, locBox.getText());
            WeddingDisplay invitationSample = new WeddingDisplay();
            invitationSample.setVisible(true);
        }

//use .getText() and .getSelectedItem
    }
}