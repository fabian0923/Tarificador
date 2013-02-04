package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.io.File;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setTitle("Tarificador SA");
		setIconImage(Toolkit.getDefaultToolkit().getImage("Imagenes"+File.separator+"logotipo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidoAlSistem = new JLabel("Bienvenido al Sistema de Tarificador SA.");
		lblBienvenidoAlSistem.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenidoAlSistem.setForeground(Color.WHITE);
		lblBienvenidoAlSistem.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBienvenidoAlSistem.setBounds(67, 68, 266, 23);
		contentPane.add(lblBienvenidoAlSistem);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Contrasena miClave = new Contrasena();
				miClave.setVisible(true);
				dispose();
				
			}
		});
		btnAceptar.setBounds(161, 205, 91, 23);
		contentPane.add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int eleccion = JOptionPane.showConfirmDialog(null, "desea salir?");
				
				if (eleccion == 0)
				{
					JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro sistema");
					System.exit(0);
				}
					
					
			}
		});
		btnSalir.setBounds(161, 239, 91, 23);
		contentPane.add(btnSalir);
		
		JLabel lblImagen = new JLabel("Imagen");
		lblImagen.setIcon(new ImageIcon("Imagenes"+File.separator+"logotipo.jpg"));
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagen.setBounds(0, 0, 406, 297);
		contentPane.add(lblImagen);
	}

}
