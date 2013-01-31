package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Agradecimiento extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agradecimiento frame = new Agradecimiento();
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
	public Agradecimiento() {
		setTitle("Tarificador SA.");
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Analisis y Desarrollo de sistemas de Informacion 299763\\3er semestre\\Andres\\Tarificador\\Imagenes\\logotipo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setEnabled(false);
		
		JLabel lblTarificadorSa = new JLabel("Tarificador SA");
		lblTarificadorSa.setHorizontalAlignment(SwingConstants.CENTER);
		lblTarificadorSa.setBounds(192, 11, 83, 14);
		contentPane.add(lblTarificadorSa);
		
		JLabel lblGraciasPorUsar = new JLabel("Gracias por usar nuestro Software");
		lblGraciasPorUsar.setHorizontalAlignment(SwingConstants.CENTER);
		lblGraciasPorUsar.setBounds(143, 120, 204, 14);
		contentPane.add(lblGraciasPorUsar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tarificador miTarificador = new Tarificador();
				miTarificador.setVisible(true);
				dispose();
				
				
				
				
				
			}
		});
		btnAceptar.setBounds(192, 212, 91, 23);
		contentPane.add(btnAceptar);
	}

}
