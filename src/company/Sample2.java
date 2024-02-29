package company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class Sample2 extends JFrame{
    private JRadioButton Black;
    private JRadioButton White;
    private JButton button1;
    private JPanel Panel;
    private JLabel label;
    private ButtonGroup Color;

    public Sample2() {
        setTitle("Sample2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setContentPane(Panel);
        setLocationRelativeTo(null);
        setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Enumeration<AbstractButton> buttons = Color.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();

                    if (button.isSelected()) {
label.setText(button.getText());
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        Sample2 sample2 = new Sample2();

    }
}