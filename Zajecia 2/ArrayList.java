/*Zadanie zostało wykonane przez:
 * -Filip Bianga
 * -Z druga osoba pracowalem lecz nie przedstawilismy sie sobie*/

package Main;


import java.util.List;

public class ArrayList {
    public static void main (String[] args){
        List<String> name = new java.util.ArrayList<String>();
        name.add("Agata");
        name.add("Patrycja");
        name.add("Mateusz");
        name.add("Agnieszka");
        name.add("Marcin");
        name.add("Szymon");
        name.add("Adrian");
        name.add("Zaneta");

        List<String> salary = new java.util.ArrayList<String>();
        salary.add("2630");
        salary.add("2130");
        salary.add("3200");
        salary.add("2450");
        salary.add("2900");
        salary.add("4200");
        salary.add("2220");
        salary.add("2100");

        List<String> date = new java.util.ArrayList<String>();
        date.add("14/04/2012");
        date.add("16/07/2011");
        date.add("05/12/2014");
        date.add("24/09/2015");
        date.add("20/03/2015");
        date.add("19/11/2016");
        date.add("30/05/2009");
        date.add("02/02/2017");

        for(int i=0; i<name.size(); i++){
            System.out.println(name.get(i) + " " + salary.get(i) + " ");
            System.out.println(date.get(i));
        }
    }

}
