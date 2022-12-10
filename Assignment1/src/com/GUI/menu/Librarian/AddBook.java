package com.GUI.menu.Librarian;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.*;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Point;

public class AddBook extends JFrame {

	private JPanel contentPane;
	private JTextField addTitleField;
	private JTextField addAuthorField;
	private JTextField addPublisherField;
	private JTextField addPubYearField;
	private JTextField addISBNField;
	private JTextField addTotalBooksField;
	
	 private String title;
	 private String author;
	 private String publisher;
	 private String pubYear;
	 private int isbn;
	 private int tBooks;
	 
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
				
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBook frame = new AddBook();
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
	public AddBook() {
		setLocation(new Point(325, 125));
		
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
		
		JLabel addTitle = new JLabel("Title");
		addTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addTitle.setBounds(173, 129, 93, 30);
		panel.add(addTitle);
		
		JLabel addAuthor = new JLabel("Author");
		addAuthor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addAuthor.setBounds(173, 179, 93, 30);
		panel.add(addAuthor);
		
		JLabel addPublisher = new JLabel("Publisher");
		addPublisher.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addPublisher.setBounds(173, 233, 93, 30);
		panel.add(addPublisher);
		
		JLabel addPubYear = new JLabel("Year Publ.");
		addPubYear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addPubYear.setBounds(173, 288, 93, 30);
		panel.add(addPubYear);
		
		JLabel addISBN = new JLabel("ISBN No.");
		addISBN.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addISBN.setBounds(173, 345, 93, 30);
		panel.add(addISBN);
		
		addTitleField = new JTextField();
		addTitleField.setBounds(341, 129, 302, 28);
		panel.add(addTitleField);
		addTitleField.setColumns(10);
		
		addAuthorField = new JTextField();
		addAuthorField.setColumns(10);
		addAuthorField.setBounds(341, 181, 302, 28);
		panel.add(addAuthorField);
		
		addPublisherField = new JTextField();
		addPublisherField.setColumns(10);
		addPublisherField.setBounds(341, 233, 302, 28);
		panel.add(addPublisherField);
		
		addPubYearField = new JTextField();
		addPubYearField.setColumns(10);
		addPubYearField.setBounds(341, 288, 302, 28);
		panel.add(addPubYearField);
		
		addPubYearField.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = addPubYearField.getText();
	            int l = value.length();
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
	            	addTotalBooksField.setEditable(true);
	            } else {
	            	addPubYearField.setEditable(false);
	            }
	         }
	      });
		
		addISBNField = new JTextField();
		addISBNField.setColumns(10);
		addISBNField.setBounds(341, 345, 302, 28);
		panel.add(addISBNField);
		addISBNField.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = addISBNField.getText();
	            int l = value.length();
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
	            	addISBNField.setEditable(true);
	            	
	            } else {
	            	addISBNField.setEditable(false);
	            }
	         }
	      });
		JLabel addTotalBooks = new JLabel("Total Books");
		addTotalBooks.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addTotalBooks.setBounds(173, 401, 93, 30);
		panel.add(addTotalBooks);
		
		addTotalBooksField = new JTextField();
		addTotalBooksField.setColumns(10);
		addTotalBooksField.setBounds(341, 401, 302, 28);
		panel.add(addTotalBooksField);
		addTotalBooksField.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = addTotalBooksField.getText();
	            int l = value.length();
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
	            	addTotalBooksField.setEditable(true);
	            } else {
	            	addTotalBooksField.setEditable(false);
	            }
	         }
	      });
		
		
		
		JButton addSave = new JButton("Save");
		addSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SimpleDateFormat dFormat = new SimpleDateFormat("yyyy");
				
				
				title = addTitleField.getText();
				author = addAuthorField.getText();
				publisher = addPublisherField.getText(); 
				pubYear = dFormat.format(addPubYearField.getText());
				isbn = Integer.parseInt(addISBNField.getText());
				tBooks = Integer.parseInt(addTotalBooksField.getText());
				System.out.println(title+ " " +author+ " " +publisher+ " " +pubYear+ " " +isbn+ " " +tBooks );
			}
		});
		addSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		addSave.setBounds(341, 467, 85, 30);
		panel.add(addSave);
		
		JButton addCancle = new JButton("Cancel");
		addCancle.setLocation(new Point(325, 120));
		addCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		addCancle.setFont(new Font("Tahoma", Font.PLAIN, 17));
		addCancle.setBounds(558, 467, 85, 30);
		panel.add(addCancle);

		
	
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
