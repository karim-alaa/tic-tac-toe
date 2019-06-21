package pix.dev.game;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class TicTacToe extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	private JPanel contentPane;
	private PlayLogic playLogic;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe frame = new TicTacToe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TicTacToe() {
		
	    
		playLogic = new PlayLogic(this);
		setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\karim\\workspace\\Tic_Tac_Toe\\res\\img\\icon.png"));
		setResizable(false);
		setTitle("Tic Tac Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 278);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btn1 = new JButton("");
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playLogic.setButtonText(btn1);
			}
		});
		btn1.setBounds(10, 32, 112, 62);
		contentPane.add(btn1);

		btn2 = new JButton("");
		btn2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playLogic.setButtonText(btn2);
			}
		});
		btn2.setBounds(147, 32, 112, 62);
		contentPane.add(btn2);

		btn3 = new JButton("");
		btn3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playLogic.setButtonText(btn3);
			}
		});
		btn3.setBounds(281, 32, 112, 62);
		contentPane.add(btn3);

		btn4 = new JButton("");
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playLogic.setButtonText(btn4);
			}
		});
		btn4.setBounds(10, 105, 112, 63);
		contentPane.add(btn4);

		btn5 = new JButton("");
		btn5.setForeground(new Color(0, 0, 0));
		btn5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playLogic.setButtonText(btn5);
			}
		});
		btn5.setBounds(147, 105, 112, 63);
		contentPane.add(btn5);

		btn6 = new JButton("");
		btn6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playLogic.setButtonText(btn6);
			}
		});
		btn6.setBounds(281, 105, 112, 63);
		contentPane.add(btn6);

		btn7 = new JButton("");
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playLogic.setButtonText(btn7);
			}
		});
		btn7.setBounds(10, 179, 112, 62);
		contentPane.add(btn7);

		btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playLogic.setButtonText(btn8);
			}
		});
		btn8.setBounds(147, 179, 112, 62);
		contentPane.add(btn8);

		btn9 = new JButton("");
		btn9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playLogic.setButtonText(btn9);
			}
		});
		btn9.setBounds(281, 179, 112, 62);
		contentPane.add(btn9);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(20, 0, 44, 21);
		contentPane.add(menuBar);

		JMenu mnGame = new JMenu("Game");
		mnGame.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnGame);

		JMenuItem mntmRestartGame = new JMenuItem("Restart Game ");
		mntmRestartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playLogic.resetGame();
			}
		});

		JMenuItem mntmWithComputer = new JMenuItem("1 Player");
		mntmWithComputer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playLogic.withComputer = true;
				playLogic.resetGame();
			}
		});
		mnGame.add(mntmWithComputer);

		JMenuItem mntmWithMyFrind = new JMenuItem("2 Players");
		mntmWithMyFrind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playLogic.withComputer = false;
				playLogic.resetGame();
			}
		});
		mnGame.add(mntmWithMyFrind);

		JSeparator separator = new JSeparator();
		mnGame.add(separator);
		mnGame.add(mntmRestartGame);

		JMenuItem mntmExit = new JMenuItem("Exit Game ");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnGame.add(mntmExit);
	}
}
