import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
// Add a new class also called PhoneDialer.  Be sure to create a main() method.
public class phoneDialer {
    // As PhoneDialer class members, declare JButton variables for all numbers between 0 and 9
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
    // As a PhoneDialer class member, declare a JButton variable for the dash symbol
    JButton dash = new JButton("-");
    // As a PhoneDialer class member, declare a JButton variable for the "Dial Number" button
    JButton dial = new JButton("Dial Number");
    // As a PhoneDialer class member, declare a String variable to hold the user's phone number and initialize it to a blank string ("")
    String phoneNumber = "";

    public phoneDialer() {
        // Create a new JFrame
        JFrame dialerFrame = new JFrame();

        // Set the title to "Dialer"
        dialerFrame.setTitle("Dialer");
        // Set the JFrame size to 200 x 250 pixels
        dialerFrame.setSize(200, 250);
        // Set the JFrame default close operation to exit on close.
        dialerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Get the main JPanel content pane from the JFrame
        JPanel mainPanel = (JPanel)dialerFrame.getContentPane();
        // Set the layout to a new BoxLayout with vertical orientation
        BoxLayout myLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
        //Set a new Border of empty space with 10 pixels on all sides
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        // Create a new JPanel to hold your top label
        JPanel topPanel = new JPanel();
        // Set the layout to a new FlowLayout
        FlowLayout layout = new FlowLayout();
        topPanel.setLayout(layout);
        // Create a new JLabel saying "Enter the number to dial:".  Add it to your label JPanel.
        JLabel theLabel = new JLabel("Enter the number to dial: ");
        dialerFrame.add(theLabel);

        //Create a new JPanel to hold your grid of 0-9 and dash buttons
        JPanel gridPanel = new JPanel();
        // Set the layout to a new GridLayout with 4 rows, 3 columns, and spacing of 5 pixels between cells both horizontally and vertically
        GridLayout GL = new GridLayout(4, 3, 5, 5);
        // Set a new Border of empty space with 5 pixels on all sides
        gridPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        // Add each of the new JButtons to your grid in an order that arranges them as shown in the "Project Details" section above.
        gridPanel.add(zero);
        gridPanel.add(one);
        gridPanel.add(two);
        gridPanel.add(three);
        gridPanel.add(four);
        gridPanel.add(five);
        gridPanel.add(six);
        gridPanel.add(seven);
        gridPanel.add(eight);
        gridPanel.add(nine);
        gridPanel.add(dash);

        // Now add your new child panel holding the label to your main content panel
        mainPanel.add(topPanel);
        // Next, add your new child panel holding the phone buttons to your main content panel
        mainPanel.add(gridPanel);
        // Create a new JButton with the text "Dial Number" and store it as a class member variable
        JButton dialButton = new JButton("Dial Number");
        dialButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(dialButton);

        dialerFrame.setVisible(true);


    }
}
