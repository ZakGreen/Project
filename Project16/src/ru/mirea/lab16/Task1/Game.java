package ru.mirea.lab16.Task1;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Game extends JFrame implements ActionListener
{
    static JFrame frame;
    static JTextField text;
    static JLabel label, label0;


    int a = 1 + (int) (Math.random() * 19);
    //int i = 1;

    public static void main(String args[])
    {
        frame = new JFrame("Игра-угадайка");

        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }

        Game c = new Game();

        label0 = new JLabel("Угадайте число от 0 до 20!");
        label0.setFont(new Font("Times New Roman",Font.PLAIN, 20));

        label = new JLabel("*результат*");
        label.setLayout(new FlowLayout());
        label.setForeground(Color.RED);
        label.setFont(new Font("Times New Roman",Font.PLAIN, 16));

        text = new JTextField(16);
        text.setMargin(new Insets(10, 30, 10, 150));
        text.setHorizontalAlignment(SwingConstants.RIGHT);

        text.setEditable(true);

        JButton button = new JButton("Попытка");
        button.setMargin(new Insets(10, 30, 10, 30));
        button.setVerticalAlignment(SwingConstants.TOP);
        button.setHorizontalAlignment(SwingConstants.RIGHT);
        button.setHorizontalTextPosition(SwingConstants.LEFT);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);

        button.addActionListener(c);

        JPanel panel = new JPanel();

        JPanel panelcenter = new JPanel();
        panelcenter.setPreferredSize(new Dimension(5, 5));
        panelcenter.setBackground(Color.gray);
        JPanel panelleft = new JPanel();
        panelleft.setPreferredSize(new Dimension(50, 50));
        panelleft.setBackground(Color.gray);
        JPanel panelright = new JPanel();
        panelright.setPreferredSize(new Dimension(50, 50));
        panelright.setBackground(Color.gray);
        JPanel panelup = new JPanel();
        panelup.setPreferredSize(new Dimension(100, 50));
        panelup.setBackground(Color.gray);
        JPanel paneldown = new JPanel();
        paneldown.setPreferredSize(new Dimension(100, 50));
        paneldown.setBackground(Color.gray);


        panel.add(label0);
        panel.add(text);
        panel.add(button);
        panel.add(label);
        panel.setBackground(Color.gray);

        //frame.add(panelcenter, BorderLayout.CENTER);
        //panelcenter.setToolTipText("Добро пожаловать в ЦАО");
        frame.add(panelleft, BorderLayout.WEST);
        panelleft.setToolTipText("Добро пожаловать в ЗАО");
        frame.add(panelright, BorderLayout.EAST);
        panelright.setToolTipText("Добро пожаловать в ВАО");
        frame.add(panelup, BorderLayout.NORTH);
        panelup.setToolTipText("Добро пожаловать в САО");
        frame.add(paneldown, BorderLayout.SOUTH);
        paneldown.setToolTipText("Добро пожаловать ЮАО");

        frame.add(panel, BorderLayout.CENTER);
        panel.setToolTipText("Добро пожаловать в ЦАО");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.show();

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        int i = 1;
        while(i < 4)
        {
            int guess = Integer.parseInt(text.getText());

            if (guess < a)
            {
                label.setText("Ваше число меньше задуманного! Попробуйте ещё раз!");
                i++;
            }
            else if (guess > a)
            {
                label.setText("Ваше число больше задуманного! Попробуйте ещё раз!");
                i++;
            }
            else
            {
                label.setText("Вы угадали число!!!");
                label0.setText("У вас была " + i + " попытка!");
                break;
            }
            /*if(i>=3)
            {
                label0.setText("Вы превысили число попыток! Вы проиграли!");
                break;
            }*/
            i++;
        }
    }
}
