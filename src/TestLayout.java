import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestLayout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestLayout window = new TestLayout();
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
	public TestLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0,400,100);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton Boton1 = new JButton("Boton1");
		frame.getContentPane().add(Boton1, BorderLayout.NORTH);
		
		JLabel etiqueta = new JLabel();
		etiqueta.setText("Etiqueta");
		frame.add(etiqueta);
		
		frame.setLayout(new FlowLayout());
		
		//frame.pack();
		
		/*class BotonListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText("Lo que sea");
				frame.pack();
			}
			
		}*/
		/*Boton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText("Lo que sea");
				frame.pack();
			}
		});*/
		Boton1.addActionListener(e -> {System.exit(0);});
	}

}
