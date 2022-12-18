package ru.mirea.lab2.Author;
//import java.io.IOException;
import java.util.Scanner;
import java.lang.*;

public class TestAuthor
{
    public static void main(String[] args) /*throws IOException*/
    {
        String name = "Nick";
        String email = "gg@mail.ru";
        char gender = 'M';
        String email1;
        Author n = new Author(name, email, gender);
        System.out.println("Автор - " + n.getName() + ", Почта - " + n.getEmail() + ", Пол - " + n.getGender());
        Scanner input = new Scanner(System.in);
        //System.out.println("Введите имя: ");
        //name = input.nextLine();
        System.out.println("Введите почту: ");
        email1 = input.nextLine();
        n.setEmail(email1);
        //System.out.println("Введите пол: ");
        //int g = System.in.read();
        //gender = (char) g;
        System.out.println(n.toString());
    }
}
