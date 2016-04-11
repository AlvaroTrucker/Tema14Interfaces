package JButton;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Boton_tecla {
  public static void main(String args[]) {
    JFrame frame = new JFrame("DefaultButton");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton button1 = new JButton("Text Button");
    button1.setMnemonic(KeyEvent.VK_B);
    frame.add(button1);
    frame.setSize(300, 200);
    frame.setVisible(true);
  }

}
