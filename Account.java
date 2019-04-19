/*Zadanie zostało wykonane przez:
* -Filip Bianga
* -Z druga osoba pracowalem lecz nie przedstawilismy sie sobie*/

package Main;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance = balance + amount;
        return balance;
    }

    public int debit(int amount){
        if (amount <= balance)
        {
            return balance - amount;
        }
        else
        {
            System.out.println("Ammount exceeded balance");
            return balance;
        }
    }

    public int transferTo(Account another, int amount){
        if (amount <= balance) {
            debit(amount);
            another.credit(amount);
            return another.getBalance();
        }
        else {

            System.out.println("Ammount exceeded balance");
            return balance;
        }
    }

    public String toString(){
        return "Account[id = " + getId() + ",name = " + getName() + ",balance = " + getBalance();
    }
}
