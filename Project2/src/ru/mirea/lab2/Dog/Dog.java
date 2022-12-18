package ru.mirea.lab2.Dog;

public class Dog
{
    private String name;
    private int age;

    Dog (String name, int age)
    {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setName(String breed) {
        this.name = name;
    }

    public int HumanYears() {
        return age * 7;
    }

    @Override
    public String toString()
    {
        return "Собака: Кличка - " + name + ", возраст - " + age + ", возраст в человеческом формате - " + this.HumanYears();
    }
}
