package company;

import javax.swing.*;

public class Sample_1 extends JFrame {
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button4;
    private JButton button3;
    private JButton button6;
    private JButton button5;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;

    public Sample_1(){
        setTitle("Sample1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setContentPane(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Sample_1 sample_1 = new Sample_1();

    }
}
