package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    int year = Integer.parseInt(tfYear.getText());
                    checkYear(year);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(panel1, "Enter only a number.");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI leapyear = new LeapYearGUI();
        leapyear.setTitle("Leap Year Checker");
        leapyear.setContentPane(leapyear.panel1);
        leapyear.setSize(500, 300);
        leapyear.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leapyear.setVisible(true);
        leapyear.setLocationRelativeTo(null);
    }

    public void checkYear(int year) {
        String output = null;

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
            output = "Leap year";
        } else {
            output = "Not a leap year";
        }

        JOptionPane.showMessageDialog(panel1, output);
    }
}
