/*Zadanie 2: Circle and ResizableCircle
 * Wykonali:
 * Filip Bianga
 * Wykonalem zadania sam gdyz nie bylo mnie na zajeciach*/

public class TestCircle {

    public static void main(String [] args){
        GeometricObject go1 = new Circle(3);
        System.out.println(go1);
        System.out.println("Obwod = " + go1.getPerimeter());
        System.out.println("Powierzchnia = " + go1.getArea());
    }
}
