package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;

    private  JTextField tfNumber2;

    private JComboBox cbOperations;

    private JTextField lblResult;

    private JButton btnCompute;

    public  SimpleCalcGUI() {

        lblResult.setEnabled(false);
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int numOne = Integer.parseInt(tfNumber1.getText());
                int numTwo = Integer.parseInt(tfNumber2.getText());
                compute(numOne,numTwo);
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI calculator = new SimpleCalcGUI();
        calculator.setTitle("Simple Calculator");
        calculator.setContentPane(calculator.panel1);
        calculator.setSize(800, 400);
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calculator.setVisible(true);
        calculator.setLocationRelativeTo(null);
    }

    public void compute(int numOne, int numTwo) {
        int answer = 0;
        switch (cbOperations.getSelectedItem().toString()) {
            case "+":
                answer = numOne+numTwo;
                break;
            case "-":
                answer = numOne-numTwo;
                break;
            case "*":
                answer = numOne*numTwo;
                break;
            case "/":
                answer = numOne/numTwo;
                break;
        }
        lblResult.setText(Integer.toString(answer));
    }

    public static class EmptyInput extends Exception {
        public EmptyInput(String message) {
            super(message);
        }
    }
}
