/*Zadanie 3 wykonane zostalo przez:
* Filip Bianga
* Aleksander Ostasz*/

package Zadanie3;

import java.lang.Math;

public class Trojkat
{
    private double bokA;
    private double bokB;
    private  double bokC;

    public Trojkat(double bokA, double bokB, double bokC)
    {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }

    public double getPerimetr()
    {
        return bokA+bokB+bokC;
    }
    public double isEquilateral()
    {
        if (bokA==bokB && bokA==bokC)
        {
            return (Math.pow(bokA, 2)*Math.sqrt(3))/4;
        }
        else return 0;
    }

    public double  isIsosceles()
    {
        if (bokC==bokB && bokC!=bokA)
        {
            return 0.5*bokA*(Math.sqrt((Math.pow(bokB, 2) - 0.25*Math.pow(bokA, 2))));
        }
        else return 0;
    }
    public double isScalene()
    {
        if (bokC!=bokB)
        {
            double p = (bokA+bokB+bokC)/2;
            return Math.sqrt((p*(p - bokA)*(p - bokB)*(p - bokC)));
        }
        else return 0;
    }

    public String toString()
    {
        return "bok A: " + bokA + ", bok B: " + bokB + ", bok C: " + bokC + ", Obwod: " + getPerimetr() + ", Pole tr. rownobocznego: " + isEquilateral() + ", Pole tr. rownoramiennego: " + isIsosceles() + ", Pole tr. roznobocznego: " + isScalene();
    }

    public static void main(String [] args)
    {
        Trojkat trojkat = new Trojkat(4,5,5);
        System.out.println(trojkat);
    }
}
