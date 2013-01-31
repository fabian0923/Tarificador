package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Contrasena extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contrasena frame = new Contrasena();
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
	public Contrasena() {
		setTitle("Tarificador SA.");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Analisis y Desarrollo de sistemas de Informacion 299763\\3er semestre\\Andres\\Tarificador\\Imagenes\\logotipo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		
		JLabel lblIngreseSuConstrasea = new JLabel("Ingrese Su Constrase\u00F1a");
		lblIngreseSuConstrasea.setFont(new Font("Arial", Font.PLAIN, 14));
		lblIngreseSuConstrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseSuConstrasea.setBounds(147, 80, 187, 46);
		contentPane.add(lblIngreseSuConstrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(209, 168, 83, 20);
		contentPane.add(passwordField);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener()
		
		{
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnCancelar.setBounds(88, 225, 91, 23);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pago miPago = new Pago();
				miPago.setVisible(true);
				dispose();
				
				
				
				
				
			}
		});
		btnAceptar.setBounds(311, 225, 91, 23);
		contentPane.add(btnAceptar);
	}

}
