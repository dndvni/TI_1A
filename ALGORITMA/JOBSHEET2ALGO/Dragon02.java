package JOBSHEET2ALGO;

public class Dragon02 {
    
    int x, y, width, height;

    void moveLeft(){
        x -= 1;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    void moveRight() {
        x += 1;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    void moveUp() {
        y -= 1;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    void moveDown() {
        y += 1;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    void printPosition() {
        System.out.print("your position now");
        System.out.println("(" + x + ", " + y + ")");
    }

    void detectCollision() {
        System.out.println("Game Over");
        System.exit(0);
    }
}