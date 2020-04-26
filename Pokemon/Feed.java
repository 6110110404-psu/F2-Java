import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Feed extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnnullBerry;
	private JRadioButton rare;
	private JRadioButton mix;
	private JButton btnok;
	private JLabel lblNew;
	private JLabel lblLv;
	private JLabel lblEle;
	private JLabel numL;
	private JLabel numC;
	private JLabel numW;
	private JLabel label;
	private JLabel imgP;
	private JPanel panel;
	private JButton btncancel;



	/**
	 * Create the frame.
	 */
	public Feed(Pokemon p,mixBerry mi,rareBerry ra,nullBerry nual) {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("img\\Berry.png"));
		setTitle("Berry");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		mix = new JRadioButton("Mix Berry");
		mix.setBackground(new Color(255, 255, 255));
		mix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mix.isSelected()) {
					rare.setSelected(false);
					rdbtnnullBerry.setSelected(false);
				}
				
			}
		});
		mix.setBounds(20, 140, 109, 23);
		contentPane.add(mix);
		
		rare = new JRadioButton("Rare Berry");
		rare.setBackground(new Color(255, 255, 255));
		rare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rare.isSelected()) {
					mix.setSelected(false);
					rdbtnnullBerry.setSelected(false);
				}
				
			}
		});
		rare.setBounds(144, 140, 109, 23);
		contentPane.add(rare);
		
		rdbtnnullBerry = new JRadioButton("Null Berry");
		rdbtnnullBerry.setBackground(new Color(255, 255, 255));
		rdbtnnullBerry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnnullBerry.isSelected()) {
					rare.setSelected(false);
					mix.setSelected(false);
				}
				
			}
		});
		rdbtnnullBerry.setBounds(268, 140, 109, 23);
		contentPane.add(rdbtnnullBerry);
		
		btnok = new JButton("OK");
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mix.isSelected()) {
					mi.useBerry(p);
				}
				else if(rare.isSelected()) {
					ra.useBerry(p);
				}
				else if(rdbtnnullBerry.isSelected()) {
					nual.useBerry(p);
				}
				lblNew.setText("HP:"+p.getHp());
				lblLv.setText("Lv:"+p.getLv());
				lblEle.setText("Element: "+p.getEle());

			}   
		});
		
		btncancel = new JButton("Cancel");
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btncancel.setBounds(411, 140, 89, 23);
		contentPane.add(btncancel);
		btnok.setBounds(411, 106, 89, 23);
		contentPane.add(btnok);
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(30, 11, 150, 63);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblLv = new JLabel("Lv:"+p.getLv());
		lblLv.setBounds(10, 20, 52, 14);
		panel.add(lblLv);
		
		lblNew = new JLabel("HP:"+p.getHp());
		lblNew.setBounds(10, 5, 71, 14);
		panel.add(lblNew);

		lblEle = new JLabel("Element:"+p.getEle());
		lblEle.setBounds(10, 35, 200, 14);
		panel.add(lblEle);
		
		label = new JLabel("");
		label.setBounds(10, 5, 71, 14);
		panel.add(label);
		
		imgP = new JLabel("");
		imgP.setIcon(new ImageIcon("src\\img\\source.gif"));
		imgP.setBounds(0, -31, 506, 223);
		contentPane.add(imgP);
		
		
		setVisible(true);
	}
}
