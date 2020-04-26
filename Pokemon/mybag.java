import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mybag extends JFrame {

	private JPanel contentPane;
	private Player player;


	/**
	 * Create the frame.
	 */
	public mybag(Player player) {
		this.player = player;
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\bag.png"));
		setTitle("Mybag");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewSeel = new JButton("Seel");
		btnNewSeel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				status s1 = new status(player.getBag().get(0));
			}
		});
		
		JLabel lblSeel = new JLabel("");
		lblSeel.setIcon(new ImageIcon("img\\Seel2.png"));
		lblSeel.setBounds(50, 95, 200, 200);
		contentPane.add(lblSeel);
		
		JLabel lblzubat = new JLabel("");
		lblzubat.setIcon(new ImageIcon("img\\zubat2.jpg"));
		lblzubat.setBounds(301, 95, 200, 200);
		contentPane.add(lblzubat);
		
		
		JButton btnzubat = new JButton("Zubat");
		btnzubat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				status s2 = new status(player.getBag().get(1));
			}
		});
		btnzubat.setBounds(351, 319, 89, 23);
		contentPane.add(btnzubat);
		btnNewSeel.setBounds(100, 319, 89, 23);
		contentPane.add(btnNewSeel);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(420, 363, 89, 23);
		contentPane.add(btnCancel);
		
		JPanel panel = new JPanel();
		panel.setBounds(104, 11, 319, 73);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblMyPokemon = new JLabel("My Pokemon");
		lblMyPokemon.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMyPokemon.setBounds(87, 23, 204, 39);
		panel.add(lblMyPokemon);
		
		JLabel lbBG = new JLabel("");
		lbBG.setIcon(new ImageIcon("src\\img\\Bg.png"));
		lbBG.setBounds(0, -13, 541, 424);
		contentPane.add(lbBG);
		setVisible(true);
	}

}
