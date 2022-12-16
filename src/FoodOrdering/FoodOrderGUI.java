package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI extends  JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;

    private JCheckBox cBurger;

    private JCheckBox cFries;

    private JCheckBox cSoftDrinks;

    private JCheckBox cTea;

    private JCheckBox cSundae;

    private JRadioButton rbNone;

    private JRadioButton rb5;

    private JRadioButton rb10;

    private JRadioButton rb15;

    private JButton btnOrder;

    public static void main(String[] args) {
        FoodOrderGUI foodorder = new FoodOrderGUI();
        foodorder.setTitle("Food Ordering System");
        foodorder.setContentPane(foodorder.panel1);
        foodorder.setSize(850, 500);
        foodorder.setDefaultCloseOperation(EXIT_ON_CLOSE);
        foodorder.setVisible(true);
        foodorder.setLocationRelativeTo(null);
    }
}
