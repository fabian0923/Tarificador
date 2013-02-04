package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.io.File;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Contrasena extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("Imagenes"+File.separator+"logotipo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseSuContrasea = new JLabel("Ingrese Sus Datos");
		lblIngreseSuContrasea.setFont(new Font("Arial", Font.PLAIN, 14));
		lblIngreseSuContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseSuContrasea.setBounds(125, 11, 191, 25);
		contentPane.add(lblIngreseSuContrasea);
		
		nombre = new JTextField();
		nombre.setBounds(159, 78, 86, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(33, 81, 86, 14);
		contentPane.add(lblNombre);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(33, 132, 86, 14);
		contentPane.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(159, 129, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre2 = nombre.getText();
				Bienvenida miBienvenida = new Bienvenida(nombre2);
				miBienvenida.setVisible(true);
				dispose();
			}
		});
		btnAceptar.setBounds(257, 221, 91, 23);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showConfirmDialog(null,"¿seguro que desea salir?");
				
				
			}
		});
		btnCancelar.setBounds(80, 221, 91, 23);
		contentPane.add(btnCancelar);
	}
}
