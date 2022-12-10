package com.GUI.menu.Librarian;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;
import javax.swing.DefaultComboBoxModel;

public class AddMember extends JFrame {

	private JPanel contentPane;
	private JTextField addUserNameField;
	private JTextField addNameField;
	private JTextField addSurnameField;
	private JTextField addEmailField;
	
	private String uName;
	private String name;
	private String surName;
	private String email;
	private String level;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMember frame = new AddMember();
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
	public AddMember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 990, 661);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 976, 624);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel addUserName = new JLabel("User Name");
		addUserName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addUserName.setBounds(173, 129, 93, 30);
		panel.add(addUserName);
		
		JLabel addName = new JLabel("Name");
		addName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addName.setBounds(173, 179, 93, 30);
		panel.add(addName);
		
		JLabel addSurname = new JLabel("Surname");
		addSurname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addSurname.setBounds(173, 233, 93, 30);
		panel.add(addSurname);
		
		JLabel addEmail = new JLabel("Email");
		addEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addEmail.setBounds(173, 288, 93, 30);
		panel.add(addEmail);
		
		JLabel addLevel = new JLabel("Level");
		addLevel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addLevel.setBounds(173, 345, 93, 30);
		panel.add(addLevel);
		
		addUserNameField = new JTextField();
		addUserNameField.setBounds(341, 129, 302, 28);
		panel.add(addUserNameField);
		addUserNameField.setColumns(10);
		
		addNameField = new JTextField();
		addNameField.setColumns(10);
		addNameField.setBounds(341, 181, 302, 28);
		panel.add(addNameField);
		
		addSurnameField = new JTextField();
		addSurnameField.setColumns(10);
		addSurnameField.setBounds(341, 233, 302, 28);
		panel.add(addSurnameField);
		
		addEmailField = new JTextField();
		addEmailField.setColumns(10);
		addEmailField.setBounds(341, 288, 302, 28);
		panel.add(addEmailField);
		
		JComboBox addLevelBox = new JComboBox();
		addLevelBox.setModel(new DefaultComboBoxModel(new String[] {"UG", "PG", "Staff"}));
		addLevelBox.setBounds(341, 345, 302, 28);
		panel.add(addLevelBox);
		
		JButton addSave = new JButton("Save");
		addSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uName = addUserNameField.getText();
				name = addNameField.getText();
				surName = addSurname.getText();
				email = addEmail.getText();
				level = (String)addLevelBox.getSelectedItem();
				
				System.out.println(uName+ " " +name+ " " +surName+ " " +email+ " " +level);
				AllMembers am = new AllMembers();
				am.MemberData(uName,name,surName,email,level);
				setVisible(false);
				
				
//				Object[] newRow = {uName,name,surName,email,level};
//				DefaultTableModel model = new  DefaultTableModel(data, columnNames);
//				AllMembers allMembersData = new AllMembers();
//				allMembersData.model.addRow(newRow);
			}
		});
		addSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addSave.setBounds(341, 422, 85, 30);
		panel.add(addSave);
		
		JButton addCancle = new JButton("Cancel");
		addCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		addCancle.setFont(new Font("Tahoma", Font.PLAIN, 17));
		addCancle.setBounds(558, 422, 85, 30);
		panel.add(addCancle);
	}
}
