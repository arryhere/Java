import javax.swing.JOptionPane;

public class jc_02_02_gui_input {

  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Enter your name");
    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
    
    JOptionPane.showMessageDialog(null, name + "\n" + age + "\n" + height);
  }
}