/*Zadanie 2: Circle and ResizableCircle
 * Wykonali:
 * Filip Bianga
 * Wykonalem zadania sam gdyz nie bylo mnie na zajeciach*/

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public void resize(int percent){
        radius *= percent/100.0;
    }
}
