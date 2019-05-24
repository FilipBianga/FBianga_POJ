/*Zadanie zostało wykonane przez:
 * -Filip Bianga
 * -Z druga osoba pracowalem lecz nie przedstawilismy sie sobie*/

package Main;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj zdanie/wyraz, który mam sprawdzić: ");

        String wyraz = scan.nextLine();
        String zdanie = wyraz.replaceAll(" ", "");
        int l = zdanie.length();

        int k = 0;
        int j = (l - 1);

        for (int i = 0; i < l; i++){
            if (zdanie.charAt(i) != zdanie.charAt(j)){
                k = 1;
                break;
            }
            j--;
        }
        if (k == 1)
            System.out.println("Nie jest to palindrom");
        else
            System.out.println("Jest to palindrom");
    }
}
