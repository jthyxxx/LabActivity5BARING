package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) {
        LeapYearGUI leapyear = new LeapYearGUI();
        leapyear.setTitle("Leap Year Checker");
        leapyear.setContentPane(leapyear.panel1);
        leapyear.setSize(500, 300);
        leapyear.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leapyear.setVisible(true);
        leapyear.setLocationRelativeTo(null);
    }
}
