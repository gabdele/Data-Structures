import javax.swing.*;
import java.awt.*;

public class WeddingDisplay extends JFrame{
    Wedding theWedding = TestWedding.WeddingWindow.getpWedding();
    JLabel youAreInvited;
    JLabel brideLabel;
    JLabel and__;
    JLabel groomLabel;
    JLabel on__;
    JLabel dateLabel;
    JLabel locationLabel;
    short theMonth = theWedding.getDate()[0];
    short theDay = theWedding.getDate()[1];
    short theYear = theWedding.getDate()[2];
    public WeddingDisplay(){
        setSize(1000,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.PINK);
        youAreInvited = new JLabel("you have been invited to the");
        JLabel tothe = new JLabel("wedding of:");
        brideLabel = new JLabel(" " + (theWedding.getBride()).getFirst()+
                " "+(theWedding.getBride()).getLast());
        and__ = new JLabel(" and");
        groomLabel = new JLabel(" "+(theWedding.getGroom()).getFirst()+
                " "+(theWedding.getGroom()).getLast());
        on__ = new JLabel(" on");
        dateLabel = new JLabel(theMonth+"-"+theDay+"-"+theYear);
        locationLabel = new JLabel("at "+ theWedding.getLocation());

        brideLabel.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 40));
        groomLabel.setFont(new Font("Serif",Font.ITALIC+ Font.BOLD,40));
        youAreInvited.setFont(new Font("Serif",Font.PLAIN,20));
        tothe.setFont(new Font("Serif",Font.PLAIN,20));
        and__.setFont(new Font("Serif",Font.PLAIN,20));
        on__.setFont(new Font("Serif",Font.PLAIN,20));
        dateLabel.setFont(new Font("Serif",Font.BOLD,25));
        locationLabel.setFont(new Font("Serif",Font.BOLD,25));

        JLabel blank1 = new JLabel("     ");

        setLayout(new GridLayout(3, 3));
        add(blank1);
        add(youAreInvited);
        add(tothe);
        add(brideLabel);
        add(and__);
        add(groomLabel);
        add(on__);
        add(dateLabel);
        add(locationLabel);

    }

}
