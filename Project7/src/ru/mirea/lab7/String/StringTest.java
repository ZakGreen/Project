package ru.mirea.lab7.String;

public class StringTest implements IntString
{

    @Override
    public int countSymbols(java.lang.String string)
    {
        return string.length();
    }

    @Override
    public java.lang.String getNewStringFromString(java.lang.String string)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int counter = 0; counter < string.length(); counter++)
        {
            if((counter + 1) % 2 == 0)
                continue;

            stringBuilder.append(string.toCharArray()[counter]);
        }
        return stringBuilder.toString();
    }

    @Override
    public java.lang.String invertString(java.lang.String string)
    {
        char[] text = string.toCharArray();

        char temp = ' ';
        int sortedStrings = 0;
        for (int counter = 0; counter < text.length/2; counter++)
        {
            temp = text[text.length - 1 - sortedStrings];
            text[text.length - 1 - sortedStrings] = text[counter];
            text[counter] = temp;

            sortedStrings++;
        }
        StringBuilder stringBuilder = new StringBuilder();

        for(char symbol : text)
        {
            stringBuilder.append(symbol);
        }

        return stringBuilder.toString();
    }
}
