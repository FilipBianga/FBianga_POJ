/*Zadanie 4 wykonane zostalo przez:
 * Filip Bianga
 * Aleksander Ostasz*/

package Zadanie4;

import java.lang.Math;


public class Cezar {

    public static void main(String[] args) {
        String alf = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String imie1 = "Filip Bianga";
        String imie2 = "Aleksander Ostasz";
        int distance = 3;
        System.out.println(szyfr1(imie1, alf, distance));
        System.out.println(szyfr2(imie2, alf, distance));


    }

    public static String szyfr1(String tekst, String alfabet, int dystans) {
        String wynik = "";
        for (int i = 0; i < tekst.length(); i++)
            for (int j = 0; j < alfabet.length(); j++)
                if (tekst.charAt(i) == alfabet.charAt(j))
                    wynik += alfabet.charAt((j + dystans) % alfabet.length());

        return wynik;
    }

    public static String szyfr2(String tekst, String alfabet, int dystans) {
        String wynik = "";
        for (int i = 0; i < tekst.length(); i++)
            for (int j = 0; j < alfabet.length(); j++)
                if (tekst.charAt(i) == alfabet.charAt(j))
                    wynik += alfabet.charAt((j + dystans) % alfabet.length());

        return wynik;
    }
}