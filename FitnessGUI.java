import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FitnessGUI extends JFrame{
  private CardLayout Layout;
  private JPanel MainPanel;
  
  public FitnessGUI() {
    setTitle("Smart Fitness Tracker");
    setSize(600,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    JPanel Navigator = new JPanel();
    JButton WorkoutButton = new JButton("Log Workout");
    JButton GoalButton = new JButton("Set Goal");
    JButton ProgressButton = new JButton("View Progress");

    Navigator.add(WorkoutButton);
    Navigator.add(GoalButton);
    Navigator.add(ProgressButton);

    add(Navigator, BorderLayout.NORTH);
    
    setVisible(true);
  }
}
