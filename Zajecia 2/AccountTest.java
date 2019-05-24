/*Zadanie zostało wykonane przez:
 * -Filip Bianga
 * -Z druga osoba pracowalem lecz nie przedstawilismy sie sobie*/

package Main;

public class AccountTest {
    public static void main (String [] args){
        Account another = new Account("#4234", "Grzegorz");
        Account another1 = new Account("$32234", "Henia", 3242);

        another.credit(500);
        another.debit(400);
        another.transferTo(another, 432);
        System.out.println(another.transferTo(another,432));

        another1.credit(500);
        another1.debit(400);
        another1.transferTo(another, 432);
        System.out.println(another1.transferTo(another1,432));
    }
}
