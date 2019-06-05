package net;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notepad extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JMenuBar menuBar;

    private JMenu mFile;
    private JMenu mSetting;
    private JMenu mView;
    private JMenuItem miExit;
    private JMenuItem miNew;
    private JMenuItem miOpen;
    private JMenu mSave;
    private JMenuItem miSaveAs;
    private JMenuItem miSaveAll;

    public Notepad() {
        setTitle("Super notepad!");
        setSize(700, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar = new JMenuBar();
        textArea = new JTextArea();
        mFile = new JMenu("File");
        mSetting = new JMenu("Settings");
        mView = new JMenu("View");

        miNew = new JMenuItem("New");
        miOpen = new JMenuItem("Open");
        mSave = new JMenu("Save");
        miExit = new JMenuItem("Exit");
        miSaveAs = new JMenuItem("Save as...");
        miSaveAll = new JMenuItem("Save all!");

        miNew.addActionListener(this);
        miOpen.addActionListener(this);
        miExit.addActionListener(this);
        miSaveAs.addActionListener(this);
        miSaveAll.addActionListener(this);

        mSave.add(miSaveAs);
        mSave.add(miSaveAll);

        mFile.add(miNew);
        mFile.add(mSave);
        mFile.add(miOpen);
        mFile.add(miExit);

        menuBar.add(mFile);
        menuBar.add(mSetting);
        menuBar.add(mView);

        setJMenuBar(menuBar);
        add(textArea, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Notepad::new);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(miNew))
            textArea.setText("New");

        if(e.getSource().equals(miOpen))
            textArea.setText("Open");

        if(e.getSource().equals(miSaveAs))
            textArea.setText("You have clicked on button 'SaveAs'");

        if(e.getSource().equals(miSaveAll))
            textArea.setText("You have clicked on button 'SaveAll'");

        if(e.getSource().equals(miExit)) {
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure that you want to exit?", "Exit from program", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}