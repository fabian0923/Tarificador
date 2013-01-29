package vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tarificador {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarificador window = new Tarificador();
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
	public Tarificador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tarificador SA.");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setBounds(178, 0, 88, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblBienvenidoAlSistema = new JLabel("Bienvenido al sistema de Tarificador SA.");
		lblBienvenidoAlSistema.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBienvenidoAlSistema.setBounds(93, 38, 261, 32);
		frame.getContentPane().add(lblBienvenidoAlSistema);
		
		JLabel lblPorFavorIngrese = new JLabel("Por favor ingrese la targeta");
		lblPorFavorIngrese.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorFavorIngrese.setBounds(132, 159, 184, 41);
		frame.getContentPane().add(lblPorFavorIngrese);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Constrasena miContrasena= new Constrasena();
			miContrasena.setVisible(true);
			
			
				
			
				
				
			}
		});
		btnAceptar.setBounds(178, 222, 91, 23);
		frame.getContentPane().add(btnAceptar);
	}
}
