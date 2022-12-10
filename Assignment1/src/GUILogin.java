import javax.swing.*;
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;


public class GUILogin implements ActionListener{

	
	private static JLabel userLabel;
	private static JTextField UserTextF;
	private static JLabel passwordLabel;
	private static JPasswordField passwordTextF;
	private static JButton loginButton;
	private static JLabel loggedIn;
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame 	frame = new JFrame();
		JPanel panel = new JPanel();

		frame.setSize(300,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10,20,80,25);
		panel.add(userLabel);
		
		UserTextF = new JTextField(20);
		UserTextF.setBounds(100,20,165,25);
		panel.add(UserTextF);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10,50,80,25);
		panel.add(passwordLabel);
		
		passwordTextF = new JPasswordField(20);
		passwordTextF.setBounds(100,50,180,25);
		passwordTextF.setSize(180,25);
		panel.add(passwordTextF);
		
		
		loginButton = new JButton("LogIn");
		//loginButton.setBounds(10,80,80,25);
		loginButton.setSize(80,25);
		loginButton.setLocation(10,80);
		loginButton.addActionListener(new GUILogin());
		panel.add(loginButton);
		
		loggedIn = new JLabel("LogIn");
		//loggedIn.setBounds(10,110,80,25);	
		loggedIn.setSize(80,25);
		loggedIn.setLocation(10,110);
		panel.add(loggedIn);

		
		frame.setVisible(true);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = UserTextF.getText();
		String password = passwordTextF.getText();
		
		System.out.println(user + ", " + password);
		
		if (user.equals("admin") && password.equals("admin")) {
			loggedIn.setText("loggin Successful");
		}
		
	}

}
