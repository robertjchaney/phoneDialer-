import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class phoneDialer {
    JButton zero = new JButton("0");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton dash = new JButton("-");
    JButton dialNumber = new JButton("Dial Number");
    String phoneNumber = "";

    public phoneDialer() {
        // creates a new JFrame
        JFrame dialerFrame = new JFrame();
        dialerFrame.setTitle("Dialer");
        dialerFrame.setSize(200, 250);
        dialerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel dialerPanel = (JPanel)dialerFrame.getContentPane();
        dialerFrame.setLayout(new BoxLayout(dialerFrame, BoxLayout.Y_AXIS));

        dialerFrame.setLayout(new BorderLayout(5,10)); 
        Border myBorder = BorderFactory.createEmptyBorder(10,10,10,10);
        //dialerFrame.setBorder(myBorder); 
    }
}
