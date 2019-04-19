/*Zadanie zostało wykonane przez:
 * -Filip Bianga
 * -Z druga osoba pracowalem lecz nie przedstawilismy sie sobie*/

package Main;

public class InvoiceItemTest {
    public static void main(String[] args){
        InvoiceItem faktura = new InvoiceItem("Grupa OSA","iPhone 6", 4, 1100);
        System.out.println(faktura);
        System.out.println(faktura.getTotal());
    }
}
