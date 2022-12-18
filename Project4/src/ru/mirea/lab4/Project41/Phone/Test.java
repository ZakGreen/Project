package ru.mirea.lab4.Project41.Phone;

import ru.mirea.lab4.Project41.Phone.Phone;

public class Test
{
    public static void main(String[] args)
    {
        Phone phone1=new Phone("88005553535","Iphone",450);
        Phone phone2=new Phone("89093151825","Fly",560);
        Phone phone3=new Phone("89870708235","Samsung",435);

        System.out.println(phone1.toString()+"\n"+phone2.toString()+"\n"+phone3.toString());
        System.out.println("\n");
        phone1.receiveCall("Захар");
        System.out.println("\n");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        System.out.println("\n");
        phone2.receiveCall("Виктор", "89094498472");
        System.out.println("\n");
        System.out.println("Сообщения будуь отправлены следующим номерам:");
        phone3.sendMessage("89342352445","89348345242","89991457390");
    }
}

