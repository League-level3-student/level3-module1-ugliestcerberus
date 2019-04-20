package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	Stack <String> math= new Stack<String>();
	JLabel jlabel= new JLabel();
	JFrame jframe= new JFrame();
	JPanel jpanel= new JPanel();
	int numberoflives= 10;
	String text= "_____________________";
	//dictionary
	
	//KeyListener has= new KeyListener();
public static void main(String[]args) {	
	
	HangMan matthew= new HangMan();
	matthew.createUI();
	//Utilities.readRandomLineFromFile();
	
}
void createUI(){
jframe.setVisible(true);
jframe.add(jlabel);
jframe.setSize(1000,1000);
jframe.add(jpanel);
String mass= JOptionPane.showInputDialog("How many words do you want?");
int numberoftimes=Integer.parseInt(mass);
for(int y= 0; y<numberoftimes; y++) {
	math.push(Utilities.readRandomLineFromFile("dictionary.txt"));
}
math.contains(true);
//dictionary.txt();
//math.contains(dictionary.txt);	

}

public void keyTyped(KeyEvent e) {
		
}
public void keyPressed(KeyEvent e) {
	//if(e.getSource()) {	
	//}
jlabel.setText(math.pop());		
String letters= JOptionPane.showInputDialog("Please type in some letters");
if(tes) {
	
}
//1. Type in some code that pops out the words 2. collect some inputs 3. if statement whether the key words are correct
}

public void keyReleased(KeyEvent e) {
	
for(int t=0; t<10; t++) {
	
}


}




}
