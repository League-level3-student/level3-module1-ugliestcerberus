package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements KeyListener, ActionListener {
	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
	JButton jbutton = new JButton();
	Song name = new Song("demo.mp3");
	Song name2 = new Song("drum.wav");

	public _06_IPodShuffle() {

		// 1. Use the Song class the play the demo.mp3 file.

		// Song name1= new Song();
		name.play();

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
		jframe.pack();
		jpanel.add(jbutton);
		jbutton.setText("Surprise Me");
		jbutton.addActionListener(this);
	}

	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// if(jbutton.e.getSource()==) {

		// }
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	JButton ;		
	}
}