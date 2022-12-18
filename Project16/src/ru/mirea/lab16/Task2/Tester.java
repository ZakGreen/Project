package ru.mirea.lab16.Task2;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.Font;

public class Tester extends JFrame
{
    private Tester()
    {
        setSize(600, 150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();

        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12));

        String[] colors = {"Синий", "Красный", "Чёрный"};
        JComboBox<String> color = new JComboBox<>(colors);
        color.setSelectedIndex(0);

        String[] f = {"Times New Roman", "MS Sans Serif", "Courier New"};
        JComboBox<String> fonts = new JComboBox<>(f);
        fonts.setSelectedIndex(0);

        fonts.addItemListener(e -> textArea.setFont(new Font(f[fonts.getSelectedIndex()], Font.PLAIN, 12)));

        color.addItemListener(e -> {
            Color c;
            switch (color.getSelectedIndex())
            {
                case 1:
                    c = Color.RED;
                    break;
                case 2:
                    c = Color.BLACK;
                    break;
                default: c = Color.BLUE;
            }
            textArea.setForeground(c);
        });

        getContentPane().add(color).setBounds(0,0,585,20);
        getContentPane().add(fonts).setBounds(0,20,585,20);
        getContentPane().add(textArea).setBounds(0, 50, 585, 20);
        setLayout(null);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args)
    {
        new Tester().setVisible(true);
    }
}