import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class status extends JFrame {

	private JPanel contentPane;
	Pokemon pokemon;
	private JTextField textSet;

	/**
	 * Create the frame.
	 */
	public status(Pokemon pokemon) {
		mixBerry B1=new mixBerry();
		rareBerry B2=new rareBerry();
		nullBerry B3=new nullBerry();
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\status.png"));
		setTitle("Status Pokemon");
		this.pokemon = pokemon;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 204);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 318, 143);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name: "+pokemon.getName());
		lblNewLabel_1.setBounds(10, 5, 156, 14);
		panel.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel = new JLabel("HP:" + pokemon.getHp());
		lblNewLabel.setBounds(10, 82, 73, 14);
		panel.add(lblNewLabel);
		
		JLabel lblLv = new JLabel("LV:"+pokemon.getLv());
		lblLv.setBounds(10, 57, 46, 14);
		panel.add(lblLv);
	
		
		JLabel lbGender = new JLabel("Gender: "+pokemon.getGender());
		lbGender.setBounds(10, 107, 126, 14);
		panel.add(lbGender);
		
		JLabel lbelement = new JLabel(pokemon.getEle());
		lbelement.setBounds(255, 5, 63, 14);
		panel.add(lbelement);
		
		JButton btnsetname = new JButton("Save");
		btnsetname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String namebox =  String.valueOf(textSet.getText());
				lblNewLabel_1 .setText("Name:"+ String.valueOf(namebox));
				textSet.setText("");
		    
			}
		});
		btnsetname.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnsetname.setIcon(null);
		btnsetname.setBounds(176, 28, 70, 24);
		panel.add(btnsetname);
		
		textSet = new JTextField();
		textSet.setBounds(71, 30, 95, 20);
		panel.add(textSet);
		textSet.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Edit name:");
		lblNewLabel_2.setBounds(10, 30, 73, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnFeedBerry = new JButton("Feed ");
		btnFeedBerry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Feed feed=new Feed(pokemon,B1,B2,B3);	
			}
		});
		btnFeedBerry.setBounds(219, 109, 89, 23);
		panel.add(btnFeedBerry);
		setVisible(true);
		
	}



}