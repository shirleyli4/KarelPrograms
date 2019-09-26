import becker.robots.*;

public class KarelFigureEight {

    public static void main(String[] args) {

        City ssfs = new City();

        Robot karel = new Robot(ssfs,5, 3, Direction.NORTH, 0);

        Thing thing1 = new Thing(ssfs, 2, 3);
        Thing thing2 = new Thing(ssfs, 4, 3);

        // Your code goes below here
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
    }
}
