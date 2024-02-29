package company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Phones extends JFrame {

    private JPanel panel1;
    private JScrollBar scrollBar1;
    private JTable Table;
    private JButton addButton;
    private JButton editButton;
    private JButton deleteButton;
    private JPanel panel;
    private DefaultTableModel model;
    public static List<Phone> phones = new ArrayList<>();
    static{
        phones.add(new Phone("Surname","Name","Number", "Address"));
        phones.add(new Phone("Surname","Name","Number", "Address"));
    }

    public Phones() {
        setTitle("Phones");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 550);
        String[] columnNames = {"Surname", "Name", "Address","Number"};
        model = new DefaultTableModel(null, columnNames);
        Table.setModel(model);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        setVisible(true);
addMenu();
setVisible(true);

deleteButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int row = Table.getSelectedRow();
        model.removeRow(row);
       // Phones.model.removeRow(Phones.Table.getSelectedRow());
        //Phones.model.removeRow(Phones.phonesForm.getTable().getSelectedRow());
    }
});
        for (Phone phone : phones)
        model.addRow(new String[]{phone.getSurname(), phone.getName(), phone.getAddress(), phone.getNumber()});

    }

    public static void main(String[] args) {
        Phones phones = new Phones();

    }
    private void addMenu() {
        // create a menubar
        JMenuBar menuBar = new JMenuBar();

        // create a menu
        JMenu menu1 = new JMenu("Phone");

        // create menuitems
        JMenuItem mAdd = new JMenuItem("Add");
        JMenuItem mEdit = new JMenuItem("Edit");
        JMenuItem mDelete = new JMenuItem("Detele");
        JMenuItem mExit = new JMenuItem("Exit");

        // add menu items to menu
        menu1.add(mAdd);
        menu1.add(mEdit);
        menu1.add(mDelete);
        menu1.add(mExit);

        // add menu to menu bar
        menuBar.add(menu1);

        // add menubar to frame
        setJMenuBar(menuBar);

    }

}
