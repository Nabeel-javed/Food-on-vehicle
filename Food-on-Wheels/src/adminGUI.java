
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class adminGUI {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminGUI window = new adminGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public adminGUI() {
		menu();
		//login();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	 void menu() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				login();
			}
		});
		btnNewButton.setBounds(156, 66, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(156, 151, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
	 
	 void login()
	 {
		 	frame = new JFrame();
			frame.setBounds(100, 100, 450, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			JLabel lblNewLabel = new JLabel("ID");
			lblNewLabel.setBounds(62, 36, 49, 14);
			frame.getContentPane().add(lblNewLabel);
			
			textField = new JTextField();
			textField.setBounds(236, 30, 96, 20);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("password");
			lblNewLabel_1.setBounds(62, 102, 84, 14);
			frame.getContentPane().add(lblNewLabel_1);
			
			passwordField = new JPasswordField();
			passwordField.setBounds(236, 99, 84, 20);
			frame.getContentPane().add(passwordField);
			
			JButton btnNewButton_2 = new JButton("Login");
			btnNewButton_2.setBounds(141, 151, 89, 23);
			frame.getContentPane().add(btnNewButton_2);
			
			JButton btnNewButton_3 = new JButton("Back");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					menu();
				}
			});
			btnNewButton_3.setBounds(141, 202, 89, 23);
			frame.getContentPane().add(btnNewButton_3);
			frame.setVisible(true);
			
	 }
	 

}
