import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class MainGames extends JFrame {
    private JPanel contentPane;

	public MainGames() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\Logo.png"));
		setTitle("Pokemon");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 900, 800);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
        JLabel lblWelcome = new JLabel("Pokemon");
		lblWelcome.setBackground(Color.BLACK);
		lblWelcome.setForeground(Color.BLACK);
		lblWelcome.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 60));
		//lblWelcome.setBounds(300, 200, 400, 84);
		lblWelcome.setBounds(325, 200, 360, 84);
		contentPane.add(lblWelcome);
		
		JButton btPlay = new JButton("PLAY");
		btPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start startstage = new Start();	
			}
        });
        
        btPlay.setBounds(400, 300, 102, 37);
		contentPane.add(btPlay);
		
		JLabel lbFirst = new JLabel("");
		lbFirst.setIcon(new ImageIcon("img\\backgroung.jpg"));
		lbFirst.setBounds(0, 0, 900, 800);
		contentPane.add(lbFirst);
		
		//JLabel lbBackground = new JLabel("");
		//lbBackground.setFont(new Font("Tahoma", Font.PLAIN, 18));
		//lbBackground.setIcon(new ImageIcon("src\\img\\background.jpg"));
		//lbBackground.setBounds(-17, -14, 828, 407);
		//contentPane.add(lbBackground);
		
		 setVisible(true);
	}
}