package com.GUI.menu.Librarian;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.GUI.menu.Members.MemMainMenu;
import com.Login.LoginGUI.Login;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class LibMainMenu extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibMainMenu frame = new LibMainMenu();
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
	public LibMainMenu() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		setSize(1000,1000);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("All Member");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
		        {
					System.out.println("Add book Successful"); 
					AllMembers allMembersFrame = new AllMembers();
					allMembersFrame.setVisible(true);
					
		        }
		        catch (Exception ex)
		        {
		            ex.printStackTrace();
		        }
			}
		});
		btnNewButton_1.setBounds(25, 53, 104, 37);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New Book");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
		        {
					System.out.println("Add book Successful"); 
					AllMembers allMembersFrame = new AllMembers();
					allMembersFrame.setVisible(true);
					
		        }
		        catch (Exception ex)
		        {
		            ex.printStackTrace(); 
		        }
			}
		});
		btnNewButton_1_1.setBounds(25, 119, 104, 37);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Issue Book");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
		        {
					System.out.println("Issue book Successful"); 
					IssueBook issueBookFrame = new IssueBook();
					issueBookFrame.setVisible(true);
					
		        }
		        catch (Exception ex)
		        {
		            ex.printStackTrace(); 
		        }
			}
		});
		btnNewButton_1_1_1.setBounds(25, 189, 104, 37);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("Return Book");
		btnNewButton_1_1_2.setBounds(25, 261, 104, 37);
		panel.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_2_1 = new JButton("Search");
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_2_1.setBounds(25, 329, 104, 37);
		panel.add(btnNewButton_1_1_2_1);
		

		
		
		
	}
}
