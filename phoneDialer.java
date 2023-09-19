import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

// Add a new class also called PhoneDialer.  Be sure to create a main() method.
// Make your PhoneDialer class implement the ActionListener interface to handle the button clicks.
public class phoneDialer implements ActionListener{
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
        mainPanel.setLayout(myLayout);
        //Set a new Border of empty space with 10 pixels on all sides
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        // Create a new JPanel to hold your top label
        JPanel topPanel = new JPanel();
        // Set the layout to a new FlowLayout
        FlowLayout layout = new FlowLayout();
        topPanel.setLayout(layout);
        // Create a new JLabel saying "Enter the number to dial:".  Add it to your label JPanel.
        JLabel theLabel = new JLabel("Enter the number to dial: ");
        topPanel.add(theLabel);

        //Create a new JPanel to hold your grid of 0-9 and dash buttons
        JPanel gridPanel = new JPanel();
        // Set the layout to a new GridLayout with 4 rows, 3 columns, and spacing of 5 pixels between cells both horizontally and vertically
        GridLayout GL = new GridLayout(4, 3, 5, 5);
        gridPanel.setLayout(GL);
        // Set a new Border of empty space with 5 pixels on all sides
        gridPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        dash.addActionListener(this);

        // Add each of the new JButtons to your grid in an order that arranges them as shown in the "Project Details" section above.
        gridPanel.add(one);
        gridPanel.add(two);
        gridPanel.add(three);
        gridPanel.add(four);
        gridPanel.add(five);
        gridPanel.add(six);
        gridPanel.add(seven);
        gridPanel.add(eight);
        gridPanel.add(nine);
        gridPanel.add(zero);
        gridPanel.add(dash);

        // Now add your new child panel holding the label to your main content panel
        mainPanel.add(topPanel);
        // Next, add your new child panel holding the phone buttons to your main content panel
        mainPanel.add(gridPanel);
        // Set the X alignment of the JButton to Component.CENTER_ALIGNMENT.
        dial.setAlignmentX(Component.CENTER_ALIGNMENT);
        // Add the new JButton directly to your main JPanel under the other two child panels
        mainPanel.add(dial);
        // Finally, call setVisible(true) on your main frame to make the window visible!
        dialerFrame.setVisible(true);

        // Call addActionListener() on all of your JButton objects, passing in the "this" parameter to make your main class the recipient of all action events from those buttons.
        dial.addActionListener(this);
    }
    // Add the actionPerformed() method as defined on the ActionListener interface.
    public void actionPerformed(ActionEvent event) {
        // Add a series of else if() statements, checking for a match on each remaining button representing a digit or dash on the keypad.
        Object UI = event.getSource();
        if (UI == one)
            phoneNumber += "1";
        else if (UI == two)
            phoneNumber += "2";
        else if (UI == three)
            phoneNumber += "3";
        else if (UI == four)
            phoneNumber += "4";
        else if (UI == five)
            phoneNumber += "5";
        else if (UI == six)
            phoneNumber += "6";
        else if (UI == seven)
            phoneNumber += "7";
        else if (UI == eight)
            phoneNumber += "8";
        else if (UI == nine)
            phoneNumber += "9";
        else if (UI == zero)
            phoneNumber += "0";
        else if (UI == dash)
            phoneNumber += "-";
        else if (UI == dial)
        {
            JOptionPane.showMessageDialog(null, "Dialing: " + phoneNumber);
            phoneNumber = "";
        }

    
        // Now, after appending the input, use JOptionPane.showMessageDialog() to show the phone number currently stored in the class-level phone number String
        
    }
    }