/*package modeloVistaControlador;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Vista {

	private JFrame frame;
	//private int contador = 0;
	private static final String TEXTO = "El botón se ha pulsado";

	
	public Vista() {
		initialize();
	}

	
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
*/