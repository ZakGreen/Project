package ru.mirea.lab4.Seasons;

public enum Season
{
    SUMMER(30)
            {
                public void getDescription()
                {
                    System.out.println("Теплое время года");
                }

            },

    AUTUMN(10),

    WINTER(-30),

    SPRING(15);


    private int temp;

    Season(int temp)
    {
        this.temp=temp;
    }

    public void getDescription()
    {
        System.out.println("Холодное время года");
    }

    public String ToString()
    {
        return name()  + " Средняя температура = " + temp + "\u00B0C";
    }
}
