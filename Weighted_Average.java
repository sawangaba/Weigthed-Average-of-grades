
import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JButton;

import java.awt.Font;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import javax.swing.JTable;

import javax.swing.JFormattedTextField;

import javax.swing.JComboBox;

import javax.swing.JLabel;

import java.util.*;

import javax.swing.JTextField;

public class Weighted_Average {

	private JFrame frame;

	//private JTextField gradeC1;

	private JTextField gradeC2;

	private JTextField textField_2;

	private JTextField gradeC4;

	private JTextField percentW1;

	private JTextField percentW2;

	private JTextField percentW3;

	private JTextField percentW4;

	private JTextField totalCalculation;

	private JTextField textField;

	/**
	 * 
	 * Launch the application.
	 * 
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					Weighted_Average window = new Weighted_Average();

					window.frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	/**
	 * 
	 * Create the application.
	 * 
	 */

	public Weighted_Average() {

		initialize();

	}

	/**
	 * 
	 * Initialize the contents of the frame.
	 * 
	 */

	private void initialize() {

		frame = new JFrame();

		frame.setBounds(100, 100, 475, 300);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Grade Avg. 1");

		lblNewLabel.setBounds(17, 28, 80, 16);

		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Grade Avg. 2");

		lblNewLabel_1.setBounds(17, 60, 80, 16);

		frame.getContentPane().add(lblNewLabel_1);

		JLabel gradeC3 = new JLabel("Grade Avg. 3");

		gradeC3.setBounds(17, 99, 117, 16);

		frame.getContentPane().add(gradeC3);

		JLabel lblNewLabel_3 = new JLabel("Grade Avg. 4");

		lblNewLabel_3.setBounds(17, 139, 117, 16);

		frame.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Find Weighted Average");

		lblNewLabel_4.setBounds(148, 6, 143, 16);

		frame.getContentPane().add(lblNewLabel_4);

		JButton btnNewButton = new JButton("Exit");

		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}

		});

		btnNewButton.setBounds(60, 222, 117, 29);

		frame.getContentPane().add(btnNewButton);

		final JButton calculate = new JButton("Calculate");

		calculate.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				// fetching the values from text fields and storing them into variables.
				double a1 = Double.parseDouble(textField.getText());
				double a2 = Double.parseDouble(gradeC2.getText());
				double a3 = Double.parseDouble(textField_2.getText());
				double a4 = Double.parseDouble(gradeC4.getText());
				double pw1 = Double.parseDouble(percentW1.getText());
				double pw2 = Double.parseDouble(percentW2.getText());
				double pw3 = Double.parseDouble(percentW3.getText());
				double pw4 = Double.parseDouble(percentW4.getText());
				
				// initializing some other variables for calculations
				double sum = 0;
				double m1 = 0;
				double m2 = 0;
				double m3 = 0;
				double m4 = 0;
				
				// first convert side A to percentages:
				a1 = a1/100;
				a2 = a2/100;
				a3 = a3/100;
				a4 = a4/100;
				
				// then multiply side A by side B
				
				m1 = a1*pw1;
				m2 = a2*pw2;
				m3 = a3*pw3;
				m4 = a4*pw4;
				
				// then add the multiplied results
				
				sum = m1+m2+m3+m4;
				
				// convert to sum into percentage or move the decimal to 2 places right.
				sum = sum*100;
				
				// print the result in result text field.
				
				
				totalCalculation.setText(Double.toString(sum));
				
				
				
				

			}

		});

		calculate.setBounds(230, 222, 117, 29);

		frame.getContentPane().add(calculate);

		gradeC2 = new JTextField();

		gradeC2.setBounds(109, 55, 68, 26);

		frame.getContentPane().add(gradeC2);

		gradeC2.setColumns(10);

		textField_2 = new JTextField();

		textField_2.setBounds(109, 94, 68, 26);

		frame.getContentPane().add(textField_2);

		textField_2.setColumns(10);

		gradeC4 = new JTextField();

		gradeC4.setBounds(109, 134, 68, 26);

		frame.getContentPane().add(gradeC4);

		gradeC4.setColumns(10);

		percentW1 = new JTextField();

		percentW1.setBounds(314, 23, 130, 26);

		frame.getContentPane().add(percentW1);

		percentW1.setColumns(10);

		percentW2 = new JTextField();

		percentW2.setBounds(314, 60, 130, 26);

		frame.getContentPane().add(percentW2);

		percentW2.setColumns(10);

		percentW3 = new JTextField();

		percentW3.setBounds(314, 94, 130, 26);

		frame.getContentPane().add(percentW3);

		percentW3.setColumns(10);

		percentW4 = new JTextField();

		percentW4.setBounds(314, 134, 130, 26);

		frame.getContentPane().add(percentW4);

		percentW4.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Percent Weighted");

		lblNewLabel_5.setBounds(189, 23, 113, 16);

		frame.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Percent Weighted");

		lblNewLabel_6.setBounds(189, 60, 113, 16);

		frame.getContentPane().add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Percent Weighted");

		lblNewLabel_7.setBounds(189, 99, 113, 16);

		frame.getContentPane().add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Percent Weighted");

		lblNewLabel_8.setBounds(189, 139, 117, 16);

		frame.getContentPane().add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("Weighted Average:");

		lblNewLabel_9.setBounds(77, 185, 117, 16);

		frame.getContentPane().add(lblNewLabel_9);

		totalCalculation = new JTextField();

		totalCalculation.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.out.println(calculate);

			}

		});

		totalCalculation.setBounds(206, 180, 130, 26);

		frame.getContentPane().add(totalCalculation);

		totalCalculation.setColumns(10);

		textField = new JTextField();

		textField.setBounds(109, 23, 68, 26);

		frame.getContentPane().add(textField);

		textField.setColumns(10);

	}

}
