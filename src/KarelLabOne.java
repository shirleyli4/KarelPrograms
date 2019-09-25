import becker.robots.*;

public class KarelLabOne {

    public static void main(String[] args) {

        City ssfs = new City();

        Robot karel = new Robot(ssfs,3, 2, Direction.EAST, 0);

        Thing thing1 = new Thing(ssfs, 1, 4);
        Thing thing2 = new Thing(ssfs, 2, 4);
        Thing thing3 = new Thing(ssfs, 3, 4);
        Thing thing4 = new Thing(ssfs, 4, 4);
        Thing thing5 = new Thing(ssfs, 5, 4);

        // Your code goes below these lines.
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.putThing();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.putThing();
    }
}
