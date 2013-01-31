package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Pago extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pago frame = new Pago();
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
	public Pago() {
		setTitle("Tarificador SA.");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Analisis y Desarrollo de sistemas de Informacion 299763\\3er semestre\\Andres\\Tarificador\\Imagenes\\logotipo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		
		JLabel lblModosDePago = new JLabel("Modos De Pago");
		lblModosDePago.setHorizontalAlignment(SwingConstants.CENTER);
		lblModosDePago.setBounds(182, 70, 95, 14);
		contentPane.add(lblModosDePago);
		
		
		
		
		JRadioButton botonNormal = new JRadioButton("Normal");
		botonNormal.setBounds(48, 120, 109, 23);
		contentPane.add(botonNormal);
		
		
		JLabel label = new JLabel("$ 1500");
		label.setBounds(182, 124, 46, 14);
		contentPane.add(label);
		
		JRadioButton botonSencillo = new JRadioButton("Tiquete Sencillo");
		botonSencillo.setBounds(48, 172, 109, 23);
		contentPane.add(botonSencillo);
		
		
		JLabel label_1 = new JLabel("$ 2200");
		label_1.setBounds(182, 176, 46, 14);
		contentPane.add(label_1);
		
		JRadioButton botonDoble = new JRadioButton("Tiquete Doble");
		botonDoble.setBounds(48, 226, 109, 23);
		contentPane.add(botonDoble);
		
		ButtonGroup grupo = new ButtonGroup();
		 grupo.add(botonNormal);
		 grupo.add(botonSencillo);
		 grupo.add(botonDoble);
		
		
		
		
		JLabel lblNewLabel = new JLabel("$ 4400");
		lblNewLabel.setBounds(182, 230, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Contrasena miContrasena = new Contrasena();
				miContrasena.setVisible(true);
				dispose();
				
				
				
			}
		});
		btnCancelar.setBounds(100, 326, 91, 23);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Agradecimiento miGracias = new Agradecimiento();
				
				miGracias.setVisible(true);
				miGracias.setEnabled(true);
				dispose();
				
			}
		});
		btnAceptar.setBounds(313, 326, 91, 23);
		contentPane.add(btnAceptar);
		
		JLabel lblBienvenidoSeor = new JLabel("bienvenido se\u00F1or@ .......!");
		lblBienvenidoSeor.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenidoSeor.setBounds(137, 11, 184, 23);
		contentPane.add(lblBienvenidoSeor);
	}
}
