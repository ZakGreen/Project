package ru.mirea.lab5.Picture;

import javax.swing.*;
import java.awt.*;

public class Test
{
    public static void main(String[] args)
    {
        String[] strings = new String[1];
        strings[0] = "C:\\Users\\Lenovo\\OneDrive\\Рабочий стол\\Хазбик.png";

        Image bgImage= Toolkit.getDefaultToolkit().getImage(strings[0]);
        JLabel jLabel = new JLabel(new ImageIcon(bgImage));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.BLACK);
        mainPanel.add(jLabel);

        JFrame frame = new JFrame("Хазбик");
        frame.setPreferredSize(new Dimension(1206,1280));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
