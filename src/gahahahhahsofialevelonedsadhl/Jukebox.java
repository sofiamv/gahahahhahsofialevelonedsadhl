// Copyright The League of Amazing Programmers, 2015
package gahahahhahsofialevelonedsadhl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

/* 1. Download the JavaZoom jar from here: http://bit.ly/javazoom
 * 2. Right click your project and add it as an External JAR (Under Java Build Path > Libraries).*/

public class Jukebox implements Runnable, ActionListener {
	Song allstar = new Song("All_Star[Mp3Converter.net].mp3");
	Song abc = new Song("alphabet_shuffle[Mp3Converter.net].mp3");
	Song ttgs = new Song("Skkrra_-_Manz_not_hot_FULL[Mp3Converter.net].mp3");
	Song ss = new Song("Bag_Raiders_-_Shooting_Stars[Mp3Converter.net].mp3");
	//Song allstar = new Song("All_Star[Mp3Converter.net].mp3");
JFrame frame = new JFrame("Jukebox!");
JPanel panel = new JPanel();
JButton button1 = new JButton("All Star by Smash Mouth");
JButton button2 = new JButton("Stop music!");
JButton button3 = new JButton("Alphabet Shuffle by Bill Wurtz");
JButton button5 = new JButton("Shooting Stars by Bag Raiders");
JButton button4 = new JButton("Mans not hot");
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Jukebox());
		Jukebox jb = new Jukebox();
		jb.run();
		
		
	}

           public void run() {    	   
        	   frame.add(panel);
        	   panel.add(button1);
        	   panel.add(button3);
        	   panel.add(button5);
        	   panel.add(button2);
        	   panel.add(button4);
        	   frame.pack();
        	   frame.setVisible(true);
        	   button1.addActionListener(this);
        	   button2.addActionListener(this);
        	   button3.addActionListener(this);
        	   button4.addActionListener(this);
		/*
		 * 6. Create a user interface for your Jukebox so that the user can to
		 * choose which song to play. You can use can use a different button for
		 * each song, or a picture of the album cover. When the button or album
		 * cover is clicked, stop the currently playing song, and play the one
		 * that was selected.
		 */
        	   
          }
	/* Use this method to add album covers to your Panel. */
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			allstar.play();
		}
		if(e.getSource()==button3) {
			abc.play();
		}
		if(e.getSource()==button2) {
			System.out.println("no");
			allstar.stop();
			abc.stop();
			ttgs.stop();
			ss.stop();
		}
		if(e.getSource()==button4) {
				ttgs.play();
			}
			System.out.println(e.getSource());
	
	if(e.getSource()==button5) {
		ss.play();
	}
}

}

class Song {

	private int duration;
	private String songAddress;
	private AdvancedPlayer mp3Player;
	private InputStream songStream;

	/**
	 * Songs can be constructed from files on your computer or Internet
	 * addresses.
	 * 
	 * Examples: <code> 
	 * 		new Song("everywhere.mp3"); 	//from default package 
	 * 		new Song("/Users/joonspoon/music/Vampire Weekend - Modern Vampires of the City/03 Step.mp3"); 
	 * 		new	Song("http://freedownloads.last.fm/download/569264057/Get%2BGot.mp3"); 
	 * </code>
	 */
	public Song(String songAddress) {
		this.songAddress = songAddress;
	}

	public void play() {
		loadFile();
		if (songStream != null) {
			loadPlayer();
			startSong();
		} else
			System.err.println("Unable to load file: " + songAddress);
	}

	public void setDuration(int seconds) {
		this.duration = seconds * 100;
	}

	public void stop() {
		if (mp3Player != null)
			mp3Player.close();
	}

	private void startSong() {
		Thread t = new Thread() {
			public void run() {
				try {
					if (duration > 0)
						mp3Player.play(duration);
					else
						mp3Player.play();
				} catch (Exception e) {
				}
			}
		};
		t.start();
	}

	private void loadPlayer() {
		try {
			this.mp3Player = new AdvancedPlayer(songStream);
		} catch (Exception e) {
		}
	}

	private void loadFile() {
		if (songAddress.contains("http"))
			this.songStream = loadStreamFromInternet();
		else
			this.songStream = loadStreamFromComputer();
	}

	private InputStream loadStreamFromInternet() {
		try {
			return new URL(songAddress).openStream();
		} catch (Exception e) {
			return null;
		}
	}

	private InputStream loadStreamFromComputer() {
		try {
			return new FileInputStream(songAddress);
		} catch (FileNotFoundException e) {
			return this.getClass().getResourceAsStream(songAddress);
		}
	}
}

