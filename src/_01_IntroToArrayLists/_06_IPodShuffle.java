package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements KeyListener, ActionListener {
	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
	JButton jbutton = new JButton();
	JButton jbutton1= new JButton();
	Song name = new Song("demo.mp3");
	Song name2 = new Song("fowl.mp3");

	public _06_IPodShuffle() {

		// 1. Use the Song class the play the demo.mp3 file.

		// Song name1= new Song();
		//name.play();

		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */

		ArrayList<Song> musicplaylists = new ArrayList<Song>();
		musicplaylists.add(name2);
		jframe.setVisible(true);
		// musicplaylists.add
		jframe.add(jpanel);
		jpanel.add(jbutton);
		jpanel.add(jbutton1);
		jbutton.setText("Surprise Me");
		jbutton1.setText("May");
		jbutton.addActionListener(this);
		jbutton1.addActionListener(this);
		jframe.pack();
		
	}

	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	public void keyTyped(KeyEvent e) {
	
	}

	public void keyPressed(KeyEvent e) {

	}
	public void keyReleased(KeyEvent e) {
		

	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbutton) {
		JOptionPane.showMessageDialog(null, "Music");
		name.stop();
		name2.play();
		}
		if(e.getSource()==jbutton1) {
		JOptionPane.showMessageDialog(null, "Matthew's favorite instrument");
		name2.stop();
		name.play();
		}
	}
}