package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HangMan implements KeyListener{
	Stack math= new Stack();
	String duplicates= "";
	JLabel jlabel= new JLabel();
	JFrame jframe= new JFrame();
	
	//KeyListener has= new KeyListener();
public static void main(String[]args) {	
	Utilities.readRandomLineFromFile("dictionary.txt");
	HangMan matthew= new HangMan();
	matthew.createUI();
	//Utilities.readRandomLineFromFile();
	
}
void createUI(){
jframe.setVisible(true);
jframe.add(jlabel);
 	math.push("dictionary.txt");
 	jframe.setSize(1000,1000);
//math.contains(dictionary.txt);	 
 }

public void keyTyped(KeyEvent e) {
	
	
}

public void keyPressed(KeyEvent e) {
	//if(e.getSource()) {
		jlabel.show();
	//}
	
}

public void keyReleased(KeyEvent e) {
	
	


for(int t=0; t<10; t++) {
	
}
String mass= JOptionPane.showInputDialog("How many words do you want?");

}




}
