package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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

    ButtonGroup discounts;

    List<JCheckBox> items;

    public FoodOrderGUI() {
        rbNone.setActionCommand("0");
        rb5.setActionCommand(".05");
        rb10.setActionCommand(".1");
        rb15.setActionCommand(".15");
        discounts = new ButtonGroup();
        discounts.add(rbNone);
        discounts.add(rb5);
        discounts.add(rb10);
        discounts.add(rb15);

        cPizza.setActionCommand("100");
        cBurger.setActionCommand("80");
        cFries.setActionCommand("65");
        cSoftDrinks.setActionCommand("55");
        cTea.setActionCommand("50");
        cSundae.setActionCommand("45");
        items = new ArrayList<JCheckBox>();
        items.add(cPizza);
        items.add(cBurger);
        items.add(cFries);
        items.add(cSoftDrinks);
        items.add(cTea);
        items.add(cSundae);
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                checkOut();
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI foodorder = new FoodOrderGUI();
        foodorder.setTitle("Food Ordering System");
        foodorder.setContentPane(foodorder.panel1);
        foodorder.setSize(850, 500);
        foodorder.setDefaultCloseOperation(EXIT_ON_CLOSE);
        foodorder.setVisible(true);
        foodorder.setLocationRelativeTo(null);
    }

    public void checkOut() {
        try {
            double total = 0;
            boolean isEmpty = true;
            for(JCheckBox item : items) {
                if(item.isSelected()) {
                    total+=Double.parseDouble(item.getActionCommand());
                    isEmpty = false;
                }
            }
            if(isEmpty && discounts.getSelection() == null) {
                throw (new OrderDiscountEmptyException("Order and Discount cannot be empty"));
            } else if(isEmpty) {
                throw (new OrderEmptyException("Order cannot be empty"));
            } else  if(discounts.getSelection() == null) {
                throw (new DiscountEmptyException("Discount cannot be empty"));
            } else {
                total = total-(total*Double.parseDouble(discounts.getSelection().getActionCommand()));
                JOptionPane.showMessageDialog(panel1,String.format("The total price is Php %.2f", total));
            }
        } catch (OrderEmptyException | DiscountEmptyException | OrderDiscountEmptyException e) {
            JOptionPane.showMessageDialog(panel1,e.getMessage());
        }
    }

    public static class OrderEmptyException extends Exception {
        public OrderEmptyException(String message) {
            super(message);
        }
    }
    public static class DiscountEmptyException extends  Exception {
        public DiscountEmptyException(String message) {
            super(message);
        }
    }

    public static class OrderDiscountEmptyException extends Exception {
        public OrderDiscountEmptyException(String message) {
            super(message);
        }
    }
}
