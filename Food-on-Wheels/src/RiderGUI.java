
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RiderGUI {

	public JFrame frame;
	public JPasswordField passwordField;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RiderGUI window = new RiderGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.y
	 */
	public RiderGUI() {
		//signUP();
		//menu();
		//login();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	 public void signUP() {
		frame = new JFrame();
		frame.setBounds(250, 250, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(64, 26, 96, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(64, 72, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mobile Number");
		lblNewLabel_2.setBounds(64, 125, 96, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Address");
		lblNewLabel_3.setBounds(64, 173, 74, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("password");
		lblNewLabel_4.setBounds(64, 225, 74, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(240, 222, 96, 20);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(240, 23, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(240, 69, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(240, 122, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(240, 170, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign UP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=textField.getText();
				String Id=textField_1.getText();
				String Number=textField_2.getText();
				String Address=textField_3.getText();
				String Password=passwordField.getText();
				
				Rider c=new Rider(Name,Number,Address,Password);
				c.getRider()[c.count]=c;
				System.out.println("*********Account Created Successfully*************");
				
				System.out.println("Name is " + c.getRider()[c.count].getName());
				System.out.println("ID is " + c.getRider()[c.count].getID());
				System.out.println("Mobile number is " +c.getRider()[c.count].getNumber());
				System.out.println("Address is " +c.getRider()[c.count].getAddress());
				System.out.println("password is " +c.getRider()[c.count].getPassword());
				c.count++;
				
				
			}
		});
		btnNewButton.setBounds(64, 286, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				menu();
			}
		});
		btnNewButton_1.setBounds(240, 286, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
	 
	 
	 void menu()
	 {
		 	frame = new JFrame();
			frame.setBounds(250, 250, 450, 450);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			JButton btnNewButton_2 = new JButton("Sign UP");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					signUP();
					
				}
			});
			btnNewButton_2.setBounds(155, 104, 89, 23);
			frame.getContentPane().add(btnNewButton_2);
			
			JButton btnNewButton_3 = new JButton("Login");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					login();
				}
			});
			btnNewButton_3.setBounds(155, 199, 89, 23);
			frame.getContentPane().add(btnNewButton_3);
			
			
			
	 }
	 
	 
	 void login()
	 {
		 	frame = new JFrame();
		 	Rider c=new Rider();
			c.getRider()[c.count]=c;
			frame.setBounds(250, 250, 450, 450);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			JButton btnNewButton_5 = new JButton("Login");
			btnNewButton_5.setBounds(54, 245, 89, 23);
			frame.getContentPane().add(btnNewButton_5);
			
			JLabel lblNewLabel_5 = new JLabel("ID");
			lblNewLabel_5.setBounds(54, 59, 49, 14);
			frame.getContentPane().add(lblNewLabel_5);
			
			JLabel lblNewLabel_6 = new JLabel("password");
			lblNewLabel_6.setBounds(54, 132, 82, 14);
			frame.getContentPane().add(lblNewLabel_6);
			
			textField_4 = new JTextField();
			textField_4.setBounds(251, 56, 96, 20);
			frame.getContentPane().add(textField_4);
			textField_4.setColumns(10);
			
			textField_5 = new JTextField();
			textField_5.setBounds(251, 129, 96, 20);
			frame.getContentPane().add(textField_5);
			textField_5.setColumns(10);
			
			JButton btnNewButton_4 = new JButton("Back");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					menu();
				}
			});
			btnNewButton_4.setBounds(258, 245, 89, 23);
			frame.getContentPane().add(btnNewButton_4);
			
			
	 }
}
