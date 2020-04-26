
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Start extends JFrame {
 
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=851,379
	 */
	private final JLabel label = new JLabel("New label");
    	

	/**
	 * Create the frame.
	 */
	public Start() {
		
		Player player = new Player("Arisa",0);
				
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\Logo.png"));
		setTitle("Pokemon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnmybag = new JButton("My Bag");
		btnmybag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mybag b = new mybag(player);
			}
		});
	
		JButton btnNewButton = new JButton("Catch Pokemon");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				catchpokemon cp =new catchpokemon(player);
			}
		});
		btnNewButton.setBounds(210, 193, 133, 52);
		contentPane.add(btnNewButton);
		btnmybag.setBounds(210, 130, 133, 52);
		contentPane.add(btnmybag);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0,900, 800);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHi = new JLabel("Hi!!");
		lblHi.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblHi.setBounds(250, 30, 69, 28);
		panel.add(lblHi);
		
	
		JLabel lblnameplayer = new JLabel("My name is "+player.getPlname());
		lblnameplayer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblnameplayer.setBounds(200, 70, 209, 25);
		panel.add(lblnameplayer);
		
		/*JLabel lbplayer = new JLabel("");
		lbplayer.setIcon(new ImageIcon("img\\player2.png"));
		lbplayer.setBounds(0, 100, 214, 286);
		contentPane.add(lbplayer);*/
		
		JLabel lbBg3 = new JLabel("");
		lbBg3.setIcon(new ImageIcon("img\\black.jpg"));
		lbBg3.setBounds(0, 0, 900, 800);
		contentPane.add(lbBg3);
		setVisible(true);
		
		
	}
}