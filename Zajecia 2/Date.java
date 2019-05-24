/*Zadanie zostało wykonane przez:
 * -Filip Bianga
 * -Z druga osoba pracowalem lecz nie przedstawilismy sie sobie*/

package Main;

public class Date {
    private int day;
    private int month;
    private  int year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year){
        setDay(8);
        setMonth(12);
        setYear(2019);
    }

    public String toString(){
        String padded1 = String.format("%02d" , day);
        String padded2 = String.format("%02d" , month);
        return padded1 + "/" + padded2 + "/" + getYear();
    }
}
