package JToggleButton;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;

public class GrupoBotones extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JLabel etiqueta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GrupoBotones frame = new GrupoBotones();
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
	public GrupoBotones() {
		setTitle("Botones seleccionables");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JToggleButton t1 = new JToggleButton("");
		//t1.setIcon(new ImageIcon(GrupoBotones.class.getResource("/iconos/DOC-64.png")));
		t1.setActionCommand("DOC");
		t1.addActionListener(this);
		panel.add(t1);
		
		
		JToggleButton t2 = new JToggleButton("");
		//t2.setIcon(new ImageIcon(GrupoBotones.class.getResource("/iconos/EPS-64.png")));
		t2.setActionCommand("EPS");
		t2.addActionListener(this);
		panel.add(t2);
		
		JToggleButton t3 = new JToggleButton("");
		//t3.setIcon(new ImageIcon(GrupoBotones.class.getResource("/iconos/HTML Filetype-64.png")));
		t3.setActionCommand("HTML");
		t3.addActionListener(this);
		panel.add(t3);
		
		JToggleButton t4 = new JToggleButton("");
		//t4.setIcon(new ImageIcon(GrupoBotones.class.getResource("/iconos/TXT-64.png")));
		t4.setActionCommand("TXT");
		t4.addActionListener(this);
		panel.add(t4);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(t1);
		grupo.add(t2);
		grupo.add(t3);
		grupo.add(t4);

		etiqueta = new JLabel("");
		panel.add(etiqueta);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		etiqueta.setText (arg0.getActionCommand());	
	}


}


