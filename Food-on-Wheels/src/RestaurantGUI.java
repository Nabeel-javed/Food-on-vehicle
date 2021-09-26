
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class RestaurantGUI {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantGUI window = new RestaurantGUI();
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
	public RestaurantGUI() {
		//mainmenu();
		//Restaurant2();
		//Restaurant1();
		//Restaurantoptions();
		//createaccount();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	 void mainmenu() {
		frame = new JFrame("Butt Karahi");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnNewButton = new JButton("Restaurant 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Restaurant1();
			}
		});
		btnNewButton.setBounds(146, 38, 133, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Restaurant 2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Restaurant2();
			}
		});
		btnNewButton_1.setBounds(146, 106, 133, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_2.setBounds(146, 170, 133, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
	
	
	void Restaurant2()
	{
		frame = new JFrame("Menu");
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nihari");
		lblNewLabel.setBounds(21, 22, 49, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("kabili kabab");
		lblNewLabel_1.setBounds(113, 22, 82, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("haleem");
		lblNewLabel_2.setBounds(205, 22, 49, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("biryani");
		lblNewLabel_3.setBounds(325, 22, 49, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("karahi");
		lblNewLabel_4.setBounds(21, 70, 49, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Halwa Puri");
		lblNewLabel_5.setBounds(21, 129, 101, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Korma");
		lblNewLabel_6.setBounds(113, 70, 49, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Channay");
		lblNewLabel_7.setBounds(205, 70, 49, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Pulao");
		lblNewLabel_8.setBounds(325, 70, 49, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Kheer");
		lblNewLabel_9.setBounds(113, 129, 49, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Kabab");
		lblNewLabel_10.setBounds(205, 129, 49, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Sajji");
		lblNewLabel_11.setBounds(325, 129, 49, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Channa chat");
		lblNewLabel_12.setBounds(21, 194, 82, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Fruit chatt");
		lblNewLabel_13.setBounds(113, 194, 82, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Rice");
		lblNewLabel_14.setBounds(205, 194, 49, 14);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Daal");
		lblNewLabel_15.setBounds(325, 194, 49, 14);
		frame.getContentPane().add(lblNewLabel_15);
		
		JButton btnNewButton_3 = new JButton("Go Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				mainmenu();
			}
		});
		btnNewButton_3.setBounds(157, 229, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_13 = new JButton("Restaurant Menu");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Restaurantoptions();
			}
		});
		btnNewButton_13.setBounds(135, 291, 170, 23);
		frame.getContentPane().add(btnNewButton_13);
		frame.setVisible(true);
	}

	
	
	void Restaurant1()
	{
		frame = new JFrame("Menu");
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nihari");
		lblNewLabel.setBounds(21, 22, 49, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("kabili kabab");
		lblNewLabel_1.setBounds(113, 22, 82, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("haleem");
		lblNewLabel_2.setBounds(205, 22, 49, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("biryani");
		lblNewLabel_3.setBounds(325, 22, 49, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("karahi");
		lblNewLabel_4.setBounds(21, 70, 49, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Halwa Puri");
		lblNewLabel_5.setBounds(21, 129, 101, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Korma");
		lblNewLabel_6.setBounds(113, 70, 49, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Channay");
		lblNewLabel_7.setBounds(205, 70, 49, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Pulao");
		lblNewLabel_8.setBounds(325, 70, 49, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Kheer");
		lblNewLabel_9.setBounds(113, 129, 49, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Kabab");
		lblNewLabel_10.setBounds(205, 129, 49, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Sajji");
		lblNewLabel_11.setBounds(325, 129, 49, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Channa chat");
		lblNewLabel_12.setBounds(21, 194, 82, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Fruit chatt");
		lblNewLabel_13.setBounds(113, 194, 82, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Rice");
		lblNewLabel_14.setBounds(205, 194, 49, 14);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Daal");
		lblNewLabel_15.setBounds(325, 194, 49, 14);
		frame.getContentPane().add(lblNewLabel_15);
		
		JButton btnNewButton_3 = new JButton("Go Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				mainmenu();
			}
		});
		btnNewButton_3.setBounds(157, 229, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_14 = new JButton("Restaurant Options");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Restaurantoptions();
			}
		});
		btnNewButton_14.setBounds(91, 316, 251, 23);
		frame.getContentPane().add(btnNewButton_14);
		frame.setVisible(true);
	}
	
	
	void Restaurantoptions()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JButton btnNewButton_4 = new JButton("Create Account");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				createaccount();
			}
		});
		btnNewButton_4.setBounds(10, 11, 159, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Login");
		btnNewButton_5.setBounds(10, 66, 159, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Add food details");
		btnNewButton_6.setBounds(10, 126, 159, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Update food details");
		btnNewButton_7.setBounds(10, 191, 159, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Delete food");
		btnNewButton_8.setBounds(213, 11, 213, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Check food order");
		btnNewButton_9.setBounds(213, 66, 213, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("Update food delivery Status");
		btnNewButton_10.setBounds(213, 126, 213, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("Calculate Bills");
		btnNewButton_11.setBounds(213, 191, 213, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("Exit");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_12.setBounds(158, 286, 89, 23);
		frame.getContentPane().add(btnNewButton_12);
		
	}
	
	void createaccount()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel_16 = new JLabel("Restaurant name");
		lblNewLabel_16.setBounds(33, 36, 96, 14);
		frame.getContentPane().add(lblNewLabel_16);
		
		textField = new JTextField();
		textField.setBounds(244, 33, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Manager Name");
		lblNewLabel_17.setBounds(33, 94, 96, 14);
		frame.getContentPane().add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Email address");
		lblNewLabel_18.setBounds(33, 150, 96, 14);
		frame.getContentPane().add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("phone number");
		lblNewLabel_19.setBounds(33, 217, 96, 14);
		frame.getContentPane().add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("password");
		lblNewLabel_20.setBounds(33, 279, 96, 14);
		frame.getContentPane().add(lblNewLabel_20);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(244, 276, 96, 20);
		frame.getContentPane().add(passwordField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(244, 214, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(244, 147, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(244, 91, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_15 = new JButton("SignUP");
		btnNewButton_15.setBounds(147, 336, 89, 23);
		frame.getContentPane().add(btnNewButton_15);
		frame.setVisible(true);
	}
}
