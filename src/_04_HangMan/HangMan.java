package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	Stack <String> math= new Stack<String>();
	JLabel jlabel= new JLabel();
	JLabel jlabel2= new JLabel();
	
	JFrame jframe= new JFrame();
	JPanel jpanel= new JPanel();
	int numberoflives= 10;
	String text= "";
	ArrayList<Character> letterbank= new ArrayList<Character>();
	String word;
	//HangMan matt= new HangMan();
	
	
public static void main(String[]args) {	
	
	HangMan matthew= new HangMan();
	
	matthew.createUI();
	
}



void createUI(){
jframe.setVisible(true);
jframe.add(jlabel);
jframe.setSize(1000,1000);
jframe.add(jpanel);
jpanel.add(jlabel);
jpanel.add(jlabel2);
jlabel2.setText("number of lives:" + numberoflives);
String mass= JOptionPane.showInputDialog("How many words do you want?");
int numberoftimes=Integer.parseInt(mass);
for(int u=0; u<numberoftimes; u++) {
math.push(Utilities.readRandomLineFromFile("dictionary.txt"));	
}

word= math.pop();
for(int y= 0; y<word.length(); y++) {
text +="_";
}
jlabel.setText(text) ;
jframe.addKeyListener(this);

}

public void keyTyped(KeyEvent e) {
		
}
public void keyPressed(KeyEvent e) {
	StringBuilder sb= new StringBuilder(jlabel.getText());
	
	char pressed= e.getKeyChar();
	for(int y= 0; y<text.length(); y++) {
	if(word.charAt(y)==pressed){
		sb.setCharAt(y,pressed);	
	}
	
	if(sb.toString().equals(word) ) {
	JOptionPane.showMessageDialog(null,"You win!");
	int integer= JOptionPane.showConfirmDialog(null,"Wanna play again");
	
		if(integer==1||integer==2) {
			System.exit(0);	
			}
			else if(integer==0) {
				
				if(!math.empty()) {
					word= math.pop();
				}
				else {
					System.exit(0);
				}
			
			text= "";
				
			for(int u=0; u<word.length(); u++) {
				
			text +="_";	
			}
			jlabel.setText(text);
			sb= new StringBuilder(jlabel.getText());
			
			numberoflives= 10;	
			jlabel2.setText("number of lives: " + numberoflives);	
		
			}
	}
	
	if(word.charAt(y)!=pressed && !letterbank.contains(pressed)&& !word.contains(pressed+ "")) {
		numberoflives--;
		jlabel2.setText("number of lives:" + numberoflives);
		letterbank.add(pressed);
	}
	}
	
	
	
	
	if(numberoflives==0){
		JOptionPane.showMessageDialog(null,"GameOver");
		JOptionPane.showMessageDialog(null, "Here is the word " + word);
		int integer= JOptionPane.showConfirmDialog(null, "Wanna Play again?");
		
		if(integer==1||integer==2) {
		System.exit(0);	
		}
		else if(integer==0) {
			
			if(!math.empty()) {
				word= math.pop();
			}
			else {
				System.exit(0);
			}
		
		text= "";
			
		for(int u=0; u<word.length(); u++) {
			
		text +="_";	
		}
		jlabel.setText(text);
		sb= new StringBuilder(jlabel.getText());
		numberoflives= 10;	
		letterbank.clear();
		jlabel2.setText("number of lives: " + numberoflives);	
	
		}
		
		
	}
	
	jlabel.setText(sb.toString());
	
}

public void keyReleased(KeyEvent e) {
	

	
}



}