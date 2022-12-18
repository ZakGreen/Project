package ru.mirea.lab4.Seasons;

public class Test
{
    public static void main(String[] args)
    {
        for (Season season:Season.values())
        {
            System.out.println(season.ToString());
            season.getDescription();

            switch(season)
            {
                case SUMMER:
                {
                    System.out.println("Я люблю лето!\n");
                    continue;
                }

                case AUTUMN:
                {
                    System.out.println("Я люблю осень!"+"\n");
                    continue;
                }

                case WINTER:
                {
                    System.out.println("Я люблю зиму!"+"\n");
                    continue;
                }

                case SPRING:
                {
                    System.out.println("Я люблю весну!"+"\n");
                }
            }
        }
    }
}
