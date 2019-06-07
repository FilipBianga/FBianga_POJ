/*Zadanie 1: MovableRectangle
 * Wykonali:
 * Filip Bianga
 * Wykonalem zadania sam gdyz nie bylo mnie na zajeciach*/

public class MovablePoint implements Movable{
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        return String.format("X i Y (%1$d, %2$d), xSpeed = %3$d, ySpeed = %4$d"
                , x, y, xSpeed, ySpeed);
    }

    @Override

    public void moveUp(){
        y -= ySpeed;
    }

    @Override
    public void moveDown(){
        y += ySpeed;
    }

    @Override
    public void moveRight(){
        x += xSpeed;
    }

    @Override
    public void moveLeft(){
        x -= xSpeed;
    }
}
