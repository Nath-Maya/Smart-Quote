package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Set Nimbus Look and Feel
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Mostrar el formulario dentro de un JFrame
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("SmartQuote");
            MainForm mainForm = new MainForm();
            frame.setContentPane(mainForm.panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
