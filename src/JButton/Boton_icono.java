package JButton;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Boton_icono {
  public static void main(String args[]) {
    JFrame frame = new JFrame("DefaultButton");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Icon warnIcon = new ImageIcon("icono_warning.gif");
    JButton button2 = new JButton(new ImageIcon("/home/matinal/workspace/Tema 14 - Interfaces con Swing/src/JButton/icono_warning.gif"));
    frame.getContentPane().add(button2);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}


