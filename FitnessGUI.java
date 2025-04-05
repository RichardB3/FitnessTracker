import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FitnessTracker {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(FitnessGUI::new);
  }

class FitnessGUI extends JFrame{
  private CardLayout Layout;
  private JPanel MainPanel;
  
  public FitnessGUI() {
    setTitle("Smart Fitness Tracker");
    setSize(600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    setVisible(true);
  }
}
