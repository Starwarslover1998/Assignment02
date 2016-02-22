
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
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City Kitchener = new City();
    
        Robot karel = new Robot(Kitchener, 1, 1, Direction.EAST);
        new Thing(Kitchener, 1,2);
        new Thing(Kitchener, 1,3);
        new Thing(Kitchener, 1,4);
        new Thing(Kitchener, 1,5);
        new Thing(Kitchener, 1,6);
        new Thing(Kitchener, 1,7);
        new Thing(Kitchener, 1,8);
        new Thing(Kitchener, 1,9);
        new Thing(Kitchener, 1,10);
        new Thing(Kitchener, 1,11);
        karel.move();
    if(karel.canPickThing())
    {
        karel.pickThing();
    }
    else{
       
        karel.move();
    }
    karel.move();
    if(karel.canPickThing())
    {
        karel.pickThing();
    }
    else{
       
        karel.move();
    }
    karel.move();
    if(karel.canPickThing())
    {
        karel.pickThing();
    }
    else{
       
        karel.move();
    }
    karel.move();
    if(karel.canPickThing())
    {
        karel.pickThing();
    }
    else{
       
        karel.move();
    }
    karel.move();
    if(karel.canPickThing())
    {
        karel.pickThing();
    }
    else{
       
        karel.move();
    }
    karel.move();
    if(karel.canPickThing())
    {
        karel.pickThing();
    }
    else{
       
        karel.move();
    }
    karel.move();
    if(karel.canPickThing())
    {
        karel.pickThing();
    }
    else{
       
        karel.move();
    }
    karel.move();
    karel.move();
    karel.move();
    karel.move();
    }
}
    
