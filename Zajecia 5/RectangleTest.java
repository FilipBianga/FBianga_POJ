/*Zadanie 1: MovableRectangle
 * Wykonali:
 * Filip Bianga
 * Wykonalem zadania sam gdyz nie bylo mnie na zajeciach*/

public class RectangleTest {
    public static void main(String [] args){
        Movable m1 = new MovablePoint(5,6,11,21);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableRectangle(3,4,5,2, 11,12);
        System.out.println(m2);
        m2.moveUp();
        System.out.println(m2);
    }
}
