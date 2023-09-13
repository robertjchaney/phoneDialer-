import javax.swing.*;
import java.awt.*;

class phoneDialer {
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
        JFrame dialer = new JFrame();
        dialer.setTitle("Dialer");
        dialer.setSize(200, 250);
        dialer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
