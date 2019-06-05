package net;

import javax.swing.*;
import java.awt.*;

public class EventDemo {
    public EventDemo() {
        JFrame jFrame = new JFrame("An Event Demo!");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(500, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton JAlpha = new JButton("Alpha");
        JButton JBeta = new JButton("Beta");
        JLabel jLabel = new JLabel("Press а button.");
        JAlpha.addActionListener(e -> {
            jLabel.setText("Alpha was pressed");
        });
        JBeta.addActionListener(e -> {
            jLabel.setText("Beta was pressed");
        });
        jFrame.add(JAlpha);
        jFrame.add(JBeta);
        jFrame.add(jLabel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EventDemo::new);
    }
}