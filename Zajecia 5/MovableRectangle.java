/*Zadanie 1: MovableRectangle
 * Wykonali:
 * Filip Bianga
 * Wykonalem zadania sam gdyz nie bylo mnie na zajeciach*/

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;

    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString() {
        return String.format("Gorna lewa strona: %1$s , Dolna prawa strona: %2$s"
                , topLeft.toString(), bottomRight.toString());
    }

    @Override
    public void moveUp(){
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveDown(){
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveLeft(){
        topLeft.x -= topLeft.ySpeed;
        bottomRight.x -= bottomRight.ySpeed;
    }

    @Override
    public void moveRight(){
        topLeft.x += topLeft.ySpeed;
        bottomRight.x += bottomRight.ySpeed;
    }
}

