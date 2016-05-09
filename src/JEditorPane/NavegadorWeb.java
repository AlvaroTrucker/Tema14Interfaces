package JEditorPane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class NavegadorWeb extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldURL;
	private JEditorPane editorPane;
	private JButton btnNewButton;
	private Historial historial;
	private JButton botonSiguiente;
	private JButton botonAnterior;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NavegadorWeb frame = new NavegadorWeb();
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
	public NavegadorWeb() {
		historial = new Historial();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		editorPane = new JEditorPane();
		scrollPane.setViewportView(editorPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					editorPane.setPage("http://www.google.es");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		botonAnterior = new JButton("<<");
		botonAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url = historial.previous();
				if (url != null) {
					botonAnterior.setEnabled(true);
					try {
						editorPane.setPage(url);
						textFieldURL.setText(url);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else {
					botonAnterior.setEnabled(false);
				}
			}
		});
		panel.add(botonAnterior);
		
		botonSiguiente = new JButton(">>");
		botonSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url = historial.next();
				if (url != null) {
					botonSiguiente.setEnabled(true);
					try {
						editorPane.setPage(url);
						textFieldURL.setText(url);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else {
					botonSiguiente.setEnabled(false);
				}
			}
		});
		panel.add(botonSiguiente);
		btnNewButton.setIcon(new ImageIcon(NavegadorWeb.class.getResource("/com/sun/java/swing/plaf/windows/icons/HomeFolder.gif")));
		panel.add(btnNewButton);
		
		textFieldURL = new JTextField();
		textFieldURL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				String url = t.getText();
				try {
					editorPane.setPage(url);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		panel.add(textFieldURL);
		textFieldURL.setColumns(25);
		
		JButton botonIr = new JButton("");
		botonIr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String url = textFieldURL.getText();
					editorPane.setPage(url);
					historial.add(url);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		botonIr.setIcon(new ImageIcon(NavegadorWeb.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		panel.add(botonIr);
	}

}