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
jpanel.add(jlabel);
jpanel.add(jlabel2);
jlabel2.setText("number of lives:" + numberoflives);
//jlabel.setText("lives");
String mass= JOptionPane.showInputDialog("How many words do you want?");
int numberoftimes=Integer.parseInt(mass);
math.push(Utilities.readRandomLineFromFile("dictionary.txt"));
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
	JLabel jlabel3= new JLabel();
	for(int y= 0; y<text.length(); y++) {
	if(word.charAt(y)==pressed){
		sb.setCharAt(y,pressed);
	if(sb.toString()) {
		JOptionPane.showMessageDialog(null,"You win!");
		JOptionPane.showConfirmDialog(null,"Wanna play again");
	}
	}
	
	else if(word.charAt(y)!=pressed && !letterbank.contains(pressed)) {
		System.out.println(numberoflives -= 1);
		jlabel2.setText("number of lives:" + numberoflives);
		letterbank.add(pressed);
	}
	else if(numberoflives==0){
		JOptionPane.showMessageDialog(null,"GameOver");
		JOptionPane.showMessageDialog(null, "Here is the word" + word);
		int integer= JOptionPane.showConfirmDialog(null, "Wanna Play again?");
		if(integer==1) {
		System.exit(0);	
		}
		
	}
	}
	jlabel.setText(sb.toString());
}

public void keyReleased(KeyEvent e) {
	

	
}



}