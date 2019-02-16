package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements MouseListener, KeyListener {
	 /*
	 * 1. Create a JFrame with a JPanel and a JLabel.
	 * 
	 * 
	 * 2. Every time a key is pressed, add that character to the JLabel. It should
	 * look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	// 1.
	JFrame jframe = new JFrame();
	
	JPanel jpanel = new JPanel();
	JLabel jlabel = new JLabel();
	Stack stack= new Stack();
	public static void main(String[]args) {
		_02_TextUndoRedo textUndoRedo= new _02_TextUndoRedo();
		textUndoRedo.createUI();
		
	}
	//2.
	MouseEvent key;
	private void createUI() {
		jframe.setVisible(true);
		jframe.setSize(500,500);
		jframe.add(jpanel);
		jpanel.add(jlabel);
		jpanel.addMouseListener(this);
		jpanel.addKeyListener(this);
	}
	public void mouseClicked(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {
	
	}

	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
			
		}
	}

	public void keyReleased(KeyEvent e) {
		
	}
	
}
