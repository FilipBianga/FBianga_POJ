/*Zadanie zostało wykonane przez:
 * -Filip Bianga
 * -Z druga osoba pracowalem lecz nie przedstawilismy sie sobie*/

package Main;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc,int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this. qty =qty;
        this. unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return unitPrice*qty;
    }

    public String toString(){
        return "InvoiceItem[id = " + getId() + ", desc = " + getDesc() + ", qty = " + getQty() + ", unitPrice = " + getUnitPrice() + " zl";
    }


}
