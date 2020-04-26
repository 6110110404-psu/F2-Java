import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class catchpokemon extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<Pokemon> bag ;
    private Scanner sc;
	private Player player;
	private JLabel showPoint;
	
	/**
	 * Create the frame.
	 */
	public catchpokemon(Player player) {

		this.player = player;
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\catch.png"));
		setTitle("Catch Pokemon");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 900, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("Catch Pokemon!");
		lbl1.setForeground(Color.BLACK);
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl1.setBounds(350, 100, 159, 25);
		contentPane.add(lbl1);

		JLabel point = new JLabel("Point: "+ player.getPoint());
		point.setForeground(Color.BLACK);
		point.setFont(new Font("Tahoma", Font.PLAIN, 20));
		point.setBounds(380, 200, 159, 25);
		contentPane.add(point);
		
				
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        int pokemonNumber =(int)(Math.random()*5);
        for (int i =0;i<6;++i){
            int type =(int)(Math.random()*6);
            if(type == 0){
                pokemons.add(new Seel("Starmy"));
            }
            else if(type == 1){
                pokemons.add(new zubat("pickachu"));
			}
			else if(type == 2){
                pokemons.add(new zubat("kabigon"));
			}
			else if(type == 3){
                pokemons.add(new zubat("Raichu"));
			}
			else if(type == 4){
                pokemons.add(new zubat("Butterfly"));
			}
			else if(type == 5){
                pokemons.add(new zubat("Dipto"));
            }   
                   
        }
        
        /*JLabel lbl2 = new JLabel("Pokmon around you");
        lbl2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbl2.setForeground(Color.WHITE);
		lbl2.setBounds(23, 39, 159, 14);
		contentPane.add(lbl2);*/
		
		JLabel lblP1 = new JLabel(""+pokemons.get(pokemonNumber));
		lblP1.setForeground(Color.WHITE);
		lblP1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblP1.setBounds(300, 250, 389, 82);
		contentPane.add(lblP1);
		
		
		JButton btnAtt = new JButton("Catch");
		btnAtt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =(int)Math.floor(Math.random()*2);
				if(i==0) {
					
					JOptionPane.showMessageDialog(btnAtt, "Catch (point+1)");
					player.IncreasePoint(1);
					System.out.println("current point: "+player.getPoint());
					point.setText("Point:"+player.getPoint());
						if(player.getPoint() == 2){
							JOptionPane.showMessageDialog(btnAtt, "You are beginner Triner");
						}else if(player.getPoint() == 5){
							JOptionPane.showMessageDialog(btnAtt, "You are Triner");
						}else if(player.getPoint() == 10){
							JOptionPane.showMessageDialog(btnAtt, "You are Pokemon master");
						}
				}
				else if(i==1) {
					JOptionPane.showMessageDialog(btnAtt,"Failed");
				}
			}
		});
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(275, 350, 89, 23);
		contentPane.add(btnNewButton);
		btnAtt.setBounds(475, 350, 89, 23);
		contentPane.add(btnAtt);
		
		JPanel panel = new JPanel();
		panel.setBounds(345, 100, 159, 25);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img\\blue2.png"));
		lblNewLabel.setBounds(0, 0,900, 800);
		contentPane.add(lblNewLabel);
		            
        		
		setVisible(true);
	}
}
