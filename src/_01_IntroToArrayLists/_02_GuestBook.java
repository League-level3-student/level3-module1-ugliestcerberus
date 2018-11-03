package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	public static void main(String[]args)   {
	_02_GuestBook matthew= new _02_GuestBook();
		matthew.setup();
	}
JFrame jframe= new JFrame();	
	JPanel jpanel= new JPanel();
	JButton jbutton= new JButton();	
	JButton jbutton2= new JButton();
	public void setup() {
	
	//We need to make sure that we type the String[]args inside it because we need it in order to let the methods and objects function. 
	// 1.Create a GUI with two buttons. 
	// 2.One button reads "Add Name" and the other button reads "View Names".
	jframe.setVisible(true);
	jframe.setSize(500,500);
	jframe.add(jpanel);
	jpanel.add(jbutton);
	jpanel.add(jbutton2);
	jbutton.setText("Add Name");
	jbutton2.setText("View Names");
	jbutton.addActionListener(this);	
	jbutton2.addActionListener(this);
	//The best solution to make the context the best sense possible is to create a new method. 
	//Next, we need to make an object from the class. 
	//Then, we will need to write object.nameofthemethod();
	// We don't make a variable when making a showMessageDialog
	// 6.Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	}
	
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed==jbutton) {
	// 3.When the add name button is clicked, display an input dialog that asks the user to enter a name. 
	String answer= JOptionPane.showInputDialog("Please enter a name");
	// 4.Add that name to an ArrayList.
	ArrayList<String> quotes= new ArrayList<String>();
	quotes.add(answer);	
		}
		else if(buttonPressed==jbutton2) {
			
	// 5.When the "View Names" button is clicked, display a message dialog that displays all the names added to the list. 
	String message= "I will display them";
	for (int l = 0; l < message.length(); l++) {
		message+=" ";
	}
	JOptionPane.showMessageDialog(null,message);
	{
		
	}
		}
	}
	
}
