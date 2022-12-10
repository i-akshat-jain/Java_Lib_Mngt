package com.GUI.menu.Librarian;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class IssueBook extends JFrame {

	private JPanel contentPane;
	private JTextField issueISBNField;
	private JTextField issueUserNameField;
	private JTextField issueDateField;
	
	private int isbn;
	private String uName;
	private String level;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueBook frame = new IssueBook();
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
	public IssueBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 999, 678);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 985, 641);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel issueISBN = new JLabel("ISBN Number");
		issueISBN.setFont(new Font("Tahoma", Font.PLAIN, 18));
		issueISBN.setBounds(177, 143, 110, 23);
		panel.add(issueISBN);
		
		
		
		
		JLabel issueUserName = new JLabel("User Name");
		issueUserName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		issueUserName.setBounds(177, 194, 110, 23);
		panel.add(issueUserName);
		
		JLabel issueLevel = new JLabel("Level");
		issueLevel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		issueLevel.setBounds(177, 244, 110, 23);
		panel.add(issueLevel);
		
		JLabel issueDate = new JLabel("Issue Date");
		issueDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		issueDate.setBounds(177, 298, 110, 23);
		panel.add(issueDate);
		
		JLabel issueDueDate = new JLabel("Due Date");
		issueDueDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		issueDueDate.setBounds(177, 359, 110, 23);
		panel.add(issueDueDate);
		
		
		
		issueISBNField = new JTextField();
		issueISBNField.setBounds(322, 143, 320, 28);
		panel.add(issueISBNField);
		issueISBNField.setColumns(10);
		issueISBNField.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = issueISBNField.getText();
	            int l = value.length();
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
	            	issueISBNField.setEditable(true);	
	            } else {
	            	issueISBNField.setEditable(false);
	            }
	         }
	      });
		
		issueUserNameField = new JTextField();
		issueUserNameField.setColumns(10);
		issueUserNameField.setBounds(322, 194, 320, 28);
		panel.add(issueUserNameField);
		
		issueDateField = new JTextField();
		issueDateField.setColumns(10);
		issueDateField.setBounds(322, 299, 320, 28);
		panel.add(issueDateField);
		
		JComboBox issueLevelBox = new JComboBox();
		issueLevelBox.setModel(new DefaultComboBoxModel(new String[] {"UG", "PG", "Staff"}));
		issueLevelBox.setBounds(322, 244, 320, 28);
		panel.add(issueLevelBox);
		
		JLabel dueDate = new JLabel("dd-mm-yyyy");
		dueDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		dueDate.setBounds(322, 359, 164, 23);
		panel.add(dueDate);
		
		
		
		JButton issueSave = new JButton("Issue");
		issueSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SimpleDateFormat dFormat = new SimpleDateFormat("dd-mm-yyyy");
				
				uName = issueUserNameField.getText();
				isbn = Integer.parseInt(issueISBNField.getText());
				level = (String)issueLevelBox.getSelectedItem();
				String iDate = dFormat.format(issueDateField.getText());
				
				
//				dueDate.addKeyListener(new KeyAdapter() {
//			         public void keyPressed(KeyEvent ke) {
//			            int l = value.length();
//			            if (level == "UG") {
//			            	
//			            	dueDate.setEditable(true);
//			            	
//			            } else {
//			            	dueDate.setEditable(false);
//			            }
//			         }
//			      });
				
				System.out.println(uName+ " " +isbn+ " " +level + " " + iDate);
			}
		});
		issueSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		issueSave.setBounds(322, 428, 85, 30);
		panel.add(issueSave);
		
		JButton issueCancel = new JButton("Cancel");
		issueCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		issueCancel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		issueCancel.setBounds(557, 428, 85, 30);
		panel.add(issueCancel);
		
		
	}

}
