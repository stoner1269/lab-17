package net;

import javax.swing.*;

public class SwingDemo {

    public SwingDemo() {
        JFrame jFrame = new JFrame("A simple title");
        jFrame.setSize(575, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("It is a label");
        jFrame.add(jLabel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingDemo::new);
    }
}