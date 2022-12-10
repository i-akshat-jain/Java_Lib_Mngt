package com.GUI.menu.Librarian;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class AllMembers extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton addUpdateButton;
	private String uName;
	private String name;
	private String surName;
	private String email;
	private String level;
	private JTextField addUserNameField;
	private JTextField addNameField;
	private JTextField addSurnameField;
	private JTextField addEmailField;
	Object[][] data = {{"RSharma", "Ram","Sharma", "rsharma@gmail.com"," UG"}, {"RSharma2", "Ramo","Sharma", "rsharma2@gmail.com"," PG"},
			{"RSharma3", "Ramu","Sharma", "rsharma3@gmail.com","staff"}};
	String[] columnNames={"User Name", "Name", "Surname", "Email", "Level"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllMembers frame = new AllMembers();
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
	
	public AllMembers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		DefaultTableModel model = new  DefaultTableModel(data, columnNames);
		contentPane.setLayout(null);
		table = new JTable(model);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(45, 31, 452, 289);
		getContentPane().add(scrollPane);
		
		JLabel addUserName = new JLabel("User Name");
		addUserName.setFont(new Font("Tahoma", Font.PLAIN, 10));
		addUserName.setBounds(22, 346, 93, 30);
		contentPane.add(addUserName);
		
		JLabel addName = new JLabel("Name");
		addName.setFont(new Font("Tahoma", Font.PLAIN, 10));
		addName.setBounds(22, 386, 93, 30);
		contentPane.add(addName);
		
		JLabel addSurname = new JLabel("Surname");
		addSurname.setFont(new Font("Tahoma", Font.PLAIN, 10));
		addSurname.setBounds(22, 426, 93, 30);
		contentPane.add(addSurname);
		
		JLabel addEmail = new JLabel("Email");
		addEmail.setFont(new Font("Tahoma", Font.PLAIN, 10));
		addEmail.setBounds(303, 346, 93, 30);
		contentPane.add(addEmail);
		
		JLabel addLevel = new JLabel("Level");
		addLevel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		addLevel.setBounds(303, 386, 93, 30);
		contentPane.add(addLevel);
		
		addUserNameField = new JTextField();
		addUserNameField.setBounds(104, 348, 169, 28);
		contentPane.add(addUserNameField);
		addUserNameField.setColumns(10);
		
		addNameField = new JTextField();
		addNameField.setColumns(10);
		addNameField.setBounds(104, 386, 169, 28);
		contentPane.add(addNameField);
		
		addSurnameField = new JTextField();
		addSurnameField.setColumns(10);
		addSurnameField.setBounds(104, 426, 169, 28);
		contentPane.add(addSurnameField);
		
		addEmailField = new JTextField();
		addEmailField.setColumns(10);
		addEmailField.setBounds(352, 348, 169, 28);
		contentPane.add(addEmailField);
		
		JComboBox addLevelBox = new JComboBox();
		addLevelBox.setModel(new DefaultComboBoxModel(new String[] {"UG", "PG", "Staff"}));
		addLevelBox.setBounds(352, 387, 169, 28);
		contentPane.add(addLevelBox);

		
		addUpdateButton = new JButton("Add");
		addUpdateButton.setBounds(319, 425, 77, 32);
		addUpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uName = addUserNameField.getText();
				name = addNameField.getText();
				surName = addSurnameField.getText();
				email = addEmailField.getText();
				level = (String)addLevelBox.getSelectedItem();
	
				if (addUserNameField.getText().toString().isEmpty() || addNameField.getText().toString().isEmpty() || addSurnameField.getText().toString().isEmpty() || 
						addEmailField.getText().toString().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill all the tieids","Error", JOptionPane. ERROR_MESSAGE);
				}
				else
				{
					System.out.println(uName+ " " +name+ " " +surName+ " " +email+ " " +level);
					Object[] newRow = {uName, name,surName,email,level};
					model.addRow(newRow);
					addUserNameField.setText("");
					addNameField.setText("");
					addSurnameField.setText("");
					addEmailField.setText("");
				}
				
				
			}
		});
		contentPane.add(addUpdateButton);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				uName = addUserNameField.getText();
				name = addNameField.getText();
				surName = addSurnameField.getText();
				email = addEmailField.getText();
				level = (String)addLevelBox.getSelectedItem();
	
				if (addUserNameField.getText().toString().isEmpty() || addNameField.getText().toString().isEmpty() || addSurnameField.getText().toString().isEmpty() || 
						addEmailField.getText().toString().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill all the tieids","Error", JOptionPane. ERROR_MESSAGE);
				}
				else
				{
					System.out.println(uName+ " " +name+ " " +surName+ " " +email+ " " +level);
					Object[] newRow = {uName, name,surName,email,level};
					//model.addRow(newRow);
					
					int row = table.getSelectedRow();

					model.setValueAt(uName, row, 0);
					model.setValueAt (name, row, 1);
					model.setValueAt (surName, row, 2);
					model.setValueAt (email, row, 3);
					model.setValueAt (level, row, 4);

					addUserNameField.setText(null);
					addNameField.setText(null);
					addSurnameField.setText(null);
					addEmailField.setText(null);
				}
				
				
			}
		});
		btnUpdate.setBounds(432, 425, 77, 32);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = new DefaultTableModel();
		        if(model.getRowCount() == -1){
		        	model.removeRow(table.getSelectedRow());
		            addUserNameField.setText("");
					addNameField.setText("");
					addSurnameField.setText("");
					addEmailField.setText("");
		           
		        }
		        else{
		        	if(table.getRowCount() == 0){
		        		JOptionPane.showMessageDialog(null, "Table is empty..","Error", JOptionPane.ERROR_MESSAGE);
		            }
		        	else{
		        		JOptionPane.showMessageDialog(null, "Please select a single row","Error", JOptionPane.ERROR_MESSAGE);
		        		}
		        };
		        }
		        	
		   });
		btnDelete.setBounds(319, 477, 77, 32);
		contentPane.add(btnDelete);
		validate();
		
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			int rowIndex =table.getSelectedRow();
			
			uName = (String)model.getValueAt(rowIndex, 0);
			name = (String)model.getValueAt(rowIndex, 1);
			surName = (String)model.getValueAt(rowIndex, 2);
			email =(String)model.getValueAt(rowIndex, 3);
			level = (String)model.getValueAt(rowIndex, 4);
			
			addUserNameField.setText(String. valueOf(uName));
			addNameField.setText(String. valueOf(name));
			addSurnameField.setText(String. valueOf(surName));
			addEmailField.setText(String. valueOf(email));
			addLevelBox.setSelectedItem(String. valueOf(level));
			}
			
		});
		
	}
}

