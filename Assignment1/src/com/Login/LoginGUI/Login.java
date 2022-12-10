package com.Login.LoginGUI;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import com.GUI.menu.Librarian.LibMainMenu;
import com.GUI.menu.Members.MemMainMenu;

public class Login extends JFrame {

	private JPanel contentPane;
	private static JLabel userLabel;
	private static JTextField UserTextF;
	private static JLabel passwordLabel;
	private static JButton loginButton;
	private static JLabel loggedIn;
	private JPasswordField passwordTextF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public boolean ReadCSV(String user) {
		String path = "C:/Users/Lenovo/eclipse-workspace/FirstCode/Assignment1/members.csv "; 
		String line = "";
		String divider = ",";
		user = "username";
		String[] userName = null;
		try {
			BufferedReader buff = new BufferedReader(new FileReader(path));
			while ((line = buff.readLine()) != null) {
				userName = line.split(divider);
//				System.out.println(userName);
				if(userName[0].equals(user)) {
					return true;
				}
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		return false;
		
			
	}
	
	public Login(){
//		Login login = new Login();
//		String userName = ReadCSV()
//		String[] userData = .userName;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 957, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0 , 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(84, 145, 171));
		panel.setBounds(0, 0, 943, 644);
		contentPane.add(panel);
		panel.setLayout(null);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordLabel.setBounds(216, 357, 121, 25);
		panel.add(passwordLabel);
		
		UserTextF = new JTextField();
		UserTextF.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		UserTextF.setFont(new Font("Tahoma", Font.PLAIN, 25));
		UserTextF.setBounds(351, 273, 270, 34);
		panel.add(UserTextF);
		UserTextF.setColumns(10);
		
		JLabel userLabel = new JLabel("User");
		userLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		userLabel.setBounds(234, 280, 80, 25);
		panel.add(userLabel);
		
		passwordTextF = new JPasswordField();
		passwordTextF.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordTextF.setBounds(351, 357, 270, 34);
		panel.add(passwordTextF);
		
		Button button = new Button("Log In");
		button.setBackground(new Color(92, 171, 84));
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user = UserTextF.getText();
				String password = passwordTextF.getText();
				
//				System.out.println(user + ", " + password);

				if(ReadCSV(user) == true && password.equals("user")) {
						try
				        {
							Login frame = new Login();
							frame.dispose();
							System.out.println("loggin Successful"); 
							MemMainMenu memMenuFrame = new MemMainMenu();
							memMenuFrame.setVisible(true);
							
				        }
				        catch (Exception ex)
				        {
				            ex.printStackTrace();
				        }
				}
				else if(user.equals("admin") && password.equals("admin")) {
					try
			        {
						Login frame = new Login();
						setVisible(false);
						System.out.println("loggin Successful"); 
						LibMainMenu libMenuFrame = new LibMainMenu();
						libMenuFrame.setVisible(true);
						
			        }
			        catch (Exception ex)
			        {
			            ex.printStackTrace();
			        }
				}
				else {
					System.out.println("loggin bnot Successful");
				}
				
			}
		});
		button.setBounds(370, 431, 121, 42);
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(button);
		
		
	}
}
