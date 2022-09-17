package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MainWindow extends JPanel {
    private DefaultListModel listModel1;
    private DefaultListModel listModel2;
    private DefaultListModel listModel3;
    private JList list1;
    private JList list2;
    private JList list3;

    public MainWindow() {
        super(new BorderLayout());

        JLabel label1 = new JLabel("Source");
        label1.setFont(new Font("Sans-Serif", Font.PLAIN, 16));
        JLabel label2 = new JLabel("Destination");
        label2.setFont(new Font("Sans-Serif", Font.PLAIN, 16));
        JLabel label3 = new JLabel("Route");
        label3.setFont(new Font("Sans-Serif", Font.PLAIN, 16));

        listModel1 = new DefaultListModel();
        listModel1.addElement("Item 1");
        listModel1.addElement("Item 2");
        listModel1.addElement("Item 3");
        listModel1.addElement("Item 4");
        listModel1.addElement("Item 5");
        list1 = new JList(listModel1);
        list1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list1.setFont(new Font("Sans-Serif", Font.PLAIN, 16));
        list1.setLayoutOrientation(JList.VERTICAL);
        list1.setVisibleRowCount(-1);
        JScrollPane scrollPane1 = new JScrollPane(list1);

        listModel2 = new DefaultListModel();
        listModel2.addElement("Item 1");
        listModel2.addElement("Item 2");
        listModel2.addElement("Item 3");
        listModel2.addElement("Item 4");
        listModel2.addElement("Item 5");
        list2 = new JList(listModel2);
        list2.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list2.setFont(new Font("Sans-Serif", Font.PLAIN, 16));
        list2.setLayoutOrientation(JList.VERTICAL);
        list2.setVisibleRowCount(-1);
        JScrollPane scrollPane2 = new JScrollPane(list2);

        listModel3 = new DefaultListModel();
        list3 = new JList(listModel3);
        list3.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list3.setLayoutOrientation(JList.VERTICAL);
        list3.setVisibleRowCount(-1);
        JScrollPane scrollPane3 = new JScrollPane(list3);

        JButton comp = new JButton("Compute Route");
        comp.setPreferredSize(new Dimension(25, 25));
        comp.addActionListener(new ButtonListener());

        JPanel p1 = new JPanel(new GridLayout(1,1));
        p1.add(label1);
        p1.add(label2);
        p1.add(label3);
        p1.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));

        JPanel p2 = new JPanel(new GridLayout(1,3));
        p2.add(scrollPane1);
        p2.add(scrollPane2);
        p2.add(scrollPane3);
        p2.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));

        JPanel p3 = new JPanel(new GridLayout(1,1));
        p3.setLayout(new BoxLayout(p3, BoxLayout.LINE_AXIS));
        p3.add(comp);
        p3.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));

        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static void main(String args[]){
        JFrame frame = new JFrame("Routes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent newContentPane = new MainWindow();
        frame.setContentPane(newContentPane);
        frame.setPreferredSize(new Dimension(700,600));

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
