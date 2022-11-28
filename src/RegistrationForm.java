import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Thank you for everything you have taught us.
 *
 * @author Amir Armion :)
 * @version 1.0
 */
public class RegistrationForm implements ActionListener
{
    JFrame     frame;

    JTextField name;
    JTextField primaryAddress;
    JTextField secondAddress;
    JTextField age;
    JTextField height;
    JTextField weight;

    JButton    register;

    /**
     * Constructor.
     */
    public RegistrationForm()
    {

    }

    /**
     * This method creates the main frame.
     */
    public void mainFrame()
    {
        frame = new JFrame("Signup Form");
        frame.setSize(420, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);
    }

    /**
     * This method creates all text fields and register button.
     */
    public void registerButtonAndTextFields()
    {
        // Text fields
        name = new JTextField("Name");
        name.setBounds(100, 50, 200, 40);

        primaryAddress = new JTextField("Primary Address");
        primaryAddress.setBounds(100, 120, 200, 40);

        secondAddress = new JTextField("Second Address");
        secondAddress.setBounds(100, 190, 200, 40);

        age = new JTextField("Age");
        age.setBounds(100, 260, 200, 40);

        height = new JTextField("Height");
        height.setBounds(100, 330, 200, 40);

        weight = new JTextField("Weight");
        weight.setBounds(100, 400, 200, 40);

        frame.add(name);
        frame.add(primaryAddress);
        frame.add(secondAddress);
        frame.add(age);
        frame.add(height);
        frame.add(weight);

        // Button
        register = new JButton("Registration");
        register.addActionListener(this);
        register.setBounds(140, 470, 120, 50);
        frame.add(register);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if((name.getText().length() >= 3) &&
                (primaryAddress.getText().equals(secondAddress.getText())) &&
                (Integer.parseInt(age.getText()) >= 18) &&
                (Integer.parseInt(height.getText()) >= 100) &&
                (Integer.parseInt(weight.getText()) >= 40))
        {
            System.out.println("\n>> Your information: \nName: " + name.getText() + "\nPrimary Address: " +
                                primaryAddress.getText() + "\nSecond Address: " + secondAddress.getText() + "\nAge: " +
                                age.getText() + "\nHeight: " + height.getText() + "\nWeight: " + weight.getText());
        }
        else
        {
            System.out.println("\n>> Sorry! Inputs don't meet the requirements!");
        }
    }
}
