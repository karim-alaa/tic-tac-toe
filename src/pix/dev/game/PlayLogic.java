package pix.dev.game;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import pix.dev.game.audio.Sounds;

public class PlayLogic {

	public TicTacToe mainGameForm;
	private boolean comPlayed = false;
	private boolean TURN = true;
	protected boolean withComputer = false;
	private final int MAX = 9;
	private final int MIN = 1;
	protected Sounds sound;
	private final String ClickMusicURL = "C:\\Users\\karim\\workspace\\Tic_Tac_Toe\\res\\music\\Stapling Paper-SoundBible.com-238116558.wav";
	// true ==> X ==> green
	// false ==> O ==> red
	
	// X | O | X
	// O | X | X
	// O | X | O
	
	
	public PlayLogic(TicTacToe mainGameForm) {
		this.mainGameForm = mainGameForm;
		sound = new Sounds();
	}

	public void setButtonText(JButton button) {
		sound.playSound(ClickMusicURL);
		if (button.getText().equals("")) {
			button.setFocusable(false);
			if (TURN) {
				button.setText("X");
				button.setBackground(Color.GREEN);
				TURN = false;
			} else {
				button.setText("O");
				button.setBackground(Color.RED);
				TURN = true;
			}
		} else {
			// do nothing
		}
		checkForWin();
		if (withComputer && TURN == false) {
			comPlay();
			checkForWin();
			TURN = true;
			comPlayed = false;
		}
	}

	public void comSimplePlay() {
		Random random = new Random();
		int index = random.nextInt((MAX - MIN) + 1) + MIN;
		boolean played = false;
		if (mainGameForm.btn5.getText().equals("") && index == 5)
			setButtonText(mainGameForm.btn5);
		played = true;
		if (mainGameForm.btn4.getText().equals("") && index == 4)
			setButtonText(mainGameForm.btn4);
		played = true;
		if (mainGameForm.btn3.getText().equals("") && index == 3)
			setButtonText(mainGameForm.btn3);
		played = true;
		if (mainGameForm.btn2.getText().equals("") && index == 2)
			setButtonText(mainGameForm.btn2);
		played = true;
		if (mainGameForm.btn6.getText().equals("") && index == 6)
			setButtonText(mainGameForm.btn6);
		played = true;
		if (mainGameForm.btn1.getText().equals("") && index == 1)
			setButtonText(mainGameForm.btn1);
		played = true;
		if (mainGameForm.btn8.getText().equals("") && index == 8)
			setButtonText(mainGameForm.btn8);
		played = true;
		if (mainGameForm.btn7.getText().equals("") && index == 7)
			setButtonText(mainGameForm.btn7);
		played = true;
		if (mainGameForm.btn9.getText().equals("") && index == 9)
			setButtonText(mainGameForm.btn9);
		played = true;
		if (!played)
			comSimplePlay();
	}

	public void comPlay() {
		canComWillWin();
		if (comPlayed == false)
			canPlayerWillWin();
		if (comPlayed == false) {
			comSimplePlay();
			comPlayed = true;
		}

	}

	public void canComWillWin() {
		if ((mainGameForm.btn1.getText().equals("O") && mainGameForm.btn2.getText().equals("O") && mainGameForm.btn3.getText().equals(""))) {
			setButtonText(mainGameForm.btn3);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("O") && mainGameForm.btn2.getText().equals("")
				&& mainGameForm.btn3.getText().equals("O"))) {
			setButtonText(mainGameForm.btn2);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("") && mainGameForm.btn2.getText().equals("O")
				&& mainGameForm.btn3.getText().equals("O"))) {
			setButtonText(mainGameForm.btn1);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("O") && mainGameForm.btn4.getText().equals("O")
				&& mainGameForm.btn7.getText().equals(""))) {
			setButtonText(mainGameForm.btn7);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("O") && mainGameForm.btn4.getText().equals("")
				&& mainGameForm.btn7.getText().equals("O"))) {
			setButtonText(mainGameForm.btn4);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("") && mainGameForm.btn4.getText().equals("O")
				&& mainGameForm.btn7.getText().equals("O"))) {
			setButtonText(mainGameForm.btn1);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("O") && mainGameForm.btn5.getText().equals("O")
				&& mainGameForm.btn9.getText().equals(""))) {
			setButtonText(mainGameForm.btn9);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("O") && mainGameForm.btn5.getText().equals("")
				&& mainGameForm.btn9.getText().equals("O"))) {
			setButtonText(mainGameForm.btn5);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("") && mainGameForm.btn5.getText().equals("O")
				&& mainGameForm.btn9.getText().equals("O"))) {
			setButtonText(mainGameForm.btn1);
			comPlayed = true;
		} else if ((mainGameForm.btn3.getText().equals("O") && mainGameForm.btn5.getText().equals("O")
				&& mainGameForm.btn7.getText().equals(""))) {
			setButtonText(mainGameForm.btn7);
			comPlayed = true;
		} else if ((mainGameForm.btn3.getText().equals("O") && mainGameForm.btn5.getText().equals("")
				&& mainGameForm.btn7.getText().equals("O"))) {
			setButtonText(mainGameForm.btn5);
			comPlayed = true;
		} else if ((mainGameForm.btn3.getText().equals("") && mainGameForm.btn5.getText().equals("O")
				&& mainGameForm.btn7.getText().equals("O"))) {
			setButtonText(mainGameForm.btn3);
			comPlayed = true;
		} else if ((mainGameForm.btn3.getText().equals("O") && mainGameForm.btn6.getText().equals("O")
				&& mainGameForm.btn9.getText().equals(""))) {
			setButtonText(mainGameForm.btn9);
			comPlayed = true;
		} else if ((mainGameForm.btn3.getText().equals("O") && mainGameForm.btn6.getText().equals("")
				&& mainGameForm.btn9.getText().equals("O"))) {
			setButtonText(mainGameForm.btn6);
			comPlayed = true;
		} else if ((mainGameForm.btn3.getText().equals("") && mainGameForm.btn6.getText().equals("O")
				&& mainGameForm.btn9.getText().equals("O"))) {
			setButtonText(mainGameForm.btn3);
			comPlayed = true;
		} else if ((mainGameForm.btn7.getText().equals("O") && mainGameForm.btn8.getText().equals("O")
				&& mainGameForm.btn9.getText().equals(""))) {
			setButtonText(mainGameForm.btn9);
			comPlayed = true;
		} else if ((mainGameForm.btn7.getText().equals("O") && mainGameForm.btn8.getText().equals("")
				&& mainGameForm.btn9.getText().equals("O"))) {
			setButtonText(mainGameForm.btn8);
			comPlayed = true;
		} else if ((mainGameForm.btn7.getText().equals("") && mainGameForm.btn8.getText().equals("O")
				&& mainGameForm.btn9.getText().equals("O"))) {
			setButtonText(mainGameForm.btn7);
			comPlayed = true;
		} else if ((mainGameForm.btn4.getText().equals("O") && mainGameForm.btn5.getText().equals("O")
				&& mainGameForm.btn6.getText().equals(""))) {
			setButtonText(mainGameForm.btn6);
			comPlayed = true;
		} else if ((mainGameForm.btn4.getText().equals("O") && mainGameForm.btn5.getText().equals("")
				&& mainGameForm.btn6.getText().equals("O"))) {
			setButtonText(mainGameForm.btn5);
			comPlayed = true;
		} else if ((mainGameForm.btn4.getText().equals("") && mainGameForm.btn5.getText().equals("O")
				&& mainGameForm.btn6.getText().equals("O"))) {
			setButtonText(mainGameForm.btn4);
			comPlayed = true;
		} else if ((mainGameForm.btn2.getText().equals("O") && mainGameForm.btn5.getText().equals("O")
				&& mainGameForm.btn8.getText().equals(""))) {
			setButtonText(mainGameForm.btn8);
			comPlayed = true;
		} else if ((mainGameForm.btn2.getText().equals("O") && mainGameForm.btn5.getText().equals("")
				&& mainGameForm.btn8.getText().equals("O"))) {
			setButtonText(mainGameForm.btn5);
			comPlayed = true;
		} else if ((mainGameForm.btn2.getText().equals("") && mainGameForm.btn5.getText().equals("O")
				&& mainGameForm.btn8.getText().equals("O"))) {
			setButtonText(mainGameForm.btn2);
			comPlayed = true;
		}
	}

	public void canPlayerWillWin() {
		if ((mainGameForm.btn1.getText().equals("X") && mainGameForm.btn2.getText().equals("X") && mainGameForm.btn3.getText().equals(""))) {
			setButtonText(mainGameForm.btn3);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("X") && mainGameForm.btn2.getText().equals("")
				&& mainGameForm.btn3.getText().equals("X"))) {
			setButtonText(mainGameForm.btn2);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("") && mainGameForm.btn2.getText().equals("X")
				&& mainGameForm.btn3.getText().equals("X"))) {
			setButtonText(mainGameForm.btn1);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("X") && mainGameForm.btn4.getText().equals("X")
				&& mainGameForm.btn7.getText().equals(""))) {
			setButtonText(mainGameForm.btn7);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("X") && mainGameForm.btn4.getText().equals("")
				&& mainGameForm.btn7.getText().equals("X"))) {
			setButtonText(mainGameForm.btn4);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("") && mainGameForm.btn4.getText().equals("X")
				&& mainGameForm.btn7.getText().equals("X"))) {
			setButtonText(mainGameForm.btn1);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("X") && mainGameForm.btn5.getText().equals("X")
				&& mainGameForm.btn9.getText().equals(""))) {
			setButtonText(mainGameForm.btn9);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("X") && mainGameForm.btn5.getText().equals("")
				&& mainGameForm.btn9.getText().equals("X"))) {
			setButtonText(mainGameForm.btn5);
			comPlayed = true;
		} else if ((mainGameForm.btn1.getText().equals("") && mainGameForm.btn5.getText().equals("X")
				&& mainGameForm.btn9.getText().equals("X"))) {
			setButtonText(mainGameForm.btn1);
			comPlayed = true;
		} else if ((mainGameForm.btn3.getText().equals("X") && mainGameForm.btn5.getText().equals("X")
				&& mainGameForm.btn7.getText().equals(""))) {
			setButtonText(mainGameForm.btn7);
			comPlayed = true;
		} else if ((mainGameForm.btn3.getText().equals("X") && mainGameForm.btn5.getText().equals("")
				&& mainGameForm.btn7.getText().equals("X"))) {
			setButtonText(mainGameForm.btn5);
			comPlayed = true;
		} else if ((mainGameForm.btn3.getText().equals("") && mainGameForm.btn5.getText().equals("X")
				&& mainGameForm.btn7.getText().equals("X"))) {
			setButtonText(mainGameForm.btn3);
			comPlayed = true;
		} else if ((mainGameForm.btn3.getText().equals("X") && mainGameForm.btn6.getText().equals("X")
				&& mainGameForm.btn9.getText().equals(""))) {
			setButtonText(mainGameForm.btn9);
			comPlayed = true;
		} else if ((mainGameForm.btn3.getText().equals("X") && mainGameForm.btn6.getText().equals("")
				&& mainGameForm.btn9.getText().equals("X"))) {
			setButtonText(mainGameForm.btn6);
			comPlayed = true;
		} else if ((mainGameForm.btn3.getText().equals("") && mainGameForm.btn6.getText().equals("X")
				&& mainGameForm.btn9.getText().equals("X"))) {
			setButtonText(mainGameForm.btn3);
			comPlayed = true;
		} else if ((mainGameForm.btn7.getText().equals("X") && mainGameForm.btn8.getText().equals("X")
				&& mainGameForm.btn9.getText().equals(""))) {
			setButtonText(mainGameForm.btn9);
			comPlayed = true;
		} else if ((mainGameForm.btn7.getText().equals("X") && mainGameForm.btn8.getText().equals("")
				&& mainGameForm.btn9.getText().equals("X"))) {
			setButtonText(mainGameForm.btn8);
			comPlayed = true;
		} else if ((mainGameForm.btn7.getText().equals("") && mainGameForm.btn8.getText().equals("X")
				&& mainGameForm.btn9.getText().equals("X"))) {
			setButtonText(mainGameForm.btn7);
			comPlayed = true;
		} else if ((mainGameForm.btn4.getText().equals("X") && mainGameForm.btn5.getText().equals("X")
				&& mainGameForm.btn6.getText().equals(""))) {
			setButtonText(mainGameForm.btn6);
			comPlayed = true;
		} else if ((mainGameForm.btn4.getText().equals("X") && mainGameForm.btn5.getText().equals("")
				&& mainGameForm.btn6.getText().equals("X"))) {
			setButtonText(mainGameForm.btn5);
			comPlayed = true;
		} else if ((mainGameForm.btn4.getText().equals("") && mainGameForm.btn5.getText().equals("X")
				&& mainGameForm.btn6.getText().equals("X"))) {
			setButtonText(mainGameForm.btn4);
			comPlayed = true;
		} else if ((mainGameForm.btn2.getText().equals("X") && mainGameForm.btn5.getText().equals("X")
				&& mainGameForm.btn8.getText().equals(""))) {
			setButtonText(mainGameForm.btn8);
			comPlayed = true;
		} else if ((mainGameForm.btn2.getText().equals("X") && mainGameForm.btn5.getText().equals("")
				&& mainGameForm.btn8.getText().equals("X"))) {
			setButtonText(mainGameForm.btn5);
			comPlayed = true;
		} else if ((mainGameForm.btn2.getText().equals("") && mainGameForm.btn5.getText().equals("X")
				&& mainGameForm.btn8.getText().equals("X"))) {
			setButtonText(mainGameForm.btn2);
			comPlayed = true;
		}
	}

	public void resetGame() {
		mainGameForm.btn1.setText("");
		mainGameForm.btn1.setBackground(null);
		mainGameForm.btn1.setFocusable(false);
		mainGameForm.btn2.setText("");
		mainGameForm.btn2.setBackground(null);
		mainGameForm.btn2.setFocusable(false);
		mainGameForm.btn3.setText("");
		mainGameForm.btn3.setBackground(null);
		mainGameForm.btn3.setFocusable(false);
		mainGameForm.btn4.setText("");
		mainGameForm.btn4.setBackground(null);
		mainGameForm.btn4.setFocusable(false);
		mainGameForm.btn5.setText("");
		mainGameForm.btn5.setBackground(null);
		mainGameForm.btn5.setFocusable(false);
		mainGameForm.btn6.setText("");
		mainGameForm.btn6.setBackground(null);
		mainGameForm.btn6.setFocusable(false);
		mainGameForm.btn7.setText("");
		mainGameForm.btn7.setBackground(null);
		mainGameForm.btn7.setFocusable(false);
		mainGameForm.btn8.setText("");
		mainGameForm.btn8.setBackground(null);
		mainGameForm.btn8.setFocusable(false);
		mainGameForm.btn9.setText("");
		mainGameForm.btn9.setBackground(null);
		mainGameForm.btn9.setFocusable(false);
		TURN = true;
	}

	public void player1Won() {
		JOptionPane.showMessageDialog(null, "Player 1 Is Winner !");
		resetGame();
	}

	public void player2Won() {
		JOptionPane.showMessageDialog(null, "Player 2 Is Winner !");
		resetGame();
	}

	public void DRAW() {
		JOptionPane.showMessageDialog(null, "Draw !");
		resetGame();
	}

	public void checkForWin() {
		if (mainGameForm.btn1.getText().equals("X") && mainGameForm.btn2.getText().equals("X") && mainGameForm.btn3.getText().equals("X")) {
			player1Won();
		}
		if (mainGameForm.btn1.getText().equals("X") && mainGameForm.btn4.getText().equals("X") && mainGameForm.btn7.getText().equals("X")) {
			player1Won();
		}
		if (mainGameForm.btn1.getText().equals("X") && mainGameForm.btn5.getText().equals("X") && mainGameForm.btn9.getText().equals("X")) {
			player1Won();
		}
		if (mainGameForm.btn3.getText().equals("X") && mainGameForm.btn5.getText().equals("X") && mainGameForm.btn7.getText().equals("X")) {
			player1Won();
		}
		if (mainGameForm.btn3.getText().equals("X") && mainGameForm.btn6.getText().equals("X") && mainGameForm.btn9.getText().equals("X")) {
			player1Won();
		}
		if (mainGameForm.btn7.getText().equals("X") && mainGameForm.btn8.getText().equals("X") && mainGameForm.btn9.getText().equals("X")) {
			player1Won();
		}
		if (mainGameForm.btn4.getText().equals("X") && mainGameForm.btn5.getText().equals("X") && mainGameForm.btn6.getText().equals("X")) {
			player1Won();
		}
		if (mainGameForm.btn2.getText().equals("X") && mainGameForm.btn5.getText().equals("X") && mainGameForm.btn8.getText().equals("X")) {
			player1Won();
		}
		/******************************/
		if (mainGameForm.btn1.getText().equals("O") && mainGameForm.btn2.getText().equals("O") && mainGameForm.btn3.getText().equals("O")) {
			player2Won();
		}
		if (mainGameForm.btn1.getText().equals("O") && mainGameForm.btn4.getText().equals("O") && mainGameForm.btn7.getText().equals("O")) {
			player2Won();
		}
		if (mainGameForm.btn1.getText().equals("O") && mainGameForm.btn5.getText().equals("O") && mainGameForm.btn9.getText().equals("O")) {
			player2Won();
		}
		if (mainGameForm.btn3.getText().equals("O") && mainGameForm.btn5.getText().equals("O") && mainGameForm.btn7.getText().equals("O")) {
			player2Won();
		}
		if (mainGameForm.btn3.getText().equals("O") && mainGameForm.btn6.getText().equals("O") && mainGameForm.btn9.getText().equals("O")) {
			player2Won();
		}
		if (mainGameForm.btn7.getText().equals("O") && mainGameForm.btn8.getText().equals("O") && mainGameForm.btn9.getText().equals("O")) {
			player2Won();
		}
		if (mainGameForm.btn4.getText().equals("O") && mainGameForm.btn5.getText().equals("O") && mainGameForm.btn6.getText().equals("O")) {
			player2Won();
		}
		if (mainGameForm.btn2.getText().equals("O") && mainGameForm.btn5.getText().equals("O") && mainGameForm.btn8.getText().equals("O")) {
			player2Won();
		}
		                                     /*****************Draw Case******************/
		if (!mainGameForm.btn1.getText().equals("") && !mainGameForm.btn2.getText().equals("") && !mainGameForm.btn3.getText().equals("")
				&& !mainGameForm.btn4.getText().equals("") && !mainGameForm.btn5.getText().equals("") && !mainGameForm.btn6.getText().equals("")
				&& !mainGameForm.btn7.getText().equals("") && !mainGameForm.btn8.getText().equals("") && !mainGameForm.btn9.getText().equals("")) {
			DRAW();
		}
	}

}
