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
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JMenuBar;
import java.awt.Insets;

public class Tarificador  {

	private JFrame frmTarificadorSa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarificador window = new Tarificador();
					window.frmTarificadorSa.setVisible(true);
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
		frmTarificadorSa = new JFrame();
		frmTarificadorSa.setTitle("Tarificador SA.");
		frmTarificadorSa.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Analisis y Desarrollo de sistemas de Informacion 299763\\3er semestre\\Andres\\Tarificador\\Imagenes\\logotipo.jpg"));
		frmTarificadorSa.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmTarificadorSa.setBounds(100, 100, 403, 330);
		frmTarificadorSa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTarificadorSa.getContentPane().setLayout(null);
		
		JLabel lblBienvenidoAlSistema = new JLabel("Bienvenido al sistema de Tarificador SA.");
		lblBienvenidoAlSistema.setForeground(Color.WHITE);
		lblBienvenidoAlSistema.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBienvenidoAlSistema.setBounds(93, 38, 261, 32);
		frmTarificadorSa.getContentPane().add(lblBienvenidoAlSistema);
		
		JLabel lblPorFavorIngrese = new JLabel("Por favor ingrese la targeta");
		lblPorFavorIngrese.setForeground(Color.WHITE);
		lblPorFavorIngrese.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorFavorIngrese.setBounds(132, 159, 184, 41);
		frmTarificadorSa.getContentPane().add(lblPorFavorIngrese);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
			Constrasena miContrasena= new Constrasena();
			miContrasena.setVisible(true);
			
			
			
			
				
			
				
				
			}
		});
		btnAceptar.setBounds(178, 222, 91, 23);
		frmTarificadorSa.getContentPane().add(btnAceptar);
		
		JLabel lblNewLabel_1 = new JLabel("imagen");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("Imagenes"+File.separator+"logotipo.jpg"));
		lblNewLabel_1.setBounds(0, 1, 442, 328);
		frmTarificadorSa.getContentPane().add(lblNewLabel_1);
		
		
	}
}
