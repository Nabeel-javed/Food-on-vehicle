
import java.awt.EventQueue;                                                                                      

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;

public class mainGUI {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton;
	private JButton btnNewButton_11;
	private JButton btnNewButton_9;
	private JButton btnNewButton_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainGUI window = new mainGUI();
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
	public mainGUI() {
		//login();
		//signup();
		mainmenu();
		//customermenu();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void signup() {
		frame = new JFrame("Account Creation Form");
		frame.setBounds(450, 450, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(51, 29, 49, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(51, 64, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(51, 105, 79, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mobile Number");
		lblNewLabel_3.setBounds(51, 144, 128, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Adress");
		lblNewLabel_4.setBounds(51, 186, 79, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(205, 26, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 61, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(205, 102, 96, 20);
		frame.getContentPane().add(passwordField);
		
		textField_2 = new JTextField();
		textField_2.setBounds(205, 141, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(205, 183, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Balance");
		lblNewLabel_5.setBounds(51, 221, 79, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(205, 218, 96, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		btnNewButton = new JButton("Register ");
		btnNewButton.setBounds(51, 281, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_9 = new JButton("Back");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				customermenu();
			}
		});
		btnNewButton_9.setBounds(205, 281, 89, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		
	}
	
	

	
	
	public void login()
	{
			frame = new JFrame("Login form");
			frame.setBounds(200, 200, 350, 350);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			
			JLabel lblNewLabel_1 = new JLabel("ID");
			lblNewLabel_1.setBounds(65, 55, 49, 14);
			frame.getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Password");
			lblNewLabel_2.setBounds(62, 91, 79, 14);
			frame.getContentPane().add(lblNewLabel_2);
			
			textField = new JTextField();
			textField.setBounds(172, 52, 96, 20);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			
			passwordField = new JPasswordField();
			passwordField.setBounds(172, 91, 96, 20);
			frame.getContentPane().add(passwordField);
			
			
			
			btnNewButton = new JButton("Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String id=textField.getText();
					String pass=passwordField.getText();
					Customer c=new Customer();
					int Count =0;
					for(int i=0; i<60; i++)
					{
						System.out.println("hhahha");
							if(c.getCustomer()[i].Id.equals(id))
							{
								System.out.println("Enter the password: ");
								
								if(c.getCustomer()[i].Password.equals(pass))
								{
									System.out.println("Welcome: ");
									System.out.println(c.getCustomer()[i].Name);
								}
								
							}

							else if(i==c.count-1)
							{
								System.out.println("Incorrect id--- ");
							}
					}
					
				}
			});
			btnNewButton.setBounds(65, 210, 89, 23);
			frame.getContentPane().add(btnNewButton);
			
			btnNewButton_12 = new JButton("Back");
			btnNewButton_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					customermenu();
				}
			});
			btnNewButton_12.setBounds(172, 210, 89, 23);
			frame.getContentPane().add(btnNewButton_12);
			
			
		}
	
	
	
	public void mainmenu()
	{
		frame = new JFrame("Butt karahi");
		frame.setBounds(200, 200, 350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JButton btnNewButton_1 = new JButton("Customer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				frame.dispose();
				customermenu();
			}
		});
		btnNewButton_1.setBounds(104, 38, 141, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Rider");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				RiderGUI nr = new RiderGUI();
				frame.dispose();
				nr.menu();
				frame.dispose();
				
			}
		});
		btnNewButton_2.setBounds(104, 98, 141, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
		JButton btnNewButton_3 = new JButton("Restaurant");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				RestaurantGUI obj = new RestaurantGUI();
				frame.dispose();
				obj.mainmenu();
				
			}
		});
		btnNewButton_3.setBounds(104, 164, 141, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Admin");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				adminGUI obj = new adminGUI();
				obj.menu();
				
			}
		});
		btnNewButton_4.setBounds(104, 220, 141, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Exit");
		btnNewButton_5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		frame.dispose();
			}
		});
		btnNewButton_5.setBounds(104, 279, 141, 23);
		frame.getContentPane().add(btnNewButton_5);
		
	}
	
	void customermenu()
	{
		frame = new JFrame("Customer menu Form");
		frame.setBounds(450, 450, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		JButton btnNewButton_6 = new JButton("Signup");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				signup();
			}
		});
		btnNewButton_6.setBounds(149, 60, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Login");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				login();
			}
		});
		btnNewButton_7.setBounds(149, 143, 89, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Exit");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.dispose();
			}
		});
		btnNewButton_8.setBounds(149, 226, 89, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		
		
		
		
	}
}
