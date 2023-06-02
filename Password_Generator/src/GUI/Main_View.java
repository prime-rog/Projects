package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Password.Generate_pass;
import Password.pass_strength;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main_View extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private boolean UC;
	private boolean LC;
	private boolean SC;
	private boolean NC;

	public Main_View() {
		setResizable(false);
		setTitle("PassWord_Generator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 966, 699);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Password Generator");
		lblNewLabel.setBounds(194, 10, 594, 47);
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Generate Password");
		lblNewLabel_1.setFont(new Font("STXinwei", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(64, 123, 201, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Check Password");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("STXinwei", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(653, 123, 201, 47);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(653, 251, 215, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Your Password");
		lblNewLabel_3.setFont(new Font("STZhongsong", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(657, 202, 197, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Your Password Strength is ");
		lblNewLabel_4.setFont(new Font("Segoe UI Historic", Font.PLAIN, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(642, 357, 237, 47);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setFont(new Font("STZhongsong", Font.PLAIN, 15));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(672, 433, 167, 21);
		contentPane.add(lblNewLabel_11);
		
		JButton btnNewButton = new JButton("CHECK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
				new pass_strength(s , lblNewLabel_11);
			}
		});
		btnNewButton.setBounds(715, 297, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Select Features Of Your Password:");
		lblNewLabel_5.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(64, 208, 324, 47);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Uppercase");
		lblNewLabel_6.setFont(new Font("STZhongsong", Font.PLAIN, 15));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(33, 276, 162, 19);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Lowercase");
		lblNewLabel_7.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(33, 327, 162, 19);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Special Characters");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(43, 376, 152, 19);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Numeric");
		lblNewLabel_9.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(56, 419, 131, 27);
		contentPane.add(lblNewLabel_9);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(212, 277, 93, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(212, 324, 93, 21);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setBounds(212, 373, 93, 21);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("");
		chckbxNewCheckBox_3.setBounds(212, 420, 93, 21);
		contentPane.add(chckbxNewCheckBox_3);
		
		
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(203, 582, 152, 22);
		contentPane.add(lblNewLabel_12);
		
		JButton btnNewButton_1 = new JButton("Generate");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UC = chckbxNewCheckBox.isSelected();
				LC = chckbxNewCheckBox_1.isSelected();
				SC = chckbxNewCheckBox_2.isSelected();
				NC = chckbxNewCheckBox_3.isSelected();
				
				new Generate_pass(UC , LC , SC , NC , lblNewLabel_12);
			}
		});
		btnNewButton_1.setFont(new Font("STXinwei", Font.PLAIN, 15));
		btnNewButton_1.setBounds(110, 488, 138, 36);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_10 = new JLabel("Your Password : ");
		lblNewLabel_10.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(43, 577, 152, 27);
		contentPane.add(lblNewLabel_10);
		
		
		setVisible(true);
	}
}
