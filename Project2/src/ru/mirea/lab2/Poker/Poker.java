package ru.mirea.lab2.Poker;

import java.util.*;

public class Poker
 {
    final private List<String> cards = new ArrayList<>(
            Arrays.asList
            (
                    // Пики
                    " |1 пики| ", " |2 пики| ", " |3 пики| ", " |4 пики| ", " |5 пики| ", " |6 пики| ", " |7 пики| ", " |8 пики| ", " |9 пики| ", " |Валет пики| ", " |Дама пики| ", " |Король пики| ", " |Туз пики| ",

                    // Черви
                    " |1 черви| ", " |2 черви| ", " |3 черви| ", " |4 черви| ", " |5 черви| ", " |6 черви| ", " |7 черви| ", " |8 черви| ", " |9 черви| ", " |Валет черви| ", " |Дама черви| ", " |Король черви| ", " |Туз черви| ",

                    // Бубны
                    " |1 бубны| ", " |2 бубны| ", " |3 бубны| ", " |4 бубны| ", " |5 бубны| ", " |6 бубны| ", " |7 бубны| ", " |8 бубны| ", " |9 бубны| ", " |Валет бубны| ", " |Дама бубны| ", " |Король бубны| ", " |Туз бубны| ",

                    // Крести
                    " |1 крести| ", " |2 крести| ", " |3 крести| ", " |4 крести| ", " |5 крести| ", " |6 крести| ", " |7 крести| ", " |8 крести| ", " |9 крести| ", " |Валет крести| ", " |Дама крести| ", " |Король крести| ", " |Туз крести| "
            )
    );
    Random random = new Random();

    public String getCard()
    {
        int randomCard = random.nextInt(0, cards.size() - 1);
        String card = cards.get(randomCard);
        cards.remove(randomCard);
        return card;

    }
    public String getDeck()
    {
        if (cards.size() < 5) return "";

        StringBuilder deck = new StringBuilder();
        for (int i = 0; i < 5; i++)
            deck.append(getCard());
        return deck.toString();
    }
}

