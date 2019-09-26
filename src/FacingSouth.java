import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;


public class FacingSouth {
    public static void main (String[] args){
        City china = new City();
        Robot karel = new Robot(china, 0, 0, Direction.SOUTH, 1);
        Robot carl = new Robot(china, 0, 3, Direction.SOUTH, 0);
        //larel move to carl
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.putThing();
        //carl got the thing
        carl.pickThing();
        carl.move();
        carl.move();
        carl.putThing();
        //karel move back
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        //carl move back
        carl.turnLeft();
        carl.turnLeft();
        carl.move();
        carl.move();
        carl.turnLeft();
        carl.turnLeft();
    }
}
