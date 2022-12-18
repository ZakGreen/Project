package ru.mirea.lab12.Task3;
import java.awt.*;
import java.awt.event.*;

class Tester extends Frame
{
    private Image[] img=new Image[100];
    private int count;
    Tester (String s)
    {
        super(s);
        MediaTracker tr=new MediaTracker(this);
        for (int k=0; k<100; k++)
        {
            img[k]=getToolkit().getImage("C:\\Users\\Lenovo\\OneDrive\\Рабочий стол\\image"+(k+1)+".gif");
            tr.addImage(img[k],0);
        }
        try
        {
            tr.waitForAll();
        }
        catch (InterruptedException e){}
        setSize(337, 265);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.drawImage(img[count%10], 0, 0, this);
    }
    public void update(Graphics g) {paint(g); }
    public void go()
    {
        while(count<100)
        {
            repaint();
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e){}
            count++;
        }
    }
    public static void main(String[] args)
    {
        Tester anim_window=new Tester("Анимация");
        anim_window.go();
        anim_window.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent ev)
            {
                System.exit(0);
            }
        });
    }
}
