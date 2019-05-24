/*Zadanie1 zostalo wykonane przez:
* Filip Bianga
* Aleksander Ostasz*/

package main;

import java.lang.Math;

public class Human
{
    private int age;
    private double weight;
    private double height;
    private String name;
    private String male;
    private int feet;
    private int index;

    public Human (String name, int age, String male, double height, double weight, int feet, int index)
    {
        this.name = name;
        this.age = age;
        this.male = male;
        this.height = height;
        this.weight = weight;
        this.feet = feet;
        this.index = index;

    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String isMale()
    {
        return male;
    }
    public double getHeight()
    {
        return height;
    }
    public double getWeight()
    {
        return weight;
    }
    public int getFeet_Size()
    {
        return feet;
    }
    public int getIndex()
    {
        return index;
    }

    public String toString()
    {
        return "Imie: " + getName() + ", Wiek: " + getAge() + ", Plec: " + isMale() + ", Wzrost: " + getHeight() + ", Waga: " + getWeight() + ", Rozmiar stopy: " + getFeet_Size() + ", Nr.Indeksu: " + getIndex();
    }

    public static void main (String[] args)
    {
        Human Filip = new Human("Filip", 25, "mezczyzna", 182,68, 45, 19329);
        System.out.println(Filip);
        Human Aleksander = new Human("Aleksander", 19, "mezczyzna", 185,70, 42, 19770);
        System.out.println(Aleksander);


    }
}