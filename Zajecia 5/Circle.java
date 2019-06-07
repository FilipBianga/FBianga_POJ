/*Zadanie 2: Circle and ResizableCircle
 * Wykonali:
 * Filip Bianga
 * Wykonalem zadania sam gdyz nie bylo mnie na zajeciach*/

public class Circle implements GeometricObject {

    protected double radius = 1.0;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea(){
        return radius * radius * Math.PI;
    }

    public String toString() {
        return String.format("Promien okregu = %1$f", radius);
    }
}
