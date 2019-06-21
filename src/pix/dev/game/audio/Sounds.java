package pix.dev.game.audio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Sounds {

	private static AudioStream as = null;
	private static InputStream in;

	public synchronized void playSound2(final String url) {
		new Thread(new Runnable() {
			// The wrapper thread is unnecessary, unless it blocks on the
			// Clip finishing; see comments.
			public void run() {
				try {
					Clip clip = AudioSystem.getClip();
					AudioInputStream inputStream = AudioSystem
							.getAudioInputStream(Sounds.class.getResourceAsStream(url));
					clip.open(inputStream);
					clip.start();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		}).start();
	}

	public void playSound(String path) {

		try {
			in = new FileInputStream(path);
			as = new AudioStream(in);
		} catch (FileNotFoundException e) {
			System.out.println("Audio file not found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Incorrect input.");
			e.printStackTrace();
		}
		AudioPlayer.player.start(as);
	}

	public void stopSound() {
		AudioPlayer.player.stop(as);
	}

}
