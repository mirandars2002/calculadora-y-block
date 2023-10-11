package ej1;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class Ej1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej1 window = new Ej1();
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
	public Ej1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton_1 = new JButton("Bloc Notas");

		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\mremesal1056\\Downloads\\block notas.PNG"));
		btnNewButton_1.setBounds(252, 146, 141, 73);

		frame.getContentPane().add(btnNewButton_1);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String ruta = "C:\\\\WINDOWS\\\\system32\\\\notepad.exe";

				App1 ejecutar = new App1();

				try {
					ejecutar.Ruta(ruta);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("Hecho");
			}
		};

		btnNewButton_1.addActionListener(listener);

		JButton btnNewButton = new JButton("Calculadora");

		btnNewButton.setIcon(new ImageIcon("C:\\Users\\mremesal1056\\Downloads\\calculadora.PNG"));
		btnNewButton.setBounds(66, 146, 145, 73);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Actividad calc y block notas de Miranda Remesal");
		lblNewLabel.setBounds(95, 33, 360, 83);
		frame.getContentPane().add(lblNewLabel);

		ActionListener listener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String ruta = "C:\\\\WINDOWS\\\\system32\\\\calc";

				App1 ejecutar = new App1();

				try {
					ejecutar.Ruta(ruta);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("Hecho");
			}
		};

		btnNewButton.addActionListener(listener2);

	}
}
