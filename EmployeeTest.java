/*Zadanie zostało wykonane przez:
 * -Filip Bianga
 * -Z druga osoba pracowalem lecz nie przedstawilismy sie sobie*/

package Main;

public class EmployeeTest {
    public static void main(String[] args)
    {
        Employee Janusz = new Employee(19329, "Janusz", "Kowal", 2500);
        System.out.println(Janusz.raiseSalary(10));
        System.out.println(Janusz.toString());
    }
}
