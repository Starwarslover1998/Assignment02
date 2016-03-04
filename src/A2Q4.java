
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fostp4040
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City Kitchener = new City();
    Robot karel = new Robot(Kitchener, 0,2, Direction.SOUTH);
    Robot tina = new Robot(Kitchener, 0,2, Direction.SOUTH);
    new Wall(Kitchener, 0,0, Direction.WEST);
    new Wall(Kitchener, 1,0, Direction.WEST);
    new Wall(Kitchener, 2,0, Direction.WEST);
    new Wall(Kitchener, 3,0, Direction.WEST);
    new Wall(Kitchener, 4,0, Direction.WEST);
    new Wall(Kitchener, 5,0, Direction.WEST);
    new Wall(Kitchener, 6,0, Direction.WEST);
    new Wall(Kitchener, 7,0, Direction.WEST);
    new Wall(Kitchener, 8,0, Direction.WEST);
    new Wall(Kitchener, 9,0, Direction.WEST);
    new Wall(Kitchener, 0,1, Direction.EAST);
    new Wall(Kitchener, 1,1, Direction.EAST);
    new Wall(Kitchener, 2,1, Direction.EAST);
    new Wall(Kitchener, 3,1, Direction.EAST);
    new Wall(Kitchener, 4,1, Direction.EAST);
    new Wall(Kitchener, 5,1, Direction.EAST);
    new Wall(Kitchener, 6,1, Direction.EAST);
    new Wall(Kitchener, 7,1, Direction.EAST);
    new Wall(Kitchener, 8,1, Direction.EAST);
    new Wall(Kitchener, 9,1, Direction.EAST);
    new Wall(Kitchener, 0,2, Direction.EAST);
    new Wall(Kitchener, 3,2, Direction.EAST);
    new Wall(Kitchener, 5,2, Direction.EAST);
    new Wall(Kitchener, 6,2, Direction.EAST);
    new Wall(Kitchener, 9,2, Direction.EAST);
    new Wall(Kitchener, 1,3, Direction.NORTH);
    new Wall(Kitchener, 1,4, Direction.NORTH);
    new Wall(Kitchener, 1,5, Direction.NORTH);
    new Wall(Kitchener, 1,6, Direction.NORTH);
    new Wall(Kitchener, 1,6, Direction.EAST);
    new Wall(Kitchener, 2,6, Direction.EAST);
    new Wall(Kitchener, 2,6, Direction.SOUTH);
    new Wall(Kitchener, 2,5, Direction.SOUTH);
    new Wall(Kitchener, 2,4, Direction.SOUTH);
    new Wall(Kitchener, 2,3, Direction.SOUTH);
    new Wall(Kitchener, 4,3, Direction.NORTH);
    new Wall(Kitchener, 4,4, Direction.NORTH);
    new Wall(Kitchener, 4,5, Direction.NORTH);
    new Wall(Kitchener, 4,5, Direction.EAST);
    new Wall(Kitchener, 4,5, Direction.SOUTH);
    new Wall(Kitchener, 4,4, Direction.SOUTH);
    new Wall(Kitchener, 4,3, Direction.SOUTH);
    new Wall(Kitchener, 7,3, Direction.NORTH);
    new Wall(Kitchener, 7,4, Direction.NORTH);
    new Wall(Kitchener, 7,5, Direction.NORTH);
    new Wall(Kitchener, 7,6, Direction.NORTH);
    new Wall(Kitchener, 7,7, Direction.NORTH);
    new Wall(Kitchener, 7,7, Direction.EAST);
    new Wall(Kitchener, 8,7, Direction.EAST);
    new Wall(Kitchener, 8,7, Direction.SOUTH);
    new Wall(Kitchener, 8,6, Direction.SOUTH);
    new Wall(Kitchener, 8,5, Direction.SOUTH);
    new Wall(Kitchener, 8,4, Direction.SOUTH);
    new Wall(Kitchener, 8,3, Direction.SOUTH);
    new Wall(Kitchener, 9,2, Direction.SOUTH);
    new Thing(Kitchener, 0,1);
    new Thing(Kitchener, 1,0);
    new Thing(Kitchener, 2,0);
    new Thing(Kitchener, 3,0);
    new Thing(Kitchener, 3,1);
    new Thing(Kitchener, 4,0);
    new Thing(Kitchener, 5,1);
    new Thing(Kitchener, 7,0);
    new Thing(Kitchener, 7,1);
    new Thing(Kitchener, 8,1);
    new Thing(Kitchener, 9,0);
    new Thing(Kitchener, 9,1);
    new Thing(Kitchener, 1,2);
    new Thing(Kitchener, 1,3);
    new Thing(Kitchener, 1,4);
    new Thing(Kitchener, 1,5);
    new Thing(Kitchener, 2,2);
    new Thing(Kitchener, 2,4);
    new Thing(Kitchener, 2,6);
    new Thing(Kitchener, 4,2);
    new Thing(Kitchener, 4,3);
    new Thing(Kitchener, 4,4);
    new Thing(Kitchener, 7,2);
    new Thing(Kitchener, 7,3);
    new Thing(Kitchener, 7,7);
    new Thing(Kitchener, 8,3);
    new Thing(Kitchener, 8,4);
    new Thing(Kitchener, 8,6);
    new Thing(Kitchener, 0,3);
    new Thing(Kitchener, 0,4);
    new Thing(Kitchener, 0,6);
    new Thing(Kitchener, 1,7);
    new Thing(Kitchener, 3,4);
    new Thing(Kitchener, 3,6);
    new Thing(Kitchener, 4,6);
    new Thing(Kitchener, 4,7);
    new Thing(Kitchener, 5,5);
    new Thing(Kitchener, 5,7);
    new Thing(Kitchener, 6,4);
    new Thing(Kitchener, 6,6);
    new Thing(Kitchener, 9,3);
    new Thing(Kitchener, 9,4);
    new Thing(Kitchener, 9,6);
    
    while(karel.frontIsClear())
    {
        karel.move();
        karel.turnLeft();
        if(karel.frontIsClear())
        {
            karel.move();
        }
        else{
            karel.turnLeft();
        }
        
        if(karel.canPickThing())
        {
            karel.pickThing();
        }
        else{
            karel.move();
        }
    }
    }
}
