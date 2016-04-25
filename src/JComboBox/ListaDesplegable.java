package JComboBox;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class ListaDesplegable extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaDesplegable frame = new ListaDesplegable();
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
	public ListaDesplegable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		Vector<Ciudad> ciudades = new Vector<Ciudad>();
		Ciudad jaen = new Ciudad("Jaen",23);
		Ciudad cordoba = new Ciudad("Cordoba",41);
		Ciudad granada = new Ciudad("Granada",18);
		ciudades.addElement(jaen);
		ciudades.addElement(cordoba);
		ciudades.addElement(granada);
		JComboBox comboBox = new JComboBox(ciudades);
		panel.add(comboBox);
		
		JLabel etiqueta = new JLabel("");
		panel.add(etiqueta);
		
		JButton boton = new JButton("Guardar");
		panel.add(boton);
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Ciudad ciudadSeleccionada = (Ciudad) comboBox.getSelectedItem();
				etiqueta.setText(ciudadSeleccionada.getNombre());
				
			}
		});
	}

}
