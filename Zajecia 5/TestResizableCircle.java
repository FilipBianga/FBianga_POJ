/*Zadanie 2: Circle and ResizableCircle
 * Wykonali:
 * Filip Bianga
 * Wykonalem zadania sam gdyz nie bylo mnie na zajeciach*/

public class TestResizableCircle {

    public static void main (String [] args){
        Resizable go2 = new ResizableCircle(8);
        System.out.println(go2);
        go2.resize(35);
        System.out.println(go2);

        GeometricObject go3 = (GeometricObject) go2;
        System.out.println(go3);
        System.out.println("Obwod = " + go3.getPerimeter());
        System.out.println("Powierzchnia = " + go3.getArea());
    }
}
