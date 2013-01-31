package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.io.File;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tarificador extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarificador frame = new Tarificador();
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
	public Tarificador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenidoAlSisteme = new JLabel("Bienvenido al Sisteme del Tarificador SA.");
		lblBienvenidoAlSisteme.setForeground(Color.WHITE);
		lblBienvenidoAlSisteme.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBienvenidoAlSisteme.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenidoAlSisteme.setBounds(54, 58, 267, 14);
		contentPane.add(lblBienvenidoAlSisteme);
		
		JLabel lblPorFavorIntroduzca = new JLabel("Por Favor introduzca la tarjeta");
		lblPorFavorIntroduzca.setForeground(Color.WHITE);
		lblPorFavorIntroduzca.setFont(new Font("Arial", Font.PLAIN, 13));
		lblPorFavorIntroduzca.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorFavorIntroduzca.setBounds(95, 144, 193, 14);
		contentPane.add(lblPorFavorIntroduzca);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Contrasena miContrasena= new Contrasena();
				miContrasena.setVisible(true);
				dispose();
				
			}
		});
		btnAceptar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnAceptar.setBounds(151, 208, 91, 23);
		contentPane.add(btnAceptar);
		
		JLabel lblLogoTipo = new JLabel("logo tipo");
		lblLogoTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogoTipo.setIcon(new ImageIcon("Imagenes"+File.separator+"logotipo.jpg"));
		lblLogoTipo.setBounds(0, 0, 405, 305);
		contentPane.add(lblLogoTipo);
	}
}
