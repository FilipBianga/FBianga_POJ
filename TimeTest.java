/*Zadanie zostało wykonane przez:
 * -Filip Bianga
 * -Z druga osoba pracowalem lecz nie przedstawilismy sie sobie*/

package Main;

public class TimeTest {
    public static void main (String [] args){
        Time czas1 = new Time (21,17,34);
        System.out.println(czas1);
        Time czas2 = new Time (14,05,12);
        System.out.println(czas2);

        czas1.setHour(6);
        czas1.setMinute(45);
        czas1.setSecond(43);
        System.out.println(czas1);
        System.out.println("Godzina: " + czas1.getHour());
        System.out.println("Minuta: " + czas1.getMinute());
        System.out.println("Sekunda: " + czas1.getSecond());

        czas1.setTime(23,33,34);
        System.out.println(czas1);

        System.out.println(czas1.nextSecond());
        System.out.println(czas1.nextSecond().nextSecond());
        System.out.println(czas1.previousSecond());
        System.out.println(czas1.previousSecond().previousSecond());
    }
}
