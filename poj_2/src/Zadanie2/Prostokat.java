/*Zadanie2 zostalo wykonane przez:
* Filip Bianga
* Aleksander Ostasz*/

package Zadanie2;

import java.lang.Math;

public class Prostokat
{
    private double bokA;
    private double bokB;

    public Prostokat (double bokA, double bokB)
    {
        this.bokA = bokA;
        this.bokB = bokB;
    }


    public double getArea()
    {
        return 2*(bokA+bokB);
    }
    public double getPerimetr()
    {
        return bokA*bokB;
    }
    public double getDiagonal()
    {
        return Math.sqrt(Math.pow(bokA, 2) + Math.pow(bokB, 2));
    }


    public String toString()
    {
        return "Bok A wynosi: " + bokA + ", Bok B wynosi: " +bokB + ", Obwod wynosi: " + getArea() + ", Pole wynosi: " + getPerimetr() + ", Przekatna wnosi: " + getDiagonal();
    }

    public static void main (String[] args)
    {
        Prostokat figura = new Prostokat(5, 7);
        System.out.println(figura);
    }
}
