import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Practice 
{

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(300, 200, 500, 300);
		myFrame.setLayout(null);
		
		JLabel label1 = new JLabel("Please enter your name.");
		label1.setBounds(50, 50, 200, 20);
		myFrame.add(label1);
		JLabel label2 = new JLabel("Please enter your phone number.");
		label2.setBounds(50, 100, 200, 20);
		myFrame.add(label2);
		
		JTextField name = new JTextField();
		name.setBounds(250, 50, 100, 20);
		myFrame.add(name);
		JTextField phoneNumber = new JTextField();
		phoneNumber.setBounds(250, 100, 100, 20);
		myFrame.add(phoneNumber);
		
		JLabel display = new JLabel();
		display.setBounds(150, 190, 500, 20);
		myFrame.add(display);
		JLabel display2 = new JLabel();
		display2.setBounds(150, 210, 500, 20);
		myFrame.add(display2);
		
		JButton command = new JButton("ENTER");
		command.setBounds(190, 150, 100, 20);
		myFrame.add(command);
		command.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						display.setText("Name: " + name.getText());
						display2.setText("Phone Number: " + phoneNumber.getText());
					}
				});
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
