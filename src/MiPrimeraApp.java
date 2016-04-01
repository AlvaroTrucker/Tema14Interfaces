import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiPrimeraApp {

	private JFrame frame;
	private int contador = 0;
	private static final String TEXTO = "El botón se ha pulsado";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiPrimeraApp window = new MiPrimeraApp();
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
	public MiPrimeraApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Aplicacion Contador");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(new FlowLayout());
		
		JButton boton = new JButton("Pulsa aquí");
		JLabel etiqueta = new JLabel(TEXTO +" "+ contador+" veces");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador++;
				etiqueta.setText(TEXTO +" "+ contador+" veces");
			}
		});
		
		frame.getContentPane().add(boton);
		frame.getContentPane().add(etiqueta);
		frame.pack();
		frame.setResizable(false);
		
		
	}

}
