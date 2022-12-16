package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;

    private  JTextField tfNumber2;

    private JComboBox cbOperations;

    private JTextField lblResult;

    private JButton btnCompute;

    public static void main(String[] args) {
        SimpleCalcGUI calculator = new SimpleCalcGUI();
        calculator.setTitle("Simple Calculator");
        calculator.setContentPane(calculator.panel1);
        calculator.setSize(800, 400);
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calculator.setVisible(true);
        calculator.setLocationRelativeTo(null);
    }
}
